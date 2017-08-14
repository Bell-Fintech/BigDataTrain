package nuc.sw.zd.test;


import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
/**
 * 服务端socket,接受用户发送的数据
 * @author Administrator
 *
 */
public class ServerMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			ServerSocket server = new ServerSocket(8899);
			//通过一个死循环来实现服务端的持久开启，不断监听来自客户端的请求
			while(true){				
				Socket socket = server.accept();
				Thread server_thread = new Thread(new ServerThread(socket));
				//监听到客户端的请求，开启线程，调用ServerThread里的run()方法
				server_thread.start(); 
				
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		

	}

}