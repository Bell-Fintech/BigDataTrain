package cn.edu360;

import java.beans.PropertyDescriptor;
import java.lang.reflect.Method;

/*
 * java内省机制
 */
public class PropertyDescriptorDemo {

	public static void main(String[] args) throws Exception {
		Person p = new Person();
		// p.setName("李四");
		// p.setAge(20);
		// System.out.println(p);

		// public PropertyDescriptor(String propertyName,Class<?> beanClass)通过调用
		// getFoo 和 setFoo 存取方法，为符合标准 Java 约定的属性构造一个 PropertyDescriptor
		
		writeValue(p, "age", 20);
		Object value = readValue(p, "age");
		System.out.println(value);
	}

	/**
	 * 获取指定obj对象的指定fieldName属性的值
	 * @param obj
	 * @param fieldName
	 * @return
	 * @throws Exception
	 */
	private static Object readValue(Object obj, String fieldName) throws Exception {
		PropertyDescriptor pd = new PropertyDescriptor(fieldName, obj.getClass());
		// PropertyDescriptor pd = new PropertyDescriptor(fieldName,
		// obj.getClass(),"getage", "setage");
		Method readMethod = pd.getReadMethod();
		return readMethod.invoke(obj, null);
	}

	/**
	 * 帮指定的obj对象的field字段赋指定的value值
	 * 
	 * @param obj
	 * @param field
	 * @param value
	 * @throws Exception
	 */
	private static void writeValue(Object obj, String fieldName, int value) throws Exception {
		PropertyDescriptor pd = new PropertyDescriptor(fieldName, obj.getClass());
		// PropertyDescriptor pd = new PropertyDescriptor(fieldName,
		// obj.getClass(),"getage", "setage");
		// public Method getWriteMethod()获得应该用于写入属性值的方法
		Method writeMethod = pd.getWriteMethod();// setAge方法
		writeMethod.invoke(obj, value);
	}
}

class Person {
	private int age;
	private String name;

	public Person() {
	}

	public Person(int age, String name) {
		this.age = age;
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Person [age=" + age + ", name=" + name + "]";
	}
}