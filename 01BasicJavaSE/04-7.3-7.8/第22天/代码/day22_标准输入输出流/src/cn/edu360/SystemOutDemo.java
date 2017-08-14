package cn.edu360;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;

public class SystemOutDemo {

	public static void main(String[] args) throws Exception {
		//返回的是字节输出流
		OutputStream out = System.out;
		//将字节输出流保证成字符输出流
		OutputStreamWriter osw = new OutputStreamWriter(out);
		//是将字符输出流保证成字符缓冲输出流
		BufferedWriter bw = new BufferedWriter(osw);
		bw.write("哈哈");
		bw.newLine();
		bw.write("哈哈");
		bw.newLine();
		bw.write("哈哈");
		bw.newLine();
		bw.flush();
		//bw.close();
	}

}
