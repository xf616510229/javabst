package me.feathers.base;

/**
 * 题目：
 * 	有1、2、3、4个数字，能组成多少个互不相同且无重复数字的三位数？都是多少？
 * @author Feathers
 * @date 2017年4月9日
 */
public class Num1234Demo {
	
	public static void main(String[] args) {
		method1();
	}
	
	private static void method1() {
		int count = 0;
		// 百位
		for (int i = 1; i <= 4; i++){
			// 十位
			for (int j = 1; j <= 4; j++){
				if (j == i) continue;
				// 个位
				for (int k = 1; k <= 4; k++){
					if (k==i || k==j) continue;
					count++;
					System.out.print(i*100+j*10+k+"\t");
				}
			}
		}
		System.out.println("\n一共"+count+"个数字");
	}
}
