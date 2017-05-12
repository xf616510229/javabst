package me.feathers.base;

/**
 * 题目：
 * 	打印101-200之间的质数（只能被1和自己整除的数）
 * @author Feathers
 * @date 2017年4月7日
 */
public class PrimeDemo {

	public static void main(String[] args) {
		method1();
	}
	
	// 方法一：循环、取余、标记
	private static void method1(){
		for (int i = 101; i < 200; i++){
			boolean flag = true;
			for (int j = 2; j < Math.sqrt(i); j++){
				if (i % j == 0)
					flag = false;
			}
			
			if (flag){
				System.out.print(i+"\t");
			}
		}
	}

}
