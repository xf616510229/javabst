package me.feathers.basex;

import java.util.LinkedList;
import java.util.Scanner;
import java.util.Stack;

/**
 * 题目：<br>
 * 在控制台输入括号,然后通过程序判断是否匹配.
 * 匹配的情况就是要求括号要一一对应,不能错位.
 * 比如匹配成功的:()[]{}或者([]){}或者([{}])等
 * 匹配失败的:([)}[]或者[({)}]等...
 * 启动程序:
 * 请您输入括号:>()[]{}
 * 匹配成功!
 * 请您输入括号:>[{]}
 * 匹配失败!
 * 
 * @author Feathers
 * @version 1.0
 * @date: 2017:03:16
 */
public class MatcherDemo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("请输入要匹配的括号：");
		String s = sc.nextLine();
		sc.close();
		if (prase2(s)){
			System.out.println("匹配成功");
		} else {
			System.out.println("匹配失败");
		}
	}

	/**
	 * 对括号字符串进行解析
	 * 
	 * @param s
	 */
	public static void parse(String s) {
		// 将字符串拆分为字符数组
		char[] cs = s.toCharArray();
		
		Stack<Character> al = new Stack<>();
		
		// 对字符数组进行遍历
		for (int i = 0; i < cs.length; i++) {
			
			System.out.println("匹配" + cs[i] +"中");

			// 如果当前括号是左括号
			if (judge(cs[i]) % 2 == 1 && judge(cs[i])!= 0) {
				al.push(cs[i]);// 左括号压入栈顶
			} else if (judge(cs[i]) % 2 == 0 && judge(cs[i])!= 0) { // 如果当前括号是右括号
				// 匹配栈顶左括号
				char anthor = find(cs[i]);
				System.out.println(anthor);
				
				if (al.empty()){
					System.out.println("sorry  你的括号不匹配");
					return;
				}
				char last = al.peek();
				if (last != anthor){
					System.out.println("sorry  你的括号不匹配");
					return;
				} else {
					// 将匹配完的括号移除栈顶
					al.pop();
				}
			} else {
				// 如果既不是左括号也不是右括号则不操作
			}
		}
		
		if (al.size() == 0){
			System.out.println("括号匹配成功");
		} else {
			System.out.println("括号匹配失败" + al.size());
		}
	}

	/**
	 * 判断字符是左括号还是右括号
	 * 
	 * @param c
	 * @return 奇数为左括号 偶数右括号 0则不是括号
	 */
	public static int judge(char c) {
		switch (c) {
		case '(':
			return 1;
		case ')':
			return 2;
		case '[':
			return 3;
		case ']':
			return 4;
		case '{':
			return 5;
		case '}':
			return 6;
		default:
			return 0;
		}
	}
	
	/**
	 * 寻找匹配括号
	 * @param v
	 * @return
	 */
	public static char find(char c) {
		switch (c) {
		case '(':
			return ')';
		case ')':
			return '(';
		case '[':
			return ']';
		case ']':
			return '[';
		case '{':
			return '}';
		case '}':
			return '{';
		default:
			return 0;
		}
	}
	
	// 第二种方式
	// 这种方式不需要判断当前括号是左括号还是右括号
	private static boolean prase2(String s){
		char[] cs = s.toCharArray();
		LinkedList<Character> ll = new LinkedList<>();
		for(int i = 0; i < cs.length; i++){
			if (ll.size() == 0){
				ll.push(cs[i]);
				continue;
			}
			
			Character c1 = ll.peek();
			Character c2 = cs[i];
			if ((c1.equals('{') && c2.equals('}')) ||  
					(c1.equals('[') && c2.equals(']')) ||
					(c1.equals('(') && c2.equals(')'))){
				ll.pop();
			} else {
				ll.push(c2);
			}
		}
		System.out.println(ll.toString());
		
		return ll.isEmpty();
	}
}

/**
 * 
 * 思路： <a href=
 * "http://www.cnblogs.com/stay-foolish/archive/2012/05/01/2477906.html">参考</a>
 * 
 * 寻找括号，
 * 发现左括号，放置栈顶
 * 发现右括号，与栈顶的左括号进行匹配
 * 匹配成功，则成功，从栈顶移除这个左括号，继续遍历
 * 如果没有栈顶元素，或者与栈顶元素不匹配，则失败
 * 遍历结束，如果栈中还有左括号，则匹配失败，否则成功
 * 
 * 数据结构使用Stack：
 * boolean empty() 测试堆栈是否为空。 
 * E peek() 查看堆栈顶部的对象，但不从堆栈中移除它。 
 * E pop() 移除堆栈顶部的对象，并作为此函数的值返回该对象。 
 * E push(E item) 把项压入堆栈顶部。 
 * int search(Object o) 返回对象在堆栈中的位置，以 1 为基数。 
 * 
 **/

// {}[{]}
