package cn.edu360;

import java.io.File;
/*
 * 判断功能
	public boolean isDirectory()测试此抽象路径名表示的文件是否是一个目录
	public boolean isFile()测试此抽象路径名表示的文件是否是一个标准文件
	public boolean exists()测试此抽象路径名表示的文件或目录是否存在
	public boolean canRead()测试应用程序是否可以读取此抽象路径名表示的文件
	public boolean canWrite()测试应用程序是否可以修改此抽象路径名表示的文件
	public boolean isHidden()测试此抽象路径名指定的文件是否是一个隐藏文件
 */
public class FileDemo3 {
	public static void main(String[] args) {
		//public boolean isDirectory()测试此抽象路径名表示的文件是否是一个目录
		File file = new File("E:/修仙.txt");
		System.out.println(file.isDirectory());
		
		
		//public boolean isFile()测试此抽象路径名表示的文件是否是一个标准文件
		System.out.println(file.isFile());
		
		//public boolean exists()测试此抽象路径名表示的文件或目录是否存在
		//file = new File("E:/hhhh.txt");
		System.out.println(file.exists());
		//public boolean canRead()测试应用程序是否可以读取此抽象路径名表示的文件
		System.out.println(file.canRead());
		
		//public boolean canWrite()测试应用程序是否可以修改此抽象路径名表示的文件
		System.out.println(file.canWrite());
		
		//public boolean isHidden()测试此抽象路径名指定的文件是否是一个隐藏文件
		file = new File("F:/36273907ffa82a307b34302542ea14ce");
		System.out.println(file.isHidden());
	}
}