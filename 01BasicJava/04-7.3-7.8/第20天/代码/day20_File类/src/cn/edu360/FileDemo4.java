package cn.edu360;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;

/*
 * 	基本获取功能
		public String getAbsolutePath()获取绝对路径
		public String getPath()获取相对路径
		public String getName()获取文件的名字
		public long length()获取文件的字节长度
		public long lastModified()获取修改文件的最后时间
	高级获取功能
		public String[] list()返回一个字符串数组，这些字符串指定此抽象路径名表示的目录中的文件和目录
		public File[] listFiles()返回一个抽象路径名数组，这些路径名表示此抽象路径名表示的目录中的文件
 */
public class FileDemo4 {

	public static void main(String[] args) {
		File file = new File("./src/cn/edu360/FileDemo3.java");
		//public String getAbsolutePath()获取绝对路径
		System.out.println(file.getAbsolutePath());
		
		//public String getPath()获取相对路径
		System.out.println(file.getPath());
		
		//public String getName()获取文件的名字
		System.out.println(file.getName());
		
		//public long length()获取文件的字节长度
		System.out.println(file.length());
		
		//public long lastModified()获取修改文件的最后时间
		System.out.println(new SimpleDateFormat().format(new Date(file.lastModified())));
		
		//public String[] list()返回一个字符串数组，数组中是子文件的文件名称
		file = new File("D:/");
		String[] list = file.list();
		System.out.println(Arrays.toString(list));
		
		//public File[] listFiles()返回一个抽象路径名数组，这些路径名表示此抽象路径名表示的目录中的文件
		File[] files = file.listFiles();
		for(File f : files){
			System.out.println(f.getAbsolutePath());
			//System.out.println(f.getPath());
		}
	}

}
