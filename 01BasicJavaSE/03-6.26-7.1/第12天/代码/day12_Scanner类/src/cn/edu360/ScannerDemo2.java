package cn.edu360;

import java.util.Scanner;

/*
 * Scanner类接收数据的时候会以回车，空格作为结束标记
 * 先nextInt，然后再nextLine会有问题如何解决呢？
 * 	可以将所有的数据都用nextLine接收，然后再强转
 */
public class ScannerDemo2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		/*System.out.println(sc.nextInt());
		System.out.println(sc.nextInt());
		System.out.println(sc.nextInt());*/
		if(sc.hasNextInt()){
						//将数字字符串转换成int类型
			int number = Integer.parseInt(sc.nextLine());
			System.out.println(number);
		}
		String s = sc.nextLine();
		System.out.println(s);
	}

}
