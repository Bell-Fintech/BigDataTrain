package cn.edu360;
/*
 * String类的特点：
	String s = "hello"; s += "world";问s的结果是多少?
	String的值一旦定义就不会改变
	如果声明一个字符串的时候常量池里面有值了，就不在重新创建
 */
public class StringDemo2 {

	public static void main(String[] args) {
		String s = "hello";
		s += "world";//内部创建一个StringBuffer/StringBuilder容器来存放helloworld，然后再将容器里面的helloworld取出来创建一个对象赋值给s
		//s = "hello"+"world";//在常量池中拼接字符串
		System.out.println(s);
		
		String s2 = new String("helloworld");
		//String类的hashCode方法重写了，根据的是内容进行计算的
		System.out.println(s.hashCode());
		System.out.println(s2.hashCode());
		
		String s4 = "哈哈";
		String s3 = "哈哈";
		System.out.println(s3==s4);//true
		
		String s5 = "helloworld";
		System.out.println(s==s5);//false
		
		String s6 = "helloworld";
		System.out.println(s5==s6);//true
		
		
	}

}
