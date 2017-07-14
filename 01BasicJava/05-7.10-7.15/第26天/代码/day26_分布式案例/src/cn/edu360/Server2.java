package cn.edu360;

import java.net.ServerSocket;
import java.net.Socket;

public class Server2 {

	public static void main(String[] args) throws Exception {
		// 1.创建服务端是的Socket对象并监听指定的端口
		ServerSocket ss = new ServerSocket(8888);

		while (true) {
			// 2.获取客户端的连接对象
			Socket s = ss.accept();
			ServerRunnable serverRunnable = new ServerRunnable(s);
			ThreadPoolUtils.execute(serverRunnable);
		}

	}

}
