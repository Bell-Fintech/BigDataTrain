package cn.edu360;

import java.util.Scanner;

/*
 * public boolean matches(String regex)告知此字符串是否匹配给定的正则表达式。
	校验电话号码
		18811131234
		15712132323
		15534324234
		18343543534
		13889089090
		14789800098
		18589089089
		17880980090
		15280980909
		13589089000
	校验邮箱
		274254@qq.com
		xzy@163.com
		xzy@gmail.com
		xzy@vip.com.cn
		xzy@sina.com.cn
		xzy@126@.com
 */
public class RegexDemo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 校验电话号码
		// boolean b = checkPhoneNumber(sc);
		// System.out.println(b);
		boolean b = checkEmail(sc);
		System.out.println(b);
	}

	private static boolean checkEmail(Scanner sc) {
		System.out.println("请输入要校验的邮箱：");
		String email = sc.nextLine();
		// String regex = "[a-zA-Z_0-9]+@[a-zA-Z_0-9]+(\\.[a-zA-Z_0-9]{2,3})+";
		String regex = "\\w+@\\w+(\\.\\w{2,3})+";
		return email.matches(regex);
	}

	private static boolean checkPhoneNumber(Scanner sc) {
		System.out.println("请输入手机号码：");
		String phoneNumber = sc.nextLine();
		// 校验电话号码
		String regex = "1[34578]\\d{9}";
		boolean b = phoneNumber.matches(regex);
		return b;
	}
}
