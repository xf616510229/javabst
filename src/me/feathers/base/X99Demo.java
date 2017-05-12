package me.feathers.base;

/**
 * 题目：
 * 	使用一层循环打印99乘法表
 * 	思想：将双层for循环简化为单层for
 * @author Feathers
 * @date 2017年4月7日
 */
@SuppressWarnings("all")
public class X99Demo {

	public static void main(String[] args) {
		method2();
	}
	
	// 双层for 
	private static void method1(){
		for (int i = 1; i <= 9; i++){
			for (int j = 1; j <= i; j++){
				System.out.print(j + "*" + i + "=" + i*j+"\t");
			}
			System.out.println();
		}
	}
	
	// 将双层for 简化为单层for
	private static void method2(){
		for (int i = 1, j = 1; i <= 9; j++){
			System.out.print(j + "*" + i + "=" + i*j+"\t");
			if (j >= i){
				System.out.println();
				i++;
				j = 0;
			}
		}
	}
}
