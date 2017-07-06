package cn.edu360;

import java.text.ParseException;
import java.text.SimpleDateFormat;

/*
 * 
 * 	throws
		用在方法声明后面，跟的是异常类名
		可以跟多个异常类名，用逗号隔开
		表示抛出异常，由该方法的调用者来处理
		throws表示出现异常的一种可能性，并不一定会发生这些异常
	throw
		用在方法体内，跟的是异常对象名
		只能抛出一个异常对象名
		表示抛出异常，由方法体内的语句处理
		throw则是抛出了异常，执行throw则一定抛出了某种异常  
 * 我们应该怎么处理异常？
 * 	如果在方法内部可以将异常处理，那么就用try...catch
 * 	如果在方法内部异常处理不了，就用throws抛给上层调用者处理
 * 	如果后续代码想要继续运行就用try...catch，如果后续代码不用运行就用throws
 */
public class ThrowDemo {

	public static void main(String[] args)  {
		try {
			test2();
		} catch (ParseException e) {
			e.printStackTrace();
		}
		System.out.println("over");
	}

	//抛出编译时期异常
	private static void test2()throws ParseException {
		try {
			new SimpleDateFormat().parse("");
		} catch (ParseException e) {
			throw new ParseException("给的字符串 日期是空的",17);
		}
	}

	//抛出运行时期异常对象
	private static void test() {
		try {
			int i = 1 / 0;
		} catch (Exception e) {
			// public ArithmeticException(String s)构造具有指定详细消息的
			// ArithmeticException
			throw new ArithmeticException("除数为零了");
		}
	}
	

}
