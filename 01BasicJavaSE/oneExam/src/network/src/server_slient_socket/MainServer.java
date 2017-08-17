package network.src.server_slient_socket;

import java.net.ServerSocket;
import java.net.Socket;

public class MainServer
{
    public static void main(String[] args) throws Exception
    {
        ServerSocket serverSocket = new ServerSocket(10001);
        while(true)//一直监听10000端口号
        {
             Socket socket=serverSocket.accept();
             //启动读写线程
             new ServerInputThread(socket).start();;
             new ServerOutputThread(socket).start();;
        }
    }
}
