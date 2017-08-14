package cn.edu360;

import java.util.Scanner;

/*
 * 正则表达式：是指一个用来描述或者匹配一系列符合某个句法规则的字符串的单个字符串。其实就是一种规则。有自己特殊的应用。
举例：校验QQ号码
		1.要求必须是5-15位数字
		2.不能以数字0不能开头
 */
public class CheckQQNumber {

	public static void main(String[] args) {
		//qq号码是用户输入的
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入QQ号：");
		String qq = sc.nextLine();
		//调用校验qq号的方法
		boolean b = checkQQ(qq);
		System.out.println(b);
	}

	private static boolean checkQQ(String qq) {
		/*//1.要求必须是5-15位数字
		if(qq.length()>=5 && qq.length()<=15){
			//2.不能以数字0不能开头
			if(!qq.startsWith("0")){
				//是不是全数字
				for(int i=0; i<qq.length(); i++){
					//取出每一个字符进行校验是不是数字字符
					char ch = qq.charAt(i);
					if(!Character.isDigit(ch)){
						return false;
					}
				}
				return true;
			}
		}
		return false;*/
//		return qq.matches("[1-9][0-9]{4,14}");
		//\\d{n,m} \\d，至少 4 次，但是不超过 14 次 
		return qq.matches("[1-9]\\d{4,14}");
	}

}
