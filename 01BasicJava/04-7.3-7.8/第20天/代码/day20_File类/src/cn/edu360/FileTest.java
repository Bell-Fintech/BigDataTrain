package cn.edu360;

import java.io.File;
import java.io.FilenameFilter;

public class FileTest {

	public static void main(String[] args) {
		//判断单级目录下是否有后缀名为.jpg的文件，如果有，就输出此文件名称
		//1.将指定的目录封装成File对象
		File file = new File("E:/");
		//2.使用过滤器，过滤出指定后缀名的文件
		//public String[] list(FilenameFilter filter)返回一个字符串数组，这些字符串指定此抽象路径名表示的目录中满足指定过滤器的文件和目录
		String[] names = file.list(new FilenameFilter() {
			/*
			 * 参数：
					dir - 被找到的文件所在的目录。
					name - 文件的名称。 
				返回：
					当且仅当该名称应该包含在文件列表中时返回 true；否则返回 false。
			 */
			@Override
			public boolean accept(File dir, String name) {
				//判断当前正在过滤的文件是不是一个标准文件
				return new File(dir,name).isFile()?name.endsWith(".jpg"):false;
			}
		});
		System.out.println(names[0]);
		
		/*//2.获取指定目录底下所有的子文件名字数组
		String[] names = file.list();
		//3.遍历所有的名字判断后缀名是否是以.jpg结尾
		for(String name : names){
			if(name.endsWith(".jpg")){
				System.out.println(name);
			}
		}*/
	}

}
