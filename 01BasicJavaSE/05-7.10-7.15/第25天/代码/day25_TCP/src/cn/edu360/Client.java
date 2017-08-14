package cn.edu360;

import java.io.OutputStream;
import java.net.Socket;

/*
 * Socket：此类实现客户端套接字
 */
public class Client {

	public static void main(String[] args) throws Exception {
		// 1.创建客户端的Socket，指定地址和端口号
		// public Socket(String host,int port)创建一个流套接字并将其连接到指定主机上的指定端口号
		Socket s = new Socket("172.18.0.1", 8888);
		// 2.获取输出流
		OutputStream out = s.getOutputStream();
		// 3.将数据写出去
		String content = "tcp，我来了~";
		out.write(content.getBytes());
		// 4.关闭资源
		s.close();
	}

}
