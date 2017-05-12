package me.feathers.base;

/**
 * 题目：
 * 	输入一个十进制数，将其转换为2进制数进行输出 1. 返回String类型 2. 返回Long类型
 * @author Feathers
 * @date 2017年4月8日
 */
@SuppressWarnings("all")
public class Dec2BinDemo {

	public static void main(String[] args) {
		System.out.println(method1(10));
	}
	
	// 10  1010   10/2=5 0  5/2=2 1  2/2=1 0 1/2=0 1 
	public static String method1(int n){
		String s = "";
		while(true){
			s= n%2 + s;
			if ((n /= 2) == 0)
				break;
		}
		return s;
	}
}
