package me.feathers.base;

/**
 * 题目：
 * 	海滩上有一堆桃子，五只猴子来分。第一只猴子把这堆桃子平均分为五份，
 * 	多了一个，这只猴子把多的一 个扔入海中，拿走了一份。第二只猴子把剩下的桃子又平均分成五份，
 * 	又多了一个，它同样把多的一个扔入海中 ，拿走了一份，第三、第四、第五只猴子都是这样做的，
 * 	问海滩上原来最少有多少个桃子？
 * @author Feathers
 * @date 2017年4月9日
 */
public class MonkyDivideDemo {
	public static void main(String[] args) {
		int i = 0, m = 1, x = 1;	 
		while(true){
			m = x;
			for(i = 0; i < 5; i++){
				if( (m - 1) % 5 == 0)
					m = (m - 1) / 5 * 4;
				else
					break;
			}
			if(i == 5 && m > 0)
				break;
			x++;
		}
		System.out.println(x);
	}
}



/*
设原来有:5X+1
第一只拿走后还有:4X(设4X=5Y+1,下同)
第二只拿走后还有:4Y=5Z+1
第三只拿走后还有:4Z=5M+1
第四只拿走后还有:4M=5N+1
则第五只猴拿走的桃子为:N个
假设N=1,2,3....
直至使得X,Y,Z,M均为整数即符合题意.	

*/