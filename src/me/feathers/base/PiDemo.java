package me.feathers.base;

/**
 * 题目：
 * 	计算圆周率：PI＝4－4/3+4/5-4/7.......  打印出第一个大于3.145 小于 3.146的值
 * @author Feathers
 * @date 2017年4月7日
 */
public class PiDemo {

	public static void main(String[] args) {
		method1();
	}
	
	// 方法一 循环
	private static void method1() {
		double pi = 0;
		int count = 1;
		boolean flag = true;
		while (true) {
			if (flag)
				pi += 4.0/count;
			else 
				pi -= 4.0/count;
			flag = !flag;
			if (pi>3.145 && pi < 3.146){
				System.out.println(pi);
				break;
			}
			count += 2;
		}
	}
}
