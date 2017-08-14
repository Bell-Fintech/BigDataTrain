package cn.edu360;

import java.lang.reflect.Method;

public class ReflectMethod {

	public static void main(String[] args) throws Exception {
		Class clazz = Class.forName("cn.edu360.Person");
		// 获取所有的成员方法
		// public Method[] getMethods()返回一个包含某些 Method 对象的数组，这些对象反映此 Class
		// 对象所表示的类或接口（包括那些由该类或接口声明的以及从超类和超接口继承的那些的类或接口）的公共 member 方法
		// Method[] methods = clazz.getMethods();
		// public Method[] getDeclaredMethods()返回 Method 对象的一个数组，这些对象反映此 Class
		// 对象表示的类或接口声明的所有方法，包括公共、保护、默认（包）访问和私有方法,但不包括继承的方法
		/*
		 * methods = clazz.getDeclaredMethods();
		 * 
		 * for (Method method : methods) { System.out.println(method); }
		 */

		// 获取指定的成员方法
		/*
		 * public Method getMethod(String name,Class<?>... parameterTypes)返回一个 Method 对象，它反映此 Class 对象所表示的类或接口的指定公共成员方法
			 *	name - 方法名
				parameterTypes - 参数列表 
		 */
		Method method = clazz.getMethod("show", null);
		//public Object invoke(Object obj, Object... args)对带有指定参数的指定对象调用由此 Method 对象表示的底层方法
		Object obj = clazz.newInstance();//创建一个Person的实例对象
		System.out.println(obj instanceof Person);//true
		method.invoke(obj, null);//代表method方法在obj实例对象上面被调用了
		//new Person().show();
		
		//获取protected修饰符修饰的成员方法
		//public Method getDeclaredMethod(String name,Class<?>... parameterTypes)返回一个 Method 对象，该对象反映此 Class 对象所表示的类或接口的指定已声明方法
		method = clazz.getDeclaredMethod("test", String.class);
		System.out.println(method);
		method.invoke(obj, "我是有参的");
		
		//获取默认修饰符修饰的成员方法
		method = clazz.getDeclaredMethod("getSum", int.class,int.class);
		Object sum = method.invoke(obj, 1,1);
		System.out.println(sum);
		
		//获取private修饰的成员方法
		method = clazz.getDeclaredMethod("sop", String.class);
		//取消java语法的检查
		method.setAccessible(true);
		method.invoke(obj, "我是私有方法");
	}

}
