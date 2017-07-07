package cn.edu360;

import java.io.BufferedReader;
import java.io.FileReader;

public class BufferedReaderDemo {

	public static void main(String[] args) throws Exception {
		// public BufferedReader(Reader in)创建一个使用默认大小输入缓冲区的缓冲字符输入流
		BufferedReader br = new BufferedReader(new FileReader("D:/hh.txt"));
		//public String readLine() throws IOException读取一个文本行,如果已到达流末尾，则返回 null 
		System.out.println(br.readLine());
		System.out.println(br.readLine());
		System.out.println(br.readLine());
	}

}
