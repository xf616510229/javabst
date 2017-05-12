package me.feathers.base;

/**
 * 题目： 
 * 在控制台绘制各种形的状三角形，以及菱形，矩形。（空心和实心分别实现）
 * @author Feathers
 * @date 2017年4月7日
 */
@SuppressWarnings("all")
public class DrawDemo {
	
	public static void main(String[] args) {
		printh7();
	}
	
	// draw rectangle
	private static void print1(){
		for (int i = 0; i < 5; i++){
			for (int j = 0; j < 10; j++){
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	// draw hollow rectangle
	private static void printh1(){
		for (int i = 0; i < 5; i++){
			for (int j = 0; j < 10; j++){
				if (i == 0 || j == 0 || i == 4 || j == 9)
					System.out.print("*");
				else 
					System.out.print(" ");
			}
			System.out.println();
		}
	}
	
	/**
	 * draw right angled triangle
	 * 
	 * * 		
	 * **		
	 * ***	
	 * ****	
	 * *****	
	 */
	private static void print2(){
		for (int i = 0; i < 5; i++){
			for (int j = 0; j <= i; j++){
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	// draw hollow right angled triangle
	private static void printh2(){
		for (int i = 0; i < 5; i++){
			for (int j = 0; j <= i; j++){
				if (j == 0 || i == j || i == 4)
					System.out.print("*");
				else 
					System.out.print(" ");
			}
			System.out.println();
		}
	}
	
	/**
	 * draw right angled triangle
	 * 
	 * *****	
	 * ****		
	 * ***		
	 * **		
	 * *
	 */
	private static void print3(){
		for (int i = 5; i > 0; i--){
			for (int j = 0; j < i; j++){
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	// draw hollow right angled triangle
	private static void printh3(){
		for (int i = 0; i < 5; i++){
			for (int j = 0; j < 5-i; j++){
				if (i == 0 || j == 0 || i+j==4)
					System.out.print("*");
				else 
					System.out.print(" ");
			}
			System.out.println();
		}
	}
	
	/**
	 * draw right angled triangle
	 * 
	 * *****	i = 0  j = 0,1,2,3,4
	 *  ****	i = 1  j =   1,2,3,4
	 *   ***	i = 2  j =     2,3,4
	 *    **	...
	 *     *	-> i <= j
	 */
	private static void print4(){
		for (int i = 0; i < 5; i++){
			for (int j = 0; j < 5; j++){
				if (i <= j)
					System.out.print("*");
				else 
					System.out.print(" ");
			}
			System.out.println();
		}
	}
	
	// draw hollow right angled triangle
	private static void printh4(){
		for (int i = 0; i < 5; i++){
			for (int j = 0; j < 5; j++){
				if (i == j || i == 0 || j == 4)
					System.out.print("*");
				else 
					System.out.print(" ");
			}
			System.out.println();
		}
	}
	
	/**
	 * draw right angled triangle
	 * 
	 *     *	i = 0  j =      4
	 *    **	i = 1  j =    3,4
	 *   ***	i = 2  j =  2,3,4
	 *  ****	...
	 * *****	->  i+j >= 4
	 * 
	 */
	private static void print5(){
		for (int i = 0; i < 5; i++){
			for (int j = 0; j < 5; j++){
				if (i+j >= 4)
					System.out.print("*");
				else 
					System.out.print(" ");
			}
			System.out.println();
		}
	}
	
	// draw hollow right angled triangle
	private static void printh5(){
		for (int i = 0; i < 5; i++){
			for (int j = 0; j < 5; j++){
				if (i+j == 4 || i == 4 || j==4)
					System.out.print("*");
				else 
					System.out.print(" ");
			}
			System.out.println();
		}
	}
	
	/**
	 * draw this triangle
	 * 
	 *     *		i = 0  j =     4
	 *    ***		i = 1  j =   3,4,5
	 *   *****		i = 2  j = 2,3,4,5,6
	 *  *******     ...
	 * *********    -> 三条线的共同域： i+j>=4 && j-i<=4 
	 */
	private static void print6(){
		for (int i = 0; i < 5; i++){
			for (int j = 0; j < 9; j++){
				if (i+j >= 4 && j-i<=4)
					System.out.print("*");
				else 
					System.out.print(" ");
			}
			System.out.println();
		}
	}
	
	// draw hollow angle
	private static void printh6(){
		for (int i = 0; i < 5; i++){
			for (int j = 0; j < 9; j++){
				if (i+j == 4 || j-i==4 || i==4)
					System.out.print("*");
				else 
					System.out.print(" ");
			}
			System.out.println();
		}
	}
	
	/**
	 * draw this rhombus 
	 * 
	 *    *			i = 0  j =     3
	 *   ***		i = 1  j =   2,3,4
	 *  ***** 		i = 2  j = 1,2,3,4,5
	 * *******		...
	 *  *****		i = 4  j = 1,2,3,4,5
	 * 	 ***		i = 5  j =   2,3,4
	 *    *			i = 6  j =     3
	 *    			-> 四条线的共同域  i+j>=4 j-i<=3 i-j<=3 i+j<=9
	 */
	private static void print7(){
		for (int i = 0; i < 7; i++){
			for (int j = 0; j < 7; j++){
				if (i+j>=3 && j-i<=3 && i-j<=3 && i+j<=9)
					System.out.print("*");
				else 
					System.out.print(" ");
			}
			System.out.println();
		}
	}
	
	// draw hollow rhombus
	private static void printh7(){
		for (int i = 0; i < 7; i++){
			for (int j = 0; j < 7; j++){
				if (i+j==3 || j-i==3 || i-j==3 || i+j==9)
					System.out.print("*");
				else 
					System.out.print(" ");
			}
			System.out.println();
		}
	}
}

/*
实心三脚、实心矩形、实心菱形，都是确定域
而空心需要在实心的基础上判断是否是边界，如果是打印*，如果不是则打印"空格"

最快思想：
	将图形的边界坐标写出来找规律
*/