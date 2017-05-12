package me.feathers.base;

/**
 * 题目：
 * 	输入三个数，输出最大的数
 * @author Feathers
 * @date 2017年4月8日
 */
public class MaxDemo {

	public static void main(String[] args) {
		int max = method1(12,11,12);
		System.out.println(max);
	}
	
	private static int method1(int a, int b, int c){
		int max = a;
		if (max < b)
			max = b;
		if (max < c)
			max = c;
		return max;
	}
}
