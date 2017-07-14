package cn.edu360;

import java.io.FileReader;
import java.lang.reflect.Method;
import java.util.Properties;

public class ReflectTest {

	public static void main(String[] args) throws Exception {
		Properties p = new Properties();
		FileReader fr = new FileReader("D:/properties.txt");
		p.load(fr);
		fr.close();

		String className = p.getProperty("className");
		String methodName = p.getProperty("methodName");

		switch (className) {
		case "1":
			className = "cn.edu360.Monday";
			break;
		case "2":
			className = "cn.edu360.Tuesday";
			break;
		case "3":
			className = "cn.edu360.Wednesday";
			break;
		}
		Class clazz = Class.forName(className);
		Method method = clazz.getDeclaredMethod(methodName, null);
		method.setAccessible(true);
		method.invoke(clazz.newInstance(), null);
	}

}
