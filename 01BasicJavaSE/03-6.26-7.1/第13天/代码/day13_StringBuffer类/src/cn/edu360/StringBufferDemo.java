package cn.edu360;
/*
 * 如果两个字符串直接相加会在内存中开辟多个空间，浪费内存，如果多个字符串再相加那么开辟的内存就更多了
 * 所以java就提供了一个字符串容器来提高效率并且提供了很多针对字符串的方法
 * StringBuilder：线程不安全
 * StringBuffer：线程安全的
 * StringBuilder和StringBuffer的用法一模一样
 * 
 * public StringBuffer()构造一个其中不带字符的字符串缓冲区，其初始容量为 16 个字符。 
 * public StringBuffer(int capacity)构造一个不带字符，但具有指定初始容量的字符串缓冲区。
 * */
public class StringBufferDemo {

	public static void main(String[] args) {
		//public StringBuffer()构造一个其中不带字符的字符串缓冲区，其初始容量为 16 个字符。 
		StringBuffer sb = new StringBuffer();
		System.out.println(sb.length());//实际值：0	 理论值：16
		//public StringBuffer(int capacity)构造一个不带字符，但具有指定初始容量的字符串缓冲区。
		StringBuffer sb2 = new StringBuffer(32);
		System.out.println(sb2.length());//实际值：0	理论值：32
	}

}
