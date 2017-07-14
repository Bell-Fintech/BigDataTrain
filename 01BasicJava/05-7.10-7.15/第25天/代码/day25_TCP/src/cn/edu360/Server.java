package cn.edu360;

import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

/*
 * ServerSocket：此类实现服务器套接字
 */
public class Server {

	public static void main(String[] args) throws Exception {
		// 1.创建服务端的Socket对象，并监听指定端口
		// public ServerSocket(int port)创建绑定到特定端口的服务器套接字
		ServerSocket ss = new ServerSocket(8888);
		// 2.接收客户端的连接
		// 侦听并接受到此套接字的连接
		Socket s = ss.accept();// 阻塞式
		// 3.获取读取流
		InputStream in = s.getInputStream();
		byte[] buf = new byte[1024];
		int len = in.read(buf);
		// 4.将读取的字节数据转换成字符串
		String content = new String(buf, 0, len);
		System.out.println(content);
		// 5.关闭资源
		s.close();
		ss.close();
	}

}
