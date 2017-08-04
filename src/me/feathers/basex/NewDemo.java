package me.feathers.basex;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * 有一个文件，请读出该文件，并将其中的“nwe”改为“new”，注：不能将如“pnwe”改为“pnew”
 * 
 * 思路-   找出所有的new，判定new的前面和后面是否有其他字母，有不符合规则跳过，没有，符合规则，进行替换
 * @author Feathers
 *
 */
public class NewDemo {
	
	public static final String path = "src/me/feathers/basex/newdata.txt";
	
	public static void main(String[] args) {
		BufferedReader reader = null;
		StringBuilder builder = null;
		try {
			reader = new BufferedReader(new FileReader(new File(path)));
			builder = new StringBuilder();
			String str = null;
			while ((str = reader.readLine()) != null){
				builder.append(str);
				builder.append("\n");
			}
			System.out.println(builder);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				reader.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		// 找出所有new
		String p = "new";

		int start = 0;
		while (true) {
			if (builder.length() < p.length())
				break;
			if (builder.length() == p.length()) 
				if (builder.equals(p)) {
					builder.replace(0, 4, p);
					break;
				}
			int i = builder.indexOf(p, start);
			if (i == -1) 
				break;
			if (i!=0) {
				Character c = new Character(builder.charAt(i-1));
				String cc = c.toString();
				if (cc.matches("[A-Za-z]")){
					start += 3;
					if (start >= builder.length() - p.length())
						break;
					continue;
				}
			}
			Character c = new Character(builder.charAt(i+p.length()));
			String cc = c.toString();
			if (cc.matches("[A-Za-z]")){
				start += 3;
				if (start >= builder.length() - p.length())
					break;
				continue;
			} else {
				builder.replace(start, start+2, p);
			}
		}
		
		System.out.println(builder);
	}
	
}
