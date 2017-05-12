package me.feathers.base;

/**
 * 题目：
 * 	打印出所有的 "自幂数 "
 * @author Feathers
 * @date 2017年4月8日
 */
@SuppressWarnings("all")
public class SelfDemo {

	public static void main(String[] args) {
		method1(5);
	}
	
	private static void method1(int n){

		for (long i = 100; i < Math.pow(10, n); i++) {
			// 计算一个数的位数
			int time = 0;
			for (long j = i; j > 0; j = j / 10) {
				time++;
			}
			long result = 0;
			for (long j = i; j > 0; j = j / 10) {
				result += Math.pow(j % 10, time);
			}
			if (result == i) {
				System.out.println(i);
			}
		}
	}

	private static int getNumBits(int i) {
		return String.valueOf(i).length();
	}
}
