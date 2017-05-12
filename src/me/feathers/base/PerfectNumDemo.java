package me.feathers.base;

/**
 * 题目：
 * 	某自然数除它本身以外的所有因子之和等于该数，则该数被称为完数。 
 * 	例如6=1＋2＋3.编程   找出1000以内的所有完数
 * @author Feathers
 * @date 2017年4月7日
 */
public class PerfectNumDemo {

	public static void main(String[] args) {
		method1();
	}

	private static void method1() {
		for (int i = 1; i < 1000; i++){
			int temp = 0;
			for (int j = 1; j < i; j++) {
				if (i % j == 0)
					temp += j;
			}
			if (temp == i)
				System.out.print(i+"\t");
		}
	}
}
