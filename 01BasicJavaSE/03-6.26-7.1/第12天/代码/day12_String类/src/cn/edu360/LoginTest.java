package cn.edu360;

import java.util.Scanner;

/*
 * 模拟登录,给三次机会,并提示还有几次。
 *	需要的东西：
 * 		原始账号和密码
 * 		输出的账号和密码
 * 		提示还有几次机会
 * 		如果机会没有了，需要提示账号已被锁定
 */
public class LoginTest {
	public static void main(String[] args) {
		String oldUsername = "xzy";
		String oldPwd = "123456";
		Scanner sc = new Scanner(System.in);
		String inputUsername = null;
		String inputPwd = null;
		for (int i = 0; i < 3; i++) {
			System.out.println("请输入账号：");
			inputUsername = sc.nextLine();
			System.out.println("请输入密码：");
			inputPwd = sc.nextLine();
			if (oldUsername.equals(inputUsername) && oldPwd.equals(inputPwd)) {
				System.out.println("登录成功，3秒钟之后跳转到首页...");
				break;
			} else {
				if(i==2){
					System.out.println("账号已被锁定，请明天再试");
					break;
				}
				//2,1
				System.out.println("账号或者密码错误，你还剩"+(2-i)+"次机会");
			}
		}
	}
}
