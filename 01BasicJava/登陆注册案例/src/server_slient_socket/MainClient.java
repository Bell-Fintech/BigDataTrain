package server_slient_socket;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.UnknownHostException;

public class MainClient
{

    public static void main(String[] args) throws Exception, IOException
    {
        Socket socket=new Socket("127.0.0.1",10001);
        new ClientInputThread(socket).start();;
        new ClientOutputThread(socket).start();;
        
    }
    
}
