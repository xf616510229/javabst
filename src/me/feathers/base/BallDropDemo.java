package me.feathers.base;

/**
 * 题目：
 * 	一球从100米高度自由落下，每次落地后反跳回原高度的一半；再落下，求它在第10次落地时，共经过多少米？
 * 	第10次反弹多高？
 * @author Feathers
 * @date 2017年4月9日
 */
public class BallDropDemo {
	// 100+50 + 50+25 + 25+12.5 + 12.5.....
	public static void main(String[] args) {
		
		double start = 100;
		double sum = 0;
		for (int i = 0; i < 10; i++)
			sum += (start+(start /= 2));
		System.out.println("第十次落地时，一共经过了"+sum+"米");
	}
}
