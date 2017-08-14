package cn.edu360;

import java.text.ParseException;
import java.text.SimpleDateFormat;
/*
 * throws是跟着方法的后面直接抛出某个异常的类名，代表的是抛出某个异常的可能,如果抛出的是多个异常，则用","隔开
 */
public class ThrowsDemo {

	public static void main(String[] args)throws ParseException {//抛给JVM
		test2();
		System.out.println("over");
	}

	private static void test2()throws ParseException,NullPointerException {//抛给main方法
		new SimpleDateFormat().parse("17-7-4 下午3:52");
	}

	//抛出运行时期异常
	private static void test()throws ArithmeticException {
		int i = 1/0;
	}
}
