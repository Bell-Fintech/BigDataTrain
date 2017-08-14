package cn.edu360;

import java.lang.reflect.Field;

public class ReflectField {

	public static void main(String[] args) throws Exception {
		Class clazz = Class.forName("cn.edu360.Person");

		// 获取所有的成员变量
		// public Field[] getFields()返回一个包含某些 Field 对象的数组，这些对象反映此 Class
		// 对象所表示的类或接口的所有可访问公共字段
		// Field[] fields = clazz.getFields();
		// public Method[] getDeclaredMethods()返回 Method 对象的一个数组，这些对象反映此 Class
		// 对象表示的类或接口声明的所有方法，包括公共、保护、默认（包）访问和私有方法，但不包括继承的方法
		/*
		 * fields = clazz.getDeclaredFields(); for (Field field : fields) {
		 * System.out.println(field); }
		 */
		
		//获取指定的成员变量
		//获取public修饰的成员变量
		Object instance = clazz.newInstance();//Person的实例对象
		System.out.println(instance);
		//public Field getField(String name)返回一个 Field 对象，它反映此 Class 对象所表示的类或接口的指定公共成员字段
		Field field = clazz.getField("name");
		//public void set(Object obj,Object value)将指定对象变量上此 Field 对象表示的字段设置为指定的新值
		field.set(instance, "张三");//将instance对象里面的name字段赋值为“张三”
		//new Person().setName("张三");
		
		
		//获取protected修饰的成员变量
		//public Field getDeclaredField(String name)返回一个 Field 对象，该对象反映此 Class 对象所表示的类或接口的指定已声明字段
		field = clazz.getDeclaredField("age");
		field.set(instance, 20);
		
		//获取默认修饰符修饰符的成员变量
		field =clazz.getDeclaredField("sex");
		field.set(instance, '男');
		
		//获取private修饰的成员变量
		field =clazz.getDeclaredField("address");
		System.out.println(field);
		field.setAccessible(true);
		field.set(instance, "太原");
		System.out.println(instance);
	}

}
