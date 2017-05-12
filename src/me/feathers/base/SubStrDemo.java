package me.feathers.base;

/**
 * 题目：
 * 	实现subString的功能
 * @author Feathers
 * @date 2017年4月9日
 */
public class SubStrDemo {
	public static void main(String[] args) {
		String s = "I am so Smart!!!";
		System.out.println(subString(s, 'z', 'a'));
	}

	private static String subString(String s, char a, char b) {
		char[] cs = s.toCharArray();
		int start = -1;
		int end = -1;
		for (int i = 0; i < cs.length; i++) {
			if (cs[i] == a) {
				start = i;
				continue;
			}
			if (start != -1 && cs[i] == b) {
				end = i;
				break;
			}
		}
		if (start == -1 || end == -1)
			return "";
		else {
			char[] newCharArr = new char[end - start];
			System.arraycopy(cs, start, newCharArr, 0, end - start);
			return new String(newCharArr);
		}
	}
}
