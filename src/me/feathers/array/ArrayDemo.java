package me.feathers.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class ArrayDemo {
	/**
	 * 空检查
	 * @param arr
	 */
	private static void nullCheck(int[] arr) {
		if (arr == null)
			throw new NullPointerException();
	}
	
	/**
	 * 范围检查，检查是否是处于数组范围
	 * @param arr
	 * @param index
	 */
	private static void rangeCheck(int[] arr, int index) {
		if (index<0 || index>arr.length-1){
			throw new IndexOutOfBoundsException("Index:"+index);
		}
	}
	
	/**
	 * 范围检查 [0-length]（检查是否是可插入的范围）
	 * @param arr 
	 */
	private static void rangeInsertCheck(int[] arr, int index) {
		if (index<0 || index>arr.length){
			throw new IndexOutOfBoundsException("Index:"+index);
		}
	}
	
	/**
	 * 数组长度检查，长度不能为0
	 * @param arr
	 * @param index
	 */
	private static void lengthCheck(int[] arr) {
		if (arr.length == 0)
			throw new NegativeArraySizeException("数组长度不能为0");
	}
	
	/**
	 * 获取指定数组的最大值
	 * @param arr 数组
	 * @return
	 * @throws Exception 
	 */
	public static int getMaxValue(int[] arr){
		nullCheck(arr);
		lengthCheck(arr);
		int max = arr[0];
		for (int i = 1; i < arr.length; i++){
			if (max < arr[i])
				max = arr[i];
		}
		return max;
	}
	
	/**
	 * 获取指定数组中的最小值
	 * @param arr
	 * @return
	 */
	public static int getMinValue(int[] arr){
		nullCheck(arr);
		lengthCheck(arr);
		int min = arr[0];
		for (int i = 1; i < arr.length; i++){
			if (min > arr[i])
				min = arr[i];
		}
		return min;
	}
	
	/**
	 * 找出指定元素在数组中的位置
	 * @param arr
	 * @param target
	 * @return
	 */
	public static int[] findIndexByTarget(int[] arr,int target){
		nullCheck(arr);
		// 计算该元素在数组中出现的次数，得到下标数组的长度
		int count = 0;
		for (int i : arr) {
			if (i == target)
				count++;	
		}
		
		int[] result = new int[count];
		int pos = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == target) {
				result[pos++] = i;
			}
		}
		return result;
	}
	
	/**
	 * 判断指定元素是否在指定数组中
	 * @param arr
	 * @param ele
	 */
	public static boolean contains(int[] arr, int ele){
		nullCheck(arr);
		boolean flag = false;
		for (int i = 0; i < arr.length; i++){
			if (arr[i] == ele)
				flag = true;
		}
		return flag;
	}
	
	/**
	 * 删除指定下标的元素
	 * 方式一：arraycopy
	 * @param arr
	 * @param pos
	 */
	public static int[] delByIndex(int[] arr,int index){
		nullCheck(arr);
		rangeCheck(arr, index);
		int[] newArr = new int[arr.length-1];
		// 1 2 3 index 5 6  
		// 0  index 
		System.arraycopy(arr, 0, newArr, 0, index);
		System.arraycopy(arr, index+1, newArr, index, arr.length-1-index);
		return newArr;
	}
	
	/**
	 * 删除指定下标的元素
	 * 方式二
	 * @param arr
	 * @param index
	 * @return
	 */
	public static int[] delByIndex2(int[] arr, int index){
		nullCheck(arr);
		rangeCheck(arr, index);
		int[] newArr = new int[arr.length - 1];
		//定义一个下标计数器
		int pos = 0;
		for (int i = 0; i < arr.length; i++) {
			if (i != index) {
				newArr[pos++] = arr[i];
			}
		}
		return newArr;
	}
	
	/**
	 * 删除指定下标的元素
	 * 方式三
	 * @param arr
	 * @param index
	 * @return
	 */
	public static int[] delByIndex3(int[] arr, int index){
		nullCheck(arr);
		rangeCheck(arr, index);
		int[] newArr = new int[arr.length-1];
		for (int i = 0; i < newArr.length; i++){
			if (i < index)
				newArr[i] = arr[i];
			else 
				newArr[i] = arr[i+1];
		}
		return newArr;
	}
	
	/**
	 * 删除指定下表的元素
	 * 方式四：对方式三的优化
	 */
	public static int[] delByIndex4(int[] arr, int index){
		nullCheck(arr);
		rangeCheck(arr, index);
		if (arr.length == 1)
			return new int[0];
		for (int i = index; i < arr.length; i++){
			arr[i] = arr[i+1];
		}
		return Arrays.copyOf(arr, arr.length-1);
	}
	
	/**
	 * 根据数组的元素来删除数组中所有的该元素
	 * 方式一
	 * @param arr
	 * @param target
	 * @return
	 */
	public static int[] delByTarget(int[] arr,int target){
		nullCheck(arr);
		if (arr.length == 0)
			return arr;
		// 寻找该元素的个数，确定新数组的长度
		int count = 0;
		for (int i : arr) {
			if (i == target)
				count++;
		}
		
		if (count == 0)
			return arr;
		
		int[] newArr = new int[arr.length-count];
		int pos = 0;
		for (int i = 0; i < arr.length; i++){
			if (arr[i] != target){
				newArr[pos++] = arr[i];
			}
		}
		return newArr;
	}
	
	/**
	 * 删除所有数组中的重复元素，仅仅保留一个
	 * 方法一:遍历数组，判断当前元素是否存在于新数组中，false，add到新数组
	 */
	public static int[] delDoubleArrTarget(int[] arr){
		nullCheck(arr);
		if (arr.length == 0 || arr.length == 1) {
			return arr;
		}
		int[] newArr = new int[]{};
		for (int i = 0; i < arr.length; i++) {
			if (!contains(newArr, arr[i])){
				newArr = inserElement(newArr, newArr.length, arr[i]);
			}
		}
		return newArr;
	}
	
	/**
	 * 删除所有数组中的重复元素，仅仅保留一个
	 * 方法二：遍历数组寻找相同的 相同的删除
	 * @param arr
	 * @return
	 */
	public static int[] delDoubleArrTarget2(int[] arr) {
		nullCheck(arr);
		if (arr.length == 0 || arr.length == 1)
			return arr;
		
		int[] newArr = arr;
		for (int i = 0; i < newArr.length; i++) {
			for (int j = i + 1; j < newArr.length; j++) {
				if (newArr[i] == newArr[j]) {
					newArr = delByIndex(newArr, j);
					j--;
				}
			}
		}
		return newArr;
	}

	

	/**
	 * 删除所有数组中的重复元素，仅仅保留一个
	 * 方法三：首先对数组排序，相同的元素会被放置到一起，遍历数组，去除重复元素
	 */ 
	public static int[] delDoubleArrTarget3(int[] arr){
		nullCheck(arr);
		if (arr.length == 0) {
			return arr;
		}
		int[] newArr = sortSelectionMinToMax(arr);
		for (int i = 0; i < newArr.length-1; i++){
			if (newArr[i] == newArr[i+1]){
				newArr = delByIndex(newArr, i+1);
				i--;
			}
		}
		return newArr;
	}
	
	/**
	 * 删除所有数组中的重复元素，仅仅保留一个
	 * 方法四
	 */
	public static int[] delDoubleArrTarget4(int[] arr){
		nullCheck(arr);
		//参数有效性判断
		if (null == arr || arr.length == 0)
			return arr;
		//定义一个新的 数组...
		int[] temp = new int[arr.length];
		//定义一个下标计数器
		int pos = 0;
		//do..while循环
		do {
			
			//永远将arr数组的第一个元素赋值给temp;
			temp[pos++] = arr[0];
			//利用调用根据元素作删除操作,到arr中将arr[0]的所有的元素全部删除
			//并且将删除之后得到的新的数组的地址重新赋值给arr.
			arr = delByTarget(arr, arr[0]);

			//判断循环退出的条件...
			if (arr.length == 0)
				break;

		} while (true);
		return Arrays.copyOf(temp, pos);
	}
	
	/**
	 * 删除所有数组中的重复元素，仅仅保留一个
	 * 方法五：
	 * 		遍历数组，如果和前面已经遍历的元素相同，则标记该元素
	 * @param arr
	 * @return
	 */
	public static int[] delDoubleArrTarget5(int[] arr){
		nullCheck(arr);
		if (arr.length == 0 || arr.length == 1)
			return arr;
		
		int[] newArr = arr;
		boolean[] bs = new boolean[newArr.length];
		Arrays.fill(bs, true);
		
		for (int i = 0; i < newArr.length; i++){
			for (int j = 0; j < i; j++){
				if (newArr[i] == newArr[j]){
					bs[i] = false;
				}
			}
		}
		
		// 获取值为true的个数，确定新数组的长度
		int count = 0;
		for (boolean b : bs) {
			if (b)
				count++;
		}
		
		// 向数组添加元素，为false的不添加
		int[] temp = new int[count];
		int pos = 0;
		for (int i = 0; i < newArr.length; i++){
			if (bs[i])
				temp[pos++] = newArr[i];
		}
		return temp;
		
	}
	
	/**
	 * 删除所有数组中的重复元素，仅仅保留一个
	 * 方法五:借助Map集合key的特性(key会自动进行排序)
	 */
	public static Integer[] delDoubleArrTarget6(int[] arr){
		nullCheck(arr);
		Map<Integer, Integer> map = new HashMap<>();
		for (int i : arr) 
			map.put(i, 0);
		return map.keySet().toArray(new Integer[map.size()]);
	}

	/**
	 * 删除所有数组中的重复元素，仅仅保留一个
	 * 方法七:借助List集合
	 */
	public static Integer[] delDoubleArrTarget7(int[] arr){
		nullCheck(arr);
		ArrayList<Integer> newArr = new ArrayList<>();
		for (Integer i : arr){
			if (!newArr.contains(i))
				newArr.add(i);
		}
		return newArr.toArray(new Integer[newArr.size()]);
	}
	
	/**
	 * 删除所有数组中的重复元素，仅仅保留一个
	 * 方法八:借助Set集合
	 */
	public static Integer[] delDoubleArrTarget8(int[] arr){
		nullCheck(arr);
		Set<Integer> set = new HashSet<>();
		for (int i : arr) 
			set.add(i);
		return set.toArray(new Integer[set.size()]);
	}

	/**
	 * 对数组进行选择排序（从小到大）
	 * 思想：每次在未排序的序列中选择最小的元素，放置到已经排序的序列的末尾处
	 */
	public static int[] sortSelectionMinToMax(int[] arr){
		nullCheck(arr);
		int[] newArr = arr;
		for (int  i = 0; i < newArr.length; i++){
			for (int j = i+1; j < newArr.length; j++){
				if (newArr[i] > newArr[j]){
					newArr[i] = newArr[j] ^ (newArr[j] = newArr[i]) ^ newArr[i];
				}
			}
		}
		return newArr;
	}
	
	/**
	 * 对数组进行选择排序（从大到小）
	 * 思想：每次在未排序的序列中选择最大的元素，放置到已经排序的序列的末尾处
	 */
	public static int[] sortSelectionMaxToMin(int[] arr){
		nullCheck(arr);
		int[] newArr = arr;
		for (int  i = 0; i < newArr.length; i++){
			for (int j = i+1; j < newArr.length; j++){
				if (newArr[i] < newArr[j]){
					newArr[i] = newArr[j] ^ (newArr[j] = newArr[i]) ^ newArr[i];
				}
			}
		}
		return newArr;
	}
	
	/**
	 * 对数组进行冒泡排序（从小到大）
	 * 思想：比较相邻的元素。如果第一个比第二个大，就交换他们两个。
	 * 对每一对相邻元素作同样的工作，从开始第一对到结尾的最后一对。这步做完后，最后的元素会是最大的数。
	 * 针对所有的元素重复以上的步骤，除了最后一个。
	 * 持续每次对越来越少的元素重复上面的步骤，直到没有任何一对数字需要比较
	 */
	public static int[] sortBubbleMinToMax(int[] arr){
		nullCheck(arr);
		int[] newArr = arr;
		for (int i = newArr.length; i > 0; i--){
			for (int j = 0; j < i-1; j++){
				if (newArr[j] > newArr[j+1]){
					newArr[j] = newArr[j+1] ^ (newArr[j+1] = newArr[j]) ^ newArr[j];
				}
			}
		}
		return newArr;
	}
	
	/**
	 * 对数组进行冒泡排序（从大到小）
	 */  
	public static int[] sortBubbleMaxToMin(int[] arr){
		nullCheck(arr);
		int[] newArr = arr;
		for (int i = newArr.length; i > 0; i--){
			for (int j = 0; j < i-1; j++){
				if (newArr[j] < newArr[j+1]){
					newArr[j] = newArr[j+1] ^ (newArr[j+1] = newArr[j]) ^ newArr[j];
				}
			}
		}
		return newArr;
	}
	
	/**
	 * 对数组进行直接插入排序（从小到大）
	 * <p>思想：类似扑克排序
	 * 从第一个元素开始，该元素可以认为已经被排序
	 * 取出下一个元素，在已经排序的元素序列中从后向前扫描
	 * 如果该元素（已排序）大于新元素，将该元素移到下一位置
	 * 重复步骤3，直到找到已排序的元素小于或者等于新元素的位置
	 * 将新元素插入到该位置后
	 * 重复步骤2~5
	 * </p>
	 */
	public static int[] sortInsertionMinToMax(int[] arr){
		nullCheck(arr);
		int[] newArr = arr;
		for (int i = 1; i < newArr.length; i++){
			for (int j = i; j > 0; j--){
				if (newArr[j] < newArr[j-1])
					newArr[j] = newArr[j-1] ^ (newArr[j-1]=newArr[j]) ^ newArr[j];
				else 
					break;
			}
		}
		return newArr;
	}
	/**
	 * 对数组进行直接插入排序（从大到小）
	 */
	public static int[] sortInsertionMaxToMin(int[] arr){
		nullCheck(arr);
		int[] newArr = arr;
		for (int i = 1; i < newArr.length; i++){
			for (int j = i; j > 0; j--){
				if (newArr[j] > newArr[j-1])
					newArr[j] = newArr[j-1] ^ (newArr[j-1]=newArr[j]) ^ newArr[j];
				else 
					break;
			}
		}
		return newArr;
	}
	
	/**
	 * 对数组进行快速排序
	 * 从数列中挑出一个元素，称为"基准"（pivot），
	 * 重新排序数列，所有比基准值小的元素摆放在基准前面，所有比基准值大的元素摆在基准后面（相同的数可以到任一边）。在这个分区结束之后，该基准就处于数列的中间位置。这个称为分区（partition）操作。
	 * 递归地（recursively）把小于基准值元素的子数列和大于基准值元素的子数列排序。
	 */
	public static int[] sortQuickMinToMax(int[] arr) {
		return null;
	}

	public static int[] sortQuickMaxToMin(int[] arr) {
		return null;
	}
	
	
	/**
	 * 在数组的指定的下标处插入指定的值.
	 */
	public static int[] inserElement(int[] arr,int index,int value){
		nullCheck(arr);
		rangeInsertCheck(arr, index);
		
		int[] newArr = new int[arr.length+1];
		for (int i = 0; i < newArr.length; i++){
			if (i < index) 
				newArr[i] = arr[i];
			else if (i == index)
				newArr[i] = value;
			else
				newArr[i] = arr[i-1];
		}
		return newArr;
	}
	
	/**
	 * 在数组的指定的下标处插入指定的值.
	 * arrayCopy实现
	 */
	public static int[] insertElement2(int[] arr, int index, int value){
		nullCheck(arr);
		rangeInsertCheck(arr, index);
		
		int[] newArr = new int[arr.length+1];
		System.arraycopy(arr, 0, newArr, 0, index);
		newArr[index] = value;
		System.arraycopy(arr, index, newArr, index+1, arr.length - index);
		
		return newArr;
	}
}
