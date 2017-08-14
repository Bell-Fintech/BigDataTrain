package cn.edu360;

import java.io.File;

public class CopyMultiFolderDemo {

	public static void main(String[] args) {
		// 1.将原文件夹封装成File对象
		File srcFolder = new File("E:/aa");
		// 2.将目标文件夹封装成File对象
		File destFolder = new File("D:/");
		// 3.调用拷贝多级文件夹的方法
		IOUtils.copyMultiFolder(srcFolder, destFolder);
		System.out.println("拷贝多级文件夹成功");
	}

}
