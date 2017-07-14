package server_slient_socket;

import java.net.ServerSocket;
import java.net.Socket;

public class MainServer
{
	 static ServerSocket server = null;
    public static void main(String[] args) throws Exception
    {
        while(true)//一直监听10000端口号
        {
        	server=new ServerSocket(10000);
             Socket socket=server.accept();
             //启动读写线程
             new ServerInputThread(socket).start();;
             new ServerOutputThread(socket).start();;
        }
    }
}
