package cn.edu360;

import java.io.File;

/*
 *	 创建功能
		public boolean createNewFile()当且仅当不存在具有此抽象路径名指定名称的文件时，不可分地创建一个新的空文件
		public boolean mkdir()创建此抽象路径名指定的目录
		public boolean mkdirs()创建此抽象路径名指定的目录，包括所有必需但不存在的父目录
	删除功能
		public boolean delete()删除此抽象路径名表示的文件或目录
	重命名功能
		public boolean renameTo(File dest) 剪切并且重新命名此抽象路径名表示的文件
 */
public class FileDemo2 {

	public static void main(String[] args) throws Exception {
		//File file = new File("D:/haha.txt");
		// public boolean createNewFile()当且仅当不存在具有此抽象路径名指定名称的文件时，不可分地创建一个新的空文件
		//System.out.println(file.createNewFile());
		
		//public boolean mkdir()创建此抽象路径名指定的目录
		//file = new File("D:/haha");
		//System.out.println(file.mkdir());
		
		//public boolean mkdirs()创建此抽象路径名指定的目录，包括所有必需但不存在的父目录
		//file = new File("D:/haha/houhou/heihei");
		//System.out.println(file.mkdirs());
		
		//public boolean delete()删除此抽象路径名表示的文件或目录，此方法只能删除单级不存在子文件的文件夹
		//file = new File("D:/haha");
		//System.out.println(file.delete());
		
		//public boolean renameTo(File dest) 剪切并且重新命名此抽象路径名表示的文件
		File dest = new File("E:/temp.txt");
		File file = new File("D:/haha.txt");
		file.renameTo(dest);
	}

}
