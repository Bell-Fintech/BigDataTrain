package cn.edu360;

import java.util.Scanner;

/*
 * public Scanner(InputStream source)构造一个新的 Scanner，它生成的值是从指定的输入流扫描的
 * 在读取数据之前，我们可以先用hasXxx方法判断一下键盘录入的数据是否和想要接收的数据一致，如果要的类型是int，那么就可以用hasNextInt判断一下
 * next：只接收有效字符
 * nextLine：可以接收所有字符
 */
public class ScannerDemo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);	
/*		if (sc.hasNextInt()) {
			int number = sc.nextInt();
			// java.util.InputMismatchException
			System.out.println(number);
		}*/
		String s = sc.nextLine();
		System.out.println(s);
	}

}
