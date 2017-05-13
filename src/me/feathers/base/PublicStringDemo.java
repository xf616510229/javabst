package me.feathers.base;

import java.util.ArrayList;
import java.util.List;

/**
 * 题目：
 * 	编写一个函数，返回两个字符串的最大公串！
 * @author Feathers
 * @date 2017年4月21日
 */
public class PublicStringDemo {
	public static void main(String[] args) {
		
		final String s1 = "adbccadebbcaaaaaa";
		final String s2 = "edabccadeceaaaaaa";
		
		List<String> list = new ArrayList<>();
		
		for (int i = 0; i < s1.length()-1; i++){
			for (int j = i+1; j <= s1.length(); j++){
				String sub = s1.substring(i, j);
				if (s2.contains(sub))
					list.add(sub);
			}
		}
				
		// 找出最长的公串
		int max = 0;
		for (String s : list) {
			if (s.length() > max)
				max = s.length();
		}
		
		// 输出长度为max的字符串
		for (String ss : list) {
			if (ss.length() == max)
				System.out.println(ss);
		}
	}
}
