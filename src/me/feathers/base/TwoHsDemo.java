package me.feathers.base;

/**
 * 题目：
 * 	编写一个方法，输入n为偶数时，调用函数求1/2+1/4+...+1/n,当输入n为奇数时，调用函数1/1+1/3+1/5...+1/n
 * @author Feathers
 * @date 2017年4月7日
 */
public class TwoHsDemo {

	public static void main(String[] args) {
		 method1(3);
	}

	// 方法一 循环
	private static void method1(int n){
		double temp = 0;
		if (n % 2 == 0){
			for (int i = 2; i <= n; i+=2) {
				temp += 1.0/i;
			}
		} else {
			for (int i = 1; i <= n; i+=2) {
				temp += 1.0/i;
			}
		}
		System.out.println(temp);
	}
}
