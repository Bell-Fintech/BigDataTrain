package cn.edu360;

import java.lang.reflect.Constructor;

/*
 * 一个类的基本组成部分：
 * 	构造函数
 * 	成员方法
 * 	成员变量
 */
public class ReflectConstructor {

	public static void main(String[] args) throws Exception {
		Class clazz = Class.forName("cn.edu360.Person");
		
		//获取所有的构造方法
		//public Constructor<?>[] getConstructors()返回一个包含某些 Constructor 对象的数组，这些对象反映此 Class 对象所表示的类的所有公共构造方法
		//Constructor[] constructors = clazz.getConstructors();
		
		//public Constructor<?>[] getDeclaredConstructors()返回 Constructor 对象的一个数组，这些对象反映此 Class 对象表示的类声明的所有构造方法
		/*Constructor[] constructors = clazz.getDeclaredConstructors();
		
		for(Constructor c : constructors){
			System.out.println(c);
		}*/
		
		//获取指定的构造方法
		//被public修饰的构造方法
		//获取无参的构造方法并创建对象
		//public Constructor<T> getConstructor(Class<?>... parameterTypes)返回一个 Constructor 对象，它反映此 Class 对象所表示的类的指定公共构造方法
		//Constructor constructor = clazz.getConstructor(null);
		//System.out.println(constructor);
		
		//public T newInstance(Object... initargs)使用此 Constructor 对象表示的构造方法来创建该构造方法的声明类的新实例，并用指定的初始化参数初始化该实例
		//Object instance = constructor.newInstance();
		//如果想要通过无参构造方法创建一个对象出来，可以直接使用字节码文件对象的newInstance,仅限于无参
		//Object instance = clazz.newInstance();
		
		//获取有参的构造方法并创建对象
		//被protected修饰的构造方法
		//public Constructor<T> getDeclaredConstructor(Class<?>... parameterTypes)返回一个 Constructor 对象，该对象反映此 Class 对象所表示的类或接口的指定构造方法
		Constructor constructor = clazz.getDeclaredConstructor(String.class);
		Object instance = constructor.newInstance("张三");
		
		//被默认修饰符修饰的方法
		constructor = clazz.getDeclaredConstructor(String.class,int.class);
		instance = constructor.newInstance("李四",18);
		
		//被private修饰的构造方法
		constructor = clazz.getDeclaredConstructor(String.class,int.class,char.class);
		//取消java语法的检查,暴力反射
		constructor.setAccessible(true);
		instance = constructor.newInstance("王五",20,'男');
		System.out.println(instance);
	}

}
