package me.feathers.base;

/**
 * 题目：
 * 	有5个人坐在一起，问第五个人多少岁？他说比第4个人大2岁。问第4个人岁数，他说比第3个人大2岁。
 * 	问第三个人，又说比第2人大两岁。问第2个人，说比第一个人大两岁。最后问第一个人，他说是10岁。
 * 	请问第五个人多大？ 
 * @author Feathers
 * @date 2017年4月9日
 */
public class AgeDemo {

	public static void main(String[] args) {
		method1();
		System.out.println(method2(5));
	}
	
	// 采用逆序思维
	private static void method1(){
		int age = 10;
		for (int i = 2; i <= 5; i++){
			age += 2;
		}
		System.out.println(age);
	}

	// 采用递归
	private static int method2(int id){
		return id==1 ? 10 : method2(id-1)+2;
	}
}
