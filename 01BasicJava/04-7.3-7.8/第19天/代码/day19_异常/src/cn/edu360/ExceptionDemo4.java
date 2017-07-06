package cn.edu360;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
/*
 * 异常分为两类：
 * 	运行时期异常：RuntimeException及其子类的异常
 * 	编译时期异常：除了RuntimeException及其子类的异常
 * 运行时期异常：可以显示处理，也可以更改代码处理
 * 编译时期异常：必须显示处理，要不然编译不通过，无法运行
 */
public class ExceptionDemo4 {
	public static void main(String[] args) {
		//new SimpleDateFormat().parse("");//编译时期异常
		//int i = 1 / 0;//运行时期异常
		try {
			 int i = 1 / 0;
		} catch (Exception e) {
			// public String getMessage()返回此 throwable 的详细消息字符串
			// System.out.println(e.getMessage());/// by zero

			// public String toString()返回此 throwable 的简短描述
			// System.out.println(e.toString());//java.lang.ArithmeticException:
			// / by zero

			// 将此 throwable 及其追踪输出至标准错误流
			// e.printStackTrace();
			/*
			 * java.lang.ArithmeticException: / by zero at
			 * cn.edu360.ExceptionDemo4.main(ExceptionDemo4.java:6)
			 */

			PrintWriter s = null;
			try {
				s = new PrintWriter("D:/error.log");
				// public void printStackTrace(PrintWriter s)将此 throwable
				// 及其追踪输出到指定的 PrintWriter
				e.printStackTrace(s);
			} catch (FileNotFoundException e1) {
				e1.printStackTrace();
			} finally {
				if (null != s) {
					s.close();
				}
			}
		}
	}
}
