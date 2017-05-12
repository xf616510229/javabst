package me.feathers.base;

import java.util.Random;
import java.util.Scanner;

/**
 * 题目：
 * 	猜数游戏
 * @author Feathers
 * @date 2017年4月8日
 */
public class GuessNum {

	public static void main(String[] args) {
		Random random = new Random();
		int num = random.nextInt(100)+1;
		System.out.println("系统随机数已经生成！！！");
		int max = 100;
		int min = 1;
		Scanner scanner = new Scanner(System.in);
		int input = 0;
		int count = 0;
		while (true){
			System.out.printf("请您输入[%d,%d]之间的数", min, max);
			input = scanner.nextInt();
			if (input > max || input < min) {
				System.out.println("请你正常点");
				continue;
			}
			count++;
			if (input == num) {
				System.out.println("狗屎运");
				break;
			}
			else if (input > num)
				max = input;
			else 
				min = input;
		}
		System.out.println("数字为" + num+"," + "你一共猜了" + count+"次");
		scanner.close();
	}

}
