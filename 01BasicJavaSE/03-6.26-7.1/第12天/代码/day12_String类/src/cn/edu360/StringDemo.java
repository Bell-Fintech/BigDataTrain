package cn.edu360;
/*
 * String类其实就是一组字符序列，String可以看成字符数组
 */
public class StringDemo {

	public static void main(String[] args) {
		// public String() 初始化一个新创建的 String 对象，使其表示一个空字符序列。
		String s = new String();
		System.out.println(s);
		
		// public String(byte[] bytes)通过使用平台的默认字符集解码指定的 byte 数组，构造一个新的 String
		byte[] bytes = "小牛学堂".getBytes();//使用的是UTF-8编码集将字符串转换成字节数组
		s = new String(bytes);
		System.out.println(s);
		
		/*
		 * public String(byte[] bytes,int offset,int length)
		 * 	bytes - 要解码为字符的 byte
			offset - 要解码的第一个 byte 的索引
			length - 要解码的 byte 数 
		 */
		System.out.println(bytes.length);
		int offset = 6;//要解码的第一个 byte 的索引
		int length = 6;//要解码的 byte 数 
		s = new String(bytes, offset, length);
		System.out.println(s);
		
		// public String(char[] value)将字符数组转换成字符串
		char[] value = {'中','国','你','好'};
		s = new String(value);
		System.out.println(s);
		
		/*
		 *  public String(char[] value,int offset,int count)
		 *  	value - 作为字符源的数组。
				offset - 初始偏移量。
				count - 长度。
		 */
		s = new String(value,0,2);
		System.out.println(s);
		
		// public String(String original)初始化一个新创建的 String 对象，使其表示一个与参数相同的字符序列；换句话说，新创建的字符串是该参数字符串的副本
		s = new String("中北大学");//"中北大学"是存放在方法区中的常量池里面"，然后把中北大学放在了堆内存中,创建过程一共存在了两个字符串对象
		System.out.println(s);
		
	}

}
