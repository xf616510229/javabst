package me.feathers.base;

/**
 * 题目：
 * 	求两个数的最大公约数和最小公倍数
 * @author Feathers
 * @date 2017年4月7日
 */
public class LcdLcmDemo {

	public static void main(String[] args) {
		System.out.printf("%d和%d的最大公约数为%d，最小公倍数为%d", 20, 30, getDivisor2(20, 30), getMultiple(20, 30));
	}
	
	// 获取两个数的最大公约数
	private static int getDivisor(int a, int b){
		 int min = a < b ? a : b;
		 for (int i = min; i >= 1; i--) {
			if (a % i == 0 && b % i == 0){
				return i;
			}
		}
		 return -1;
	}
	
	/**
	 * 方法二：辗除法+递归
	 * 20%12=8   
	 * 12%8=4	  
	 * 8%4=0
	 */
	public static int getDivisor2(int m,int n){
		return m%n==0 ? n : getDivisor2(n, m%n);
	}
	
	// 获取两个数的最小公倍数
	// 两个数的乘积等于这两个数的最大公约数与最小公倍数的乘积。
	private static int getMultiple(int a, int b) {
		return a * b / getDivisor(a, b);
	}
}