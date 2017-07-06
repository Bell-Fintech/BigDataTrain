package cn.edu360;

import java.io.File;

/*
 * 递归遍历目录下指定后缀名结尾的文件名称
 * 思路：
 * 	1.将指定目录封装成一个File对象
 * 	2.调用搜索指定后缀名文件的方法
 * 	3.判断当前的文件是不是一个标准文件
 * 		出口：如果是就直接判断后缀名是不是要求的后缀名，如果是要求的后缀名就直接输出
 * 		如果不是一个标准的文件，直接开始第4步
 * 	4.规律：获取文件夹底下所有子文件，然后再调用搜索指定后缀名文件的方法
 */
public class DiGuiTest3 {
	public static void main(String[] args) {
		//1.将指定目录封装成一个File对象
		File file = new File("D:/aa");
		//2.调用搜索指定后缀名文件的方法
		searchFileName(file,".jpg");
	}

	private static void searchFileName(File file, String name) {
		//3.判断当前的文件是不是一个标准文件
		if(file.isFile()){
			//出口：如果是就直接判断后缀名是不是要求的后缀名，如果是要求的后缀名就直接输出
			if(file.getName().endsWith(name)){
				System.out.println(file.getAbsolutePath());
			}
		}else{
			//如果不是一个标准的文件，直接开始第4步
			//4.规律：获取文件夹底下所有子文件，然后再调用搜索指定后缀名文件的方法
			File[] files = file.listFiles();
			for(File f : files){
				searchFileName(f, name);
			}
		}
	}
	
}
