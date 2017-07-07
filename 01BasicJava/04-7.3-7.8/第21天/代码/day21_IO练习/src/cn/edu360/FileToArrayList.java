package cn.edu360;

import java.util.ArrayList;

//从文本文件中读取数据(每一行为一个字符串数据)到集合中，并遍历集合
public class FileToArrayList {

	public static void main(String[] args) {
		String srcPath = "D:/list.txt";
		ArrayList<String> list = IOUtils.FileToArrayList(srcPath);
		for (String value : list) {
			System.out.println(value);
		}
	}
}
