package cn.edu360_04;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

//客户端上传图片，服务端保存起来
public class UploadClient {

	public static void main(String[] args) throws Exception, IOException {
		// 1.创建客户端socket对象并指定地址和端口
		Socket s = new Socket("127.0.0.1", 8888);
		//2.将字节写出流包装成字节缓冲输出流
		BufferedOutputStream bos = new BufferedOutputStream(s.getOutputStream());
		//3.将要上传的图片封装到流中
		BufferedInputStream bis = new BufferedInputStream(new FileInputStream("E:/奥黛丽赫本.jpg"));
		//自定义缓冲区
		byte[] buf = new byte[1024];
		//记录每次读取的字节长度
		int len;
		//循环读写
		while((len=bis.read(buf))!=-1){
			//读多少写多少
			bos.write(buf, 0, len);
		}
		bos.flush();
		
		//告诉服务端一声，我写完了，没有东西可以写出了
		s.shutdownOutput();
		
		//4.获取服务端反馈
		BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));
		System.out.println(br.readLine());
		//5.关闭资源
		bis.close();
		s.close();
	}

}
