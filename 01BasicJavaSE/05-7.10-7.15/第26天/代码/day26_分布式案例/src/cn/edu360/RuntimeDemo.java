package cn.edu360;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;

//每个 Java 应用程序都有一个 Runtime 类实例，使应用程序能够与其运行的环境相连接。可以通过 getRuntime 方法获取当前运行时
public class RuntimeDemo {
	public static void main(String[] args) throws Exception {
		Runtime runtime = Runtime.getRuntime();
		// public Process exec(String command)在单独的进程中执行指定的字符串命令
		String command = "java -jar D:/FindJar.jar";
		// 一个新的 Process 对象，用于管理子进程
		Process process = runtime.exec(command);
		// 运行的产物在子进程里面，所以获取数据也应该从子进程中获取
		InputStream in = process.getInputStream();
		BufferedReader br = new BufferedReader(new InputStreamReader(in, "gbk"));
		System.out.println(br.readLine());
		// public abstract void destroy()杀掉子进程。强制终止此 Process 对象表示的子进程
		process.destroy();
		
		// int i = 100;
		// byte[] bs = DataUtils.intTOByte(i);
		// int j = DataUtils.byteToInt(bs);
		// System.out.println(j);
	}
}
