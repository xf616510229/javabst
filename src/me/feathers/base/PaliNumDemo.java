package me.feathers.base;

/**
 * 题目：
 * 	 一个5位数，判断它是不是回文数。即12321是回文数，个位与万位相同，十位与千位相同。打印出所有的回文数，22，151都是回文数
 * @author Feathers
 * @date 2017年4月8日
 */
public class PaliNumDemo {

	public static void main(String[] args) {
		System.out.println(isHWS(11112));
	}

	private static boolean isHWS(int n){
		// 判断这个数是几位数
		int count = 0;
		for (int i = n; i > 0; i /= 10)
			count++;
		for (int j = 0; j < count/2; j++){
			if ((n/(int)Math.pow(10, j)%10) != 
					n/(int)Math.pow(10, count-j-1)%10)
				return false;
		}
		return true;
	}
}
