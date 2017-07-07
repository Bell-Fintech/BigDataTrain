package cn.edu360;

import java.io.BufferedWriter;
import java.io.FileWriter;

public class BufferedWriterdDemo {

	public static void main(String[] args) throws Exception {
		// public BufferedWriter(Writer out)创建一个使用默认大小输出缓冲区的缓冲字符输出流
		BufferedWriter bw = new BufferedWriter(new FileWriter("D:/hh.txt"));
		bw.write("哈哈");
		//BufferedWriter提供了一个特有的方法newLine方法
		bw.newLine();
		bw.write("呵呵");
		bw.close();
	}

}
