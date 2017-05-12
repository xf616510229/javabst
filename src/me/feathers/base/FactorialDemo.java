package me.feathers.base;

/**
 * 题目：
 * 	传入一个n，计算n！（n的阶乘），并计算1！+2！+3！....+n！
 * @author Feathers
 * @date 2017年4月7日
 */
@SuppressWarnings("all")
public class FactorialDemo {
	
	public static void main(String[] args) {
		System.out.println(sum(3)); 
	}

	// 方法一 循环
	private static int method1(int n) {
		int temp = 1;
		for (int i = n; i > 0; i--)
			temp *= i;
		return temp;
	}

	// 方法二 递归
	private static int method2(int n) {
		return n>0 ? n * method2(n-1) : 1;
	}
	
	// 递归求和
	private static int sum(int n) {
		return n > 1 ? method1(n) + sum(n-1) : method1(n);
	}
}
