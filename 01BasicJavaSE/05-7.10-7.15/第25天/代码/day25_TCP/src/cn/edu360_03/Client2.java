package cn.edu360_03;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.util.Scanner;

//客户端文本文件
public class Client2 {

	public static void main(String[] args) throws Exception {
		// 1.创建客户端的socket并指定ip地址和端口号
		Socket s = new Socket("127.0.0.1", 8888);
		// 2.将获取的字节输出流包装成字符缓冲输出流
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(s.getOutputStream()));
		// 3.将文本文件读取的数据发送到服务端
		BufferedReader br = new BufferedReader(new FileReader("D:/test.txt"));
		// 如果录入的是886那么就结束录入
		String content;
		while ((content = br.readLine())!=null) {
			bw.write(content);
			bw.newLine();
			bw.flush();
		}

		// 4.关闭资源
		s.close();
	}
}
