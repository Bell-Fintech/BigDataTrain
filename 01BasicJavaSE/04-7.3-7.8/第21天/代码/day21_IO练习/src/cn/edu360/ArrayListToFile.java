package cn.edu360;

import java.util.ArrayList;

//把ArrayList集合中的字符串数据存储到文本文件
public class ArrayListToFile {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		list.add("javase");
		list.add("javaee");
		list.add("javame");

		String destPath = "D:/list.txt";

		IOUtils.ArrayListToFile(list, destPath);
	}

}
