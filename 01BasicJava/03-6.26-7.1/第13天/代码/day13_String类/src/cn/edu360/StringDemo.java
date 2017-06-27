package cn.edu360;
/*
 * String s = “abcJJLKjlkJLKJ89HKJhhHJ789HJ889H”;
课堂练习：
	1：遍历获取字符串中的每一个字符
	2：统计一个字符串中大写字母字符，小写字母字符，数字字符出现的次数。(不考虑其他字符)
 * */
public class StringDemo {
	public static void main(String[] args) {
		String s = "abcJJLKjlkJLKJ89HKJhhHJ789HJ889H";
		//2：统计一个字符串中大写字母字符，小写字母字符，数字字符出现的次数。(不考虑其他字符)
		int uppCaseCount = 0;
		int lowCaseCount = 0;
		int digitCount = 0;
		
		//1：遍历获取字符串中的每一个字符
		for(int i=0; i<s.length(); i++){
			//charAt
			char ch = s.charAt(i);
			System.out.print(ch+" ");
			if(ch>='A' && ch<='Z'){
				uppCaseCount++;
			}else if(ch>='a' && ch<='z'){
				lowCaseCount++;
			}else if(ch>='0' && ch<='9'){
				digitCount++;
			}
		}
		System.out.println();
		System.out.println("大写字母个数："+uppCaseCount);
		System.out.println("小写字母个数："+lowCaseCount);
		System.out.println("数字字符个数："+digitCount);
	}
}