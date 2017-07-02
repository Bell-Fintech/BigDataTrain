package cn.edu360;

import java.util.ArrayList;

public class GenericDemo3 {
	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add("哈哈");
		list.add(1233);
		// String s = (String) list.get(0);
		String s = cast(list.get(0));
		System.out.println(s);
		Integer i = cast(list.get(1));
		System.out.println(i);
	}

	/*
	 * 泛型方法
		把泛型定义在方法上
			格式:public <泛型类型> 返回类型 方法名(泛型类型 .)

	 */
	// 自动强转类型的方法
	public static <T> T cast(Object obj) {
		return (T) obj;
	}
}
