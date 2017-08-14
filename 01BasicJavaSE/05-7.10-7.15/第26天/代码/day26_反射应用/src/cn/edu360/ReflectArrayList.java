package cn.edu360;

import java.lang.reflect.Method;
import java.util.ArrayList;

//我给你ArrayList<String>的一个对象，我想在这个集合中添加一个整型数据，如何实现呢？
public class ReflectArrayList {
	public static void main(String[] args) throws Exception {
		ArrayList<String> list = new ArrayList<String>();
		list.add("哈哈");
		//list.add(123);
		System.out.println(list);
		
		//ArrayList字节码文件对象
		Class clazz = list.getClass();
		//add方法对象
		Method method = clazz.getDeclaredMethod("add", Object.class);
		//method.setAccessible(true);//取消java语法检查
		method.invoke(list, 123);
		method.invoke(list, "呵呵");
		method.invoke(list, 12.12f);
		method.invoke(list, 12.12);
		System.out.println(list);
	}
}
