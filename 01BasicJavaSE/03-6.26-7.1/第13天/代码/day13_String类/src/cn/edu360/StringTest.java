package cn.edu360;

import java.util.Scanner;

//字符串反转，例如键盘录入abc，输出cba
public class StringTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入想要输入的内容：");
		String line = sc.nextLine();
		char[] charArray = line.toCharArray();
		for(int start=0,end=charArray.length-1;start<end; start++,end--){
			char temp = charArray[start];
			charArray[start] = charArray[end];
			charArray[end] = temp;
		}
		String result = new String(charArray);
		System.out.println(result);
	}
}
