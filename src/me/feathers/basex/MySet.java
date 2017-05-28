package me.feathers.basex;

/**
 * 手动实现集合
 * @author Feathers
 * @see java.util.ArrayList
 */
public class MySet<T> {
	
	// 数组的默认容量为 10
	private static final int DEFAULT_CAPACITY = 10;
	// 集合的实际大小
	private int setsize = 0;
	// 保存元素的数组
	private Object[] list;
	// 扩容倍数
	private double dilatation = 1.5;
	
	/**
	 * 使用默认容量建立集合
	 */
	public MySet() {
		list = new Object[DEFAULT_CAPACITY];
	}

	public void add(T t){
		// 重复性检查
		for (int i = 0; i < setsize; i++)
			if (list[i].equals(t))
				return;
		// 扩容
		if (setsize >= list.length) {
			Object[] newArr = new Object[(int) (setsize * dilatation)];
			System.arraycopy(list, 0, newArr, 0, list.length);
			list = newArr;
		}
		list[setsize] = t;
		setsize++;
	}

	public int setsize(){
		return setsize;
	}
	
	public boolean isRemeber(T t) {
		for (int i = 0; i < list.length; i++)
			if (list[i].equals(t))
				return true;
		return false;
	}
	
	public void empty(){
		list = new Object[DEFAULT_CAPACITY];
		setsize = 0;
	}
	
	public boolean isEmpty(){
		return setsize==0 ? true : false;
	}
	
	public void print(){
		String s = "[";
		for (int i = 0; i < setsize; i++){
			s+=list[i];
			if (i != setsize-1)
				s+=",";
		}
		s+="]";
		System.out.println(s);
	}
	
	public static void main(String[] args) {
		MySet<String> set = new MySet<>();
		set.add("哈哈");
		set.add("呵呵");
		set.add("嘻嘻");
		set.add("哼哼");
		set.add("霍霍");
		set.add("嘿嘿");
		set.add("呜呜");
		set.add("啦啦");
		set.add("吱吱");
		set.add("叽叽");
		set.add("汪汪");
		set.add("咪咪");
		
		System.out.println(set.setsize());
		set.print();
		set.empty();
		set.print();
	}
}
