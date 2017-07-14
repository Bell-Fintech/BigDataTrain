package cn.edu360;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

/*
 * 客户端和服务端都有一个socket
 * 
 * DatagramSocket：此类表示用来发送和接收数据报包的套接字
 */
public class Server {
	public static void main(String[] args) throws Exception {
		// 1.创建服务端socket并监听指定端口
		DatagramSocket ds = new DatagramSocket(8888);
		
		//2.构建一个数据包，用于存储客户端发送过来的数据
		byte[] buf = new byte[64*1024];
		int length = buf.length;
		DatagramPacket p = new DatagramPacket(buf, length);
		
		//3.接收客户端发送过来的数据，将数据放在数据包中
		ds.receive(p);
		
		//4.拆包，将数据包中的内容取出来
		InetAddress inetAddress = p.getAddress();
		//获取客户端的ip地址
		String ip = inetAddress.getHostAddress();
		//获取端口号
		int port = p.getPort();
		//获取接收的实际数据长度
		int len = p.getLength();
		//获取数据的缓冲区
		byte[] data = p.getData();
		//将字节数据转换成字符串，接收了多少，就转换多少
		String content = new String(data,0,len);
		System.out.println("ip="+ip+",port="+port+",content="+content);
		
		//5.关闭资源
		ds.close();
		
	}
}
