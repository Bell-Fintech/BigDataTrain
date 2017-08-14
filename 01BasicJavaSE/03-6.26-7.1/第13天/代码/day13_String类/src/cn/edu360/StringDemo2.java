package cn.edu360;
/*
 * String类的转换功能
	byte[] getBytes()根据平台默认的编码将此字符串转换成字节数组
	char[] toCharArray()将此字符串转换成字符数组
	static String valueOf(char[] chs)将字符数组转换成字符串
	static String valueOf(int i)将一个int类型的值转换成字符串
	String toLowerCase()将此字符串转换成小写
	String toUpperCase()将此字符串转换成大写
	String concat(String str)将此字符串和参数字符串拼接成一个新的字符串
 */
public class StringDemo2 {

	public static void main(String[] args) {
		String s = "今天是个好日子";
		// byte[] getBytes()根据平台默认的编码将此字符串转换成字节数组
		byte[] bytes = s.getBytes();
		System.out.println(bytes.length);

		// char[] toCharArray()将此字符串转换成字符数组
		char[] charArray = s.toCharArray();
		System.out.println(charArray.length);

		// static String valueOf(char[] chs)将字符数组转换成字符串
		System.out.println(String.valueOf(charArray));

		// static String valueOf(int i)将一个int类型的值转换成字符串
		int i = 100;
		System.out.println(i + "");
		System.out.println(String.valueOf(i));

		// String toLowerCase()将此字符串转换成小写
		s = "AjlJHHAAjljl";
		String lowerCase = s.toLowerCase();
		System.out.println(s);
		System.out.println(lowerCase);
		
		// String toUpperCase()将此字符串转换成大写
		String upperCase = s.toUpperCase();
		System.out.println(s);
		System.out.println(upperCase);
		
		// String concat(String str)将此字符串和参数字符串拼接成一个新的字符串
		String s2 = "哈哈哈哈哈";
		System.out.println(s+s2);
		System.out.println(s.concat(s2));
	}
}