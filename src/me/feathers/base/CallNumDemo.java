package me.feathers.base;

import java.util.Arrays;

/**
 * 题目：
 * 	熊孩子报数
 * @author Feathers
 * @date 2017年4月8日
 */
@SuppressWarnings("all")
public class CallNumDemo {

	// 3 6 9 2 7 1 8 5 10 4
	public static void main(String[] args) {
		method1();
	}
	
	private static void method1(){
		// 1 2 3 4 5 6 7 8 9 10
		// T T F T T F T T F T ...
		boolean[] flags = new boolean[10];
		Arrays.fill(flags, true);
		
		//定义一个变量,用来计数是否循环掉头...
		int i = 0;
		//定义一个变量,用来计数剩余的人数...
		int left = 10;
		//定义一个变量,用来计数报到3的出口列.
		int pos = 0;
		while(left>=1){
			int n = i;//n=2
			if(++i==10){//i=10
				i = 0;
			}
			//推测是否有资格报1-3...
			if(flags[n]){//falgs[2]
				pos++;//pos=3
				//判断是否出列...
				if(pos==3){
					pos = 0;
					flags[n] = false;//flags[2] = false
					left--;//9
					//输出出列的编号...
					System.out.println(n+1);//3
				}
			}
		}	
	}
	
	private static void method2() {
		
		// 定义一个计数器，用来记录熊孩子报数次数
		int count = 1;
		// 定义一个计数器，用来记录当前熊孩子的位置
		int pos = 0;
		// 定义一个数组，用来保存熊孩子
		int[] is = {1,2,3,4,5,6,7,8,9,10};
		// 定义一个数组，用来记录每个熊孩子是否报过三
		boolean[] bs = new boolean[10];
		// 定义一个计数器，用来记录熊孩子出列的个数
		int clcount = 0;
		while (true) {
			// 如果熊孩子没有出列
			if (!bs[pos]){
				// 报数
				System.out.println(is[pos]);
				// 如果熊孩子报三，则熊孩子出列
				if (count % 3 == 0) {
					bs[pos] = true;
					clcount++;
				}
			}
			count++;
			pos++;
			if (pos == 10)
				pos =0;
			if (clcount == 10)
				break;
		}
		
	}

}
