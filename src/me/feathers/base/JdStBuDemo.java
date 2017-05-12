package me.feathers.base;

import java.util.Scanner;

/**
 * 题目：
 * 		实现剪刀、石头、布的游戏
 * 
 * @author Feathers
 * @date 2017年5月2日
 */
public class JdStBuDemo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.print("请输入你要出的 1、剪刀 2、石头 3、布  0、退出");
			int n = sc.nextInt();
			if (n == 0)
				break;
			// 计算机做出回应
			int m = (int) (Math.random() * 3 + 1);
			System.out.println("计算机同志出了" + m);
			if (n == m)
				System.out.println("平局");
			else if ( m-n==1 || m-n==-2)
				System.out.println("对不起你输了");
			else 
				System.out.println("恭喜你！！！你赢了");
		}
		sc.close();
	}
}
