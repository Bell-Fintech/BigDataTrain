package cn.edu360_02;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.Socket;

public class Client {

	public static void main(String[] args) throws Exception, IOException {
		// 1.建立客户端的socket指定ip地址和端口号
		Socket s = new Socket("127.0.0.1", 8888);
		//2.获取字节输出流
		OutputStream out = s.getOutputStream();
		//3.将字节输出流包装成字符缓冲输出流
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(out));
		//4.将字符串数据写出
		bw.write("在吗？借点钱");
		bw.newLine();
		bw.flush();
		//5.获取字节读取流
		InputStream in = s.getInputStream();
		//6.将字节读取流包装成字符缓冲读取流
		BufferedReader br = new BufferedReader(new InputStreamReader(in));
		System.out.println(br.readLine());
		//7.关闭资源
		s.close();
	}

}
