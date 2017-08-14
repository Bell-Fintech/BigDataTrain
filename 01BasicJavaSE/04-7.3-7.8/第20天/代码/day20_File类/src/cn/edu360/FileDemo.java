package cn.edu360;

import java.io.File;

/*
 * File：文件和目录路径名的抽象表示形式
 */
public class FileDemo {

	public static void main(String[] args) {
		//public File(String pathname)通过将给定路径名字符串转换为抽象路径名来创建一个新 File 实例。
		String pathname = "E:/中北大学Java基础视频/day19/代码/IO章节内容介绍.png";
		File file = new File(pathname);
		
		//public File(File parent,String child)根据 parent 抽象路径名和 child 路径名字符串创建一个新 File 实例
		//String parent = "E:/中北大学Java基础视频/day19/";
		//String child = "代码/IO章节内容介绍.png";
		//file = new File(parent,child);
		
		//public File(File parent,String child)根据 parent 抽象路径名和 child 路径名字符串创建一个新 File 实例
		File parent = new File("E:/中北大学Java基础视频/day19/代码/");
		String child = "IO章节内容介绍.png";
		file = new File(parent,child);
	}

}
