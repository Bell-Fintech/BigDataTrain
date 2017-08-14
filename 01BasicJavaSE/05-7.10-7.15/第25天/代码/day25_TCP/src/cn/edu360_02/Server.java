package cn.edu360_02;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {

	public static void main(String[] args) throws Exception {
		// 1.建立服务端socket对象并监听指定的端口
		ServerSocket ss = new ServerSocket(8888);
		// 2.获取连接对象
		Socket s = ss.accept();
		// 3.获取字节读取流
		InputStream in = s.getInputStream();
		// 4.将字节读取流包装成字符缓冲读取流
		BufferedReader br = new BufferedReader(new InputStreamReader(in));
		// 5.读取内容
		String content = br.readLine();
		System.out.println(content);
		//6.获取字节写出流
		OutputStream out = s.getOutputStream();
		//7.将字节写出流包装成字符缓冲写出流
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(out));
		//8.将结果返回给客户端
		bw.write("不在，没钱");
		bw.newLine();
		bw.flush();
		//9.关闭资源
		s.close();
		ss.close();
	}

}
