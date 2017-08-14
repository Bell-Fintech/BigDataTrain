package cn.edu360;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

/*
 * 客户端和服务端都有一个socket
 * 
 * DatagramSocket：此类表示用来发送和接收数据报包的套接字
 */
public class Client {
	public static void main(String[] args) throws Exception {
		// 1.创建客户端的socket对象
		// public DatagramSocket()构造数据报套接字并将其绑定到本地主机上任何可用的端口
		DatagramSocket ds = new DatagramSocket();

		// 2.构建数据包，将要发送的内容，ip地址，端口号都封装在数据包中
		// public DatagramPacket(byte[] buf,int length,InetAddress address,int
		// port)构造数据报包，用来将长度为 length 的包发送到指定主机上的指定端口号
		String content = "udp，我来了~";
		byte[] buf = content.getBytes();// 包数据
		int length = buf.length;// 包长度
		InetAddress address = InetAddress.getByName("172.18.0.255");// 目的地址
		int port = 8888;// 目的端口号
		DatagramPacket p = new DatagramPacket(buf, length, address, port);
		
		// 3.发送数据包
		// public void send(DatagramPacket p)从此套接字发送数据报包
		ds.send(p);
		
		//4.关闭资源
		ds.close();
	}
}
