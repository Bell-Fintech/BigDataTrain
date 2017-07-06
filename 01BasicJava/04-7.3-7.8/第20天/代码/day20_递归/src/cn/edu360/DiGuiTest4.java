package cn.edu360;

import java.io.File;
/*
 * 递归删除一个带内容的文件夹
	思路：
		1.将删除的文件夹封装成File对象
		2.直接调用删除文件夹的方法
		3.判断当前的文件是不是一个标准的文件
			如果是就直接删除
			如果不是，继续第4步
		4.获取文件夹底下所有的子文件，然后遍历删除所有的子文件之后再删除当前的文件
 */
public class DiGuiTest4 {

	public static void main(String[] args) {
		//1.将删除的文件夹封装成File对象
		File file = new File("E:/aa");
		//delete方法只能删除空的文件夹
		//System.out.println(file.delete());
		//2.直接调用删除文件夹的方法
		deleteFolder(file);
	}

	private static void deleteFolder(File file) {
		//3.判断当前的文件是不是一个标准的文件
		if(file.isFile()){
			//如果是就直接删除
			file.delete();
		}else{
			//如果不是，继续第4步
			//4.获取文件夹底下所有的子文件，然后遍历删除所有的子文件之后再删除当前的文件
			File[] files = file.listFiles();
			for(File childFile : files){
				//调用删除方法
				deleteFolder(childFile);
			}
			//删除自己，现在这个file就是一个空文件夹了
			file.delete();
		}
	}

}
