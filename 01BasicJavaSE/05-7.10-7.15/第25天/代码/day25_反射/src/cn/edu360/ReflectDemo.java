package cn.edu360;

/*
 * 反射：对于任意一个类都可以知道它的组成部分
 * 想要解剖一个类的组成部分，需要先获取这个类的字节码文件对象
 * 获取字节码文件对象的三种方式：
 * 	public final Class<?> getClass()返回此 Object 的运行时类
 * 	直接通过类名.class属性
 * 	通过Class是的forName方法
 */
public class ReflectDemo {

	public static void main(String[] args) throws Exception {
		//通过getClass方法
		Demo d = new Demo();
		Class clazz = d.getClass();
		
		//直接通过类名.class属性
		Class clazz2 = Demo.class;
		
		//通过Class是的forName方法
		Class clazz3 = Class.forName("cn.edu360.Demo");
		
		System.out.println(clazz==clazz2);//true
		System.out.println(clazz==clazz3);//true
	}

}
class Demo{}