package me.feathers.base;

/**
 * 题目：
 * 	猴子吃桃问题：猴子第一天摘下若干个桃子，当即吃了一半，
 * 	还不过瘾，又多吃了一个 第二天早上又将剩下的桃子吃掉一半，
 * 	又多吃了一个。以后每天早上都吃了前一天剩下的一半零一个。
 * 	到第10天早上想再吃时，见只剩下一个桃子了。求第一天共摘了多少。 
 * @author Feathers
 * @date 2017年4月9日
 */
public class MonkyEatDemo {

	// 逆向思维 从后往前判断
	// 第十天--------第一天
	// 桃子数：   1  2*2 5*2 11*2......   即   1 4 10 22 46
	public static void main(String[] args) {
		method1();
	}

	public static void method1(){
		int count = 1;
		for (int i = 1; i < 10; i++){
			count = (count+1)*2;
		}
		System.out.println(count);
	}
}
