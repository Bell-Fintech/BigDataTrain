package cn.edu360;
/*
Character类概述
	Character 类在对象中包装一个基本类型 char 的值此外，该类提供了几种方法，以确定字符的类别（小写字母，数字，等等），
	并将字符从大写转换成小写，反之亦然
构造方法
	public Character(char value)
Character 类在对象中包装一个基本类型 char 的值
 */
public class CharacterDemo {
	public static void main(String[] args) {
		Character c = 'a';//自动装箱
		// public static boolean isUpperCase(char ch)
		System.out.println(Character.isUpperCase(c));//false
		
		// public static boolean isLowerCase(char ch)
		System.out.println(Character.isLowerCase(c));//true
		
		// public static boolean isDigit(char ch)
		System.out.println(Character.isDigit(c));//false
		
		// public static char toUpperCase(char ch)
		System.out.println(Character.toUpperCase(c));
		System.out.println(c);
		
		// public static char toLowerCase(char ch)
		System.out.println(Character.toLowerCase(c));
		System.out.println(c);

	}
}
