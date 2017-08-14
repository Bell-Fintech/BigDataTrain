package cn.edu360;

import java.util.ArrayList;
import java.util.Iterator;

/*
 * 如果泛型 不指定，那么默认就是Object类型
 * 泛型只存在编译时期，编译成class之后就消失了
 * 泛型的好处：
 * 	省去了类型的强制
 * 	提高了安全性
 * 	将运行时期的错误提前到了编译时期
 */
public class GenericDemo {

	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add(123);
		list.add("哈哈");
		list.add(12.12);
		Object obj = list.get(0);
		// java.lang.ClassCastException: java.lang.Integer cannot be cast to
		// java.lang.String
		// String i = (String) obj;
		// System.out.println(i);

		ArrayList<String> list2 = new ArrayList<>();// JDK1.7新特性，右边的泛型会根据左边的泛型自动推出对应的类型
		list2.add("123");
		list2.add("111");
		list2.add("哈哈");
		Iterator<String> iterator = list2.iterator();
		while (iterator.hasNext()) {
			String next = iterator.next();
			System.out.println(next);
		}
	}

}
