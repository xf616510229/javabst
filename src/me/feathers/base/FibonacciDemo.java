package me.feathers.base;

/**
 * 题目：
 * 	输入一个数据n，计算斐波那契数列(Fibonacci)的第n个值  1  1  2  3  5  8  13  21  34 规律：一个数等于前两个数之和
 * @author Feathers
 * @date 2017年4月7日
 */
@SuppressWarnings("all")
public class FibonacciDemo {

	public static void main(String[] args) {
		final int n = 5;
		System.out.println(method2(n));
	}
	
	// 方法一循环
	private static int method1(int n) {
		int pre = 1;
		int pre2 = 1;
		if (n==1 || n==2)
			return 1;
		int result = 0;
		for (int i = 0; i < n-2; i++){
			result = pre + pre2;
			pre2 = pre;
			pre = result;
		}
		return result;
	}
	
	// 方法二递归
	private static int method2(int n){
		return n==1 || n == 2 ? 1 : method2(n-1)+method2(n-2);
	}
}
