package me.feathers.basex;

import java.math.BigDecimal;

/**
 * 题目：
 * 	编写一个程序，将浮点数转换未人民币读法字符串，例如，将1006.333转换为一仟零陆元叁角叁分
 * @author Feathers
 * @date 2017年4月10日
 */
public class ToggleDemo {
	
	public static void main(String[] args) {
		
		String s = method1(55456.333);
		System.out.println(s);
	}

	// 1000    0   6   3   3
	/**
	 * @param d
	 * @return
	 */
	private static String method1(double d) {
		BigDecimal bd = new BigDecimal(d);
		bd.setScale(2, BigDecimal.ROUND_HALF_UP); // 四舍五入 保留两位小树
		d = bd.doubleValue();
		// 将1006.33 分解为 1006 和 33
		int first = (int) d;
		int second = (int) ((d - first)*100);
		// 将 i 拆分为 1000，0，0，6
		// 1006 / 1000 % 10 * 1000   
		// 1006 / 100 % 10 * 100
		// ......  
		String s = "";
		// 整数部分
		for (int k = getNumBits(first)-1; k >= 0; k--){
			int one = first / (int)Math.pow(10, k) % 10 ;
			int two = (int) Math.pow(10, k);
			// 获取最后一个字符
			// 如果最后一个字符为零并且当前one为0，则不需要添加0
			if (!(s.length()>0 && one==0 && s.substring(s.length()-1).equals("零")))
				s += getDx(one);
			if (one!=0 && two!=1){
				s += getDx(two);				
			}
		}
		s+="元";
		s += getDx(second / 10 % 10);
		s += "角";
		s += getDx(second % 10);
		s += "分";
		return s;
	}
	
	// 获取数字的位数
	private static int getNumBits(int num){
		int count = 0;
		int a = 1;
		while (num >= a){
			a *= 10;
			count++;
		}	
		return count;
	}
	
	// 输入数字 返回大写文字
	private static String getDx(int a){
		switch (a) {
			case 0:
				return "零";
			case 1:
				return "壹";
			case 2:
				return "贰";
			case 3:
				return "叁";
			case 4:
				return "肆";
			case 5:
				return "伍";
			case 6:
				return "陆";
			case 7:
				return "柒";
			case 8:
				return "捌";
			case 9:
				return "玖";
			case 10:
				return "拾";
			case 100:
				return "佰";
			case 1000:
				return "仟";
			case 10000:
				return "万";
		default:
			return "";
		}
	}
	
}
