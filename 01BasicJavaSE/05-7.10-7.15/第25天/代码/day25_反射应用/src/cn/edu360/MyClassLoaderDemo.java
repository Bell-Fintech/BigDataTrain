package cn.edu360;

public class MyClassLoaderDemo {

	public static void main(String[] args) throws Exception {
		// Student s = new Student();
		// System.out.println(s);

		// ClassLoaderUtils.replace("E:/中北大学Java基础视频/day25/代码/day25_反射应用/bin/cn/edu360/Student.class");

		// ClassLoader classLoader = new ClassLoader() {
		// };
		// Class clazz = classLoader.loadClass("cn.edu360.Student");
		// Object obj = clazz.newInstance();
		// System.out.println(obj);
		
		MyClassLoader myClassLoader = new MyClassLoader();
		Class clazz = myClassLoader.loadClass("E:/中北大学Java基础视频/day25/代码/day25_反射应用/bin/cn/edu360/Student.class");
		Object obj = clazz.newInstance();
		System.out.println(obj);
	}

}
