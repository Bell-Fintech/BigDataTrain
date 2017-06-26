package cn.edu360;
/*
 * String类的判断功能
	boolean equals(Object obj)比较当前的字符串内容和参数字符串内容是否相等
	boolean equalsIgnoreCase(String str)忽略大小写比较当前的字符串内容和参数字符串内容是否相等
	boolean contains(String str)判断当前字符串是否包含参数字符串
	boolean startsWith(String str)判断当前字符串是否以指定的参数字符串开头
	boolean endsWith(String str)判断当前字符串是否以指定的参数字符串结尾
	boolean isEmpty()判断当前字符串是否为空
 */
public class StringDemo4 {

	public static void main(String[] args) {
		//boolean equals(Object obj)比较当前的字符串内容和参数字符串内容是否相等
		String s = "ABC";
		String s2 = new String("abc");
		System.out.println(s==s2);//false
		System.out.println(s.equals(s2));//false
		
		//boolean equalsIgnoreCase(String str)忽略大小写比较当前的字符串内容和参数字符串内容是否相等
		System.out.println(s.equalsIgnoreCase(s2));//true
		
		//boolean contains(String str)判断当前字符串是否包含参数字符串
		System.out.println(s.contains("AB"));//true
		
		//boolean startsWith(String str)判断当前字符串是否以指定的参数字符串开头
		s = "中国你真好";
		System.out.println(s.startsWith("国"));//false
		
		//boolean endsWith(String str)判断当前字符串是否以指定的参数字符串结尾
		System.out.println(s.endsWith("你1真好"));//false
		
		//boolean isEmpty()判断当前字符串是否为空
		s = "";
		System.out.println(s.isEmpty());//true
	}

}
