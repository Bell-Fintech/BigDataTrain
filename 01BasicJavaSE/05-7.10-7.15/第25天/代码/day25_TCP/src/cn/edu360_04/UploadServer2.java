package cn.edu360_04;

import java.net.ServerSocket;
import java.net.Socket;

public class UploadServer2 {
	public static void main(String[] args) throws Exception {
		// 1.创建服务端的Socket对象并监听指定的端口
		ServerSocket ss = new ServerSocket(8888);
		while (true) {
			// 2.获取客户端的连接对象
			Socket s = ss.accept();
			//接收到新的连接就扔给子线程处理，和主线程就没有关系了，主线程就可以继续接收下一个客户端的连接了
			ServerRunnable serverRunnable = new ServerRunnable(s);
			ThreadPoolUtils.execute(serverRunnable);
		}
	}
}
