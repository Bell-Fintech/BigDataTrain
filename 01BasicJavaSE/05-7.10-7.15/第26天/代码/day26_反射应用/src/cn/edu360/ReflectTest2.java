package cn.edu360;

import java.lang.reflect.Field;

public class ReflectTest2 {

	public static void main(String[] args) throws Exception {
		Demo d = new Demo();
		Test t = new Test();
		System.out.println(t);
		d.setProperty(t, "name", "张三");
		d.setProperty(t, "age", 18);
		System.out.println(t);
	}

}
class Test{
	public String name;
	private int age;
	@Override
	public String toString() {
		return "Test [name=" + name + ", age=" + age + "]";
	}
}
class Demo{
	// 此方法可将obj对象中名为propertyName的属性的值设置为value
	public void setProperty(Object obj, String propertyName, Object value) throws Exception{
		//获取obj的字节码文件对象
		Class clazz = obj.getClass();
		//获取指定 名字字段的对象
		Field field = clazz.getDeclaredField(propertyName);
		//取消java语法检查
		field.setAccessible(true);
		//给指定的字段赋值
		field.set(obj, value);
	}

}