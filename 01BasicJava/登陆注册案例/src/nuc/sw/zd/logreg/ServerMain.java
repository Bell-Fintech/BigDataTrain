package nuc.sw.zd.logreg;


import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
/**
 * 服务端socket,接受用户发送的数据
 * @author Administrator
 *
 */
public class ServerMain implements Runnable{

	/**
	 * @param args
	 */
	public static void main(String[] args) {
	}

	@Override
	public void run() {
		ServerSocket server=null;
		try {
			 server= new ServerSocket(8888);
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