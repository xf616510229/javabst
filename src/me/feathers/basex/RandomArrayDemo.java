package me.feathers.basex;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 题目：
 * 	统计随机数
 * @author Feathers
 * @date 2017年4月21日
 */
public class RandomArrayDemo {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入随机数的范围：");
		int range = sc.nextInt();
		System.out.println("请您输入随机数的数量：");
		int len = sc.nextInt();
		sc.close();
		// 开始随机
		int[] random = new int[len];
		for (int i = 0; i < len; i++){
			random[i] = (int)(Math.random()*range+1);
		}
		
		System.out.println("随机数组：" + Arrays.toString(random));
		
		// 计算每个随机数的次数，采用二维数组
		
		// 1. 对random数组进行排序，让其相同的元素相邻
		// 冒泡排序
		for (int i = random.length; i > 0; i--){
			for (int j = 0; j < i-1; j++){
				if (random[j] > random[j+1]){
					random[j] = random[j+1] ^ (random[j+1] = random[j]) ^ random[j];
				}
			}
		}
		
		// 2. 计算随机数的出现次数，即计算二维数组的长度
		int count = 0;
		for (int i = 0; i < random.length-1; i++)
			if (random[i] == random[i+1])
				count++;
		
		// 3 定义一个二维数组，计算每个元素出现的次数，然后填充到arr中
		int[][] arr = new int[len-count][2];
		int pos = 0;
		for (int i = 0; i < random.length; i++){
			if (arr[pos][0] == 0){
				arr[pos][0] = random[i];
				arr[pos][1]++;
			}  else if (arr[pos][0] == random[i])
				arr[pos][1]++;
			else {
				pos++;
				arr[pos][0] = random[i];
				arr[pos][1]++;
			}
		}
		
		for (int[] is : arr) {
			System.out.println(Arrays.toString(is));
		}
		
		// 4. 再次排序，根据元素的出现的次数进行排序
		// 仍然使用冒泡排序
		for(int i = arr.length; i > 0; i--)
			for (int j = 0; j < i-1; j++)
				if (arr[j][1] < arr[j+1][1]){
					arr[j][0] = arr[j+1][0] ^ (arr[j+1][0]=arr[j][0]) ^ arr[j][0];
					arr[j][1] = arr[j+1][1] ^ (arr[j+1][1]=arr[j][1]) ^ arr[j][1];
				}
					
		
		System.out.println("----------按照出现次数降序排列----------");
		for (int[] is : arr) {
			System.out.println("随机数:"+is[0]+"->出现次数:"+is[1]);
		}
			
	}
}
