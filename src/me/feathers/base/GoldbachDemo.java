package me.feathers.base;

/**
 * 题目： 
 * 	歌德巴赫猜想,任何一个大于六的偶数可以拆分成两个质数的和 打印出所有的可能
 * @author Feathers
 * @date 2017年4月7日
 */
public class GoldbachDemo {

	public static void main(String[] args) {
		method1(20);
	}
	
	public static void method1(int n){
		for (int i = 2; i <= n/2; i++){
			if (isPrime(i) && isPrime(n-i)){
				System.out.println(i+"+"+(n-i) + "=" + n);
			}
		}
	}

	public static boolean isPrime(int num){
		for (int i = 2; i < Math.sqrt(num); i++){
			if (num % i == 0)
				return false;
		}
		return true;
	}
}
