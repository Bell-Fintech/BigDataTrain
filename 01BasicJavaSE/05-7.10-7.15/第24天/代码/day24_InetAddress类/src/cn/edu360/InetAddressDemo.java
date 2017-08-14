package cn.edu360;

import java.net.InetAddress;

/*
 * InetAddress：此类表示互联网协议 (IP) 地址
 */
public class InetAddressDemo {
	public static void main(String[] args) throws Exception {
		//public static InetAddress getByName(String host)在给定主机名的情况下确定主机的 IP 地址
		InetAddress inetAddress = InetAddress.getByName("172.18.1.14");
		
		//public String getHostAddress()返回 IP 地址字符串
		System.out.println(inetAddress.getHostAddress());
		
		//public String getHostName()获取此 IP 地址的主机名
		System.out.println(inetAddress.getHostName());
		
		//获取当前电脑的ip地址对象
		//public static InetAddress getLocalHost()返回本地主机
		InetAddress localHost = InetAddress.getLocalHost();
		System.out.println(localHost.getHostName());
		System.out.println(localHost.getHostAddress());
	}

}
