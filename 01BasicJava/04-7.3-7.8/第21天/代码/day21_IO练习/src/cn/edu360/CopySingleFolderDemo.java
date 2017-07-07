package cn.edu360;

import java.io.File;

/*
 * 复制单极文件夹
	复制单极文件夹中指定文件并修改文件名称
 */
public class CopySingleFolderDemo {
	public static void main(String[] args) {
		// 1.将目标文件夹封装成File对象
		File srcFolder = new File("D:/dd");
		// 2.将目标盘符封装成File对象
		File destFolder = new File("E:/");
		IOUtils.copySingleFolder(srcFolder, destFolder);
	}

}
