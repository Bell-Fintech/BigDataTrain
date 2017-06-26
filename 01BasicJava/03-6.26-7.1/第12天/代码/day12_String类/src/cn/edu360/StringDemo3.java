package cn.edu360;

public class StringDemo3 {

	public static void main(String[] args) {
		//String s2 = new String("hello")和String s3 = "hello";的区别?
		//创建的过程中有两个对象
		String s = new String("hello");//首先会在常量池中创建一个hello的值，然后再在堆中创建一个内存空间再将常量池中的hello拷贝到堆内存中
		//一共只有一个对象
		String s2 = "hello";//首先在常量池中找有没有hello这个字符串，如果有就直接赋值，没有就创建一个
	}

}
