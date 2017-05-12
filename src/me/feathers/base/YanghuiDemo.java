package me.feathers.base;

/**
 * 题目：
 * 	打印杨辉三角
 * @author Feathers
 * @date 2017年4月8日
 */
public class YanghuiDemo {

	public static void main(String[] args) {
		prints(10);
	}
	
	// 使用循环 + 一维数组
	public static void print1(int n){
		int[] temp1 = new int[n]; // 定义一个数组，用来保存上一行的内容
		for (int i = 0; i < n; i++){
			int[] temp2 = new int[n]; // 定义一个数组，用来保存这一行的内容
			for (int j = 0; j <= i; j++){
				int value = 0;
				if (j == 0 || j == i){
					value = 1;
				} else {
					value = temp1[j] + temp1[j-1];
				}
				temp2[j] = value;
				System.out.print(value+"\t");
			}
			temp1 = temp2;
			System.out.println();
		}
	}
	
	// 使用二维数组
	public static void print2(int n){
		int[][] arr = new int[n][];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = new int[i+1];
			for (int j = 0; j < arr[i].length; j++){
				if (j == 0 || i == j)
					arr[i][j] = 1;
				else 
					arr[i][j] = arr[i-1][j] + arr[i-1][j-1];
				System.out.print(arr[i][j]+"\t");
			}
			System.out.println();
		}
	}
	

	/**
	 * 获取每个行和列上面的杨辉三角的值...
	 * 使用递归
	 */
	public static int yang(int x,int y){
		return (x==1 || x==y) ? 1 : yang(x-1, y-1) + yang(x-1, y);
	}
	
	/**
	 * 输出..
	 */
	public static void prints(int n){
		for (int i = 1; i <=n; i++) {
			for (int j = 1; j <=i; j++) {
				System.out.print(yang(i, j)+"\t");
			}
			System.out.println();
		}
	}

}
