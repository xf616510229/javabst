package me.feathers.base;

import java.util.Scanner;

/**
 * 题目：
 * 	输入一行字符，分别统计出其中英文字母、空格、数字和其它字符的个数。 
 * @author Feathers
 * @date 2017年4月8日
 */
public class CharCountDemo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		sc.useDelimiter("\n");
		String s = sc.nextLine();
		char[] cs = s.toCharArray();
		sc.close();
		int abc = 0;
		int num = 0; 
		int space = 0;
		int others = 0;
		for (char c : cs) {
			if (c >= 65 && c <= 122)
				abc++;
			else if (c >= 48 && c<= 72)
				num++;
			else if (c == 0)
				space++;
			else 
				others++;
		}
		
		System.out.printf("你一共输入了%d个字母，%d个空格，%d个数字，以及%d其他字符", abc, space,num,others);
	}
	
}