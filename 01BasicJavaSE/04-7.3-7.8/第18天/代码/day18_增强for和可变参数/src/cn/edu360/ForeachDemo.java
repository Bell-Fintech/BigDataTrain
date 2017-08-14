package cn.edu360;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

/*
 * 增强for循环，是为了简化循环的
 * 格式：
 * 	for(元素的数据类型 变量名 : 要遍历的数组或者集合){
 * 		对遍历出来的元素进行操作
 * 	}
 *	本质上是对迭代器的一个封装
 *	遍历的目标不能是null
 */
public class ForeachDemo {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		list.add("javase");
		list.add("javaee");
		list.add("javame");
		list.add("hadoop");

		Iterator<String> iterator = list.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}

		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}

		System.out.println(Arrays.toString(list.toArray()));

		for (String value : list) {
			// list.add("aaa");
			// java.util.ConcurrentModificationException：并发的修改异常
			System.out.println(value);
		}

		int[] arr = { 1, 2, 3, 4 };
		arr = null;
		//java.lang.NullPointerException：遍历的目标不能是null
		for (int value : arr) {
			System.out.println(value);
		}
	}

}
