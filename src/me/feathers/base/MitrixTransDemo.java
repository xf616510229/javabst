package me.feathers.base;

/**
 * 题目：
 * 	矩阵的转置
 * @author Feathers
 * @date 2017年4月8日
 */
public class MitrixTransDemo {
	/**
	 * 矩阵转置 
	 * 将行和列调换
	 */
	public static int[][] test01(int[][] arr){
		if (arr == null) 
			return null;
		int[][] newArr = new int[arr[0].length][arr.length];
		for (int i = 0; i < newArr.length; i++){
			for (int j = 0; j <newArr[0].length;j++){
				newArr[i][j] = arr[j][i];
			}
		}
		return newArr;
	}
	
	/**
	 * 矩阵加法运算（相加的矩阵需要满足二者是同型矩阵）
	 */
	public static int[][] test02(int[][] a, int[][] b){
		if (a.length != b.length || a[0].length != b[0].length){
			throw new UnsupportedOperationException("矩阵需要是同型矩阵");
		}
		int[][] newArr = new int[a.length][a[0].length];
		for (int i = 0; i < a.length; i++){
			for (int j = 0; j < a[0].length; j++){
				newArr[i][j] = a[i][j] + b[i][j];
			}
		}
		return newArr;
	}
	
	/**
	 * 矩阵的乘法（要求第一个矩阵A的列数和另一个矩阵B的行数相等时才能定义）
	 */
	public static int[][] test03(int[][] a, int[][] b){
		if (a[0].length != b.length){
			throw new UnsupportedOperationException("A矩阵的列数要和B矩阵的行数相等");
		}
		int[][] newArr = new int[a.length][b[0].length];
		for (int i = 0; i < newArr.length; i++){
			for (int j = 0; j < newArr[0].length; j++){
			}
		}
		return newArr;
	}
}
