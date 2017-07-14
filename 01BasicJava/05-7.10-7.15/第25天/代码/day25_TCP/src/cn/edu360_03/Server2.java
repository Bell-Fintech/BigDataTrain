package cn.edu360_03;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;
//服务器输出文本文件
public class Server2 {

	public static void main(String[] args) throws Exception {
		// 1.创建服务端的Socket并监听指定的端口
		ServerSocket ss = new ServerSocket(8888);
		while (true) {//可以一直接收客户端的连接
			// 2.获取客户端的连接
			Socket s = ss.accept();
			// 3.将字节读取流包装成字符缓冲读取流
			BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));
			BufferedWriter bw = new BufferedWriter(new FileWriter("D:/test.txt",true));
			// 4.循环读取
			String content;
			while ((content = br.readLine()) != null) {
				bw.write(content);
				bw.newLine();
			}
			System.out.println("保存成功");
			// 4.关闭连接
			bw.close();
			s.close();
			
		}
	}

}
