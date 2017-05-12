package me.feathers.base;

/**
 * 题目：
 * 	传入一个整数，判断这个整数是几位数。比如：输入250，得到你输入的数是3位数。并逆序输出这个数
 * @author Feathers
 * @date 2017年4月7日
 */
@SuppressWarnings("all")
public class NumBitsDemo {
	
	public static void main(String[] args) {
		System.out.println(getNumBits(0));
		System.out.println(method1(1234));
	}
	
	// 获取一个数是几位数：方法一
	private static int getNumBits(int num){
		int count = 0;
		while (num > 0){
			num = num / 10;
			count++;
		}
		return count;
	}
	
	// 获取一个数是几位数：方法二
	private static int getNumBits2(int num){
		int count = 0;
		while (Math.pow(10, count) <= num){
			count++;
		}
		return count;
	}

	// 获取一个数是几位数：方法三
	private static int getNumBits3(int num){
		int count = 0;
		for (long i = num; i > 0; i /= 10)
			count++;
		return count;
	}
	
	// 获取一个数是几位数：方法四 字符串
	private static int getNumBits4(int num){
		return num==0 ? 0 : String.valueOf(num).length();
	}
	
	// 逆序输出一个数
	// 方法一：250  = 0*100 + 5*10 + 2*1
	private static int  method1(int num){
		int bits = getNumBits(num);
		int temp = 0;
		for (int i = bits-1; i >= 0; i--){
			int last = num %  10;
			temp += (last * Math.pow(10, i));
			num /= 10;
		}
		return temp;
	}
}
