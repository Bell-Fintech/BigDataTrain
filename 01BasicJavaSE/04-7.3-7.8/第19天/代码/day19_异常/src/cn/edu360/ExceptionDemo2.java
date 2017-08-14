package cn.edu360;

import java.text.ParseException;
import java.text.SimpleDateFormat;

/*
 * 处理异常的方式：
 * 	try...catch
 * try{
 * 	可能发生异常的代码
 * }catch(异常的类名 异常的对象名){
 * 	对异常的处理方案
 * }
 */
public class ExceptionDemo2 {
	public static void main(String[] args) {
		test4();
		System.out.println("over");
	}

	//一般开发中处理异常的捕获方式
	private static void test4() {
		try {
			int i = 1 / 0;
			new SimpleDateFormat().parse("");
		} catch (Exception e) {//表示所有的异常可以捕获
			e.printStackTrace();
		}		
	}

	//JDK1.7新特性可以将多个异常捕获用"|"连接到一起，在这个新特性里面不能存在子父类关系
	private static void test3() {
		try{
			int i = 1 / 0;
			new SimpleDateFormat().parse("");
		}catch (ArithmeticException | ParseException e) {//JDK1.7新特性
			//多个异常通享一种处理方式
		}
	}

	//将多个异常合并到一起，如果捕获的异常存在子父类关系时，最大的异常捕获必须放在最后面
	private static void test2() {
		try {
			int i = 1 / 0;
			new SimpleDateFormat().parse("");
		} catch (ArithmeticException e) {
			e.printStackTrace();
		}catch (ParseException e) {
			e.printStackTrace();
		}catch (Exception e) {//表示所有的异常可以捕获
			
		}
	}

	//两个异常的处理方式
	private static void test() {
		try {
			int i = 1 / 0;
		} catch (ArithmeticException e) {
			e.printStackTrace();
		}
		try {
			new SimpleDateFormat().parse("");
		} catch (ParseException e) {
			e.printStackTrace();
		}
	}

}
