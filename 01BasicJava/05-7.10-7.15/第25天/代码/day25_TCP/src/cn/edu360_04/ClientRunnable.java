package cn.edu360_04;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

public class ClientRunnable implements Runnable {
	private String ip;
	private int port;
	private String srcPath;

	/**
	 * 将指定的图片文件上传到指定的地址和端口
	 * 
	 * @param ip
	 *            服务端的地址
	 * @param port
	 *            服务端的端口
	 * @param srcPath
	 *            文件的路径
	 */
	public ClientRunnable(String ip, int port, String srcPath) {
		this.ip = ip;
		this.port = port;
		this.srcPath = srcPath;
	}

	@Override
	public void run() {
		Socket s = null;
		BufferedInputStream bis = null;
		try {
			// 1.将要上传的图片封装到流中
			bis = new BufferedInputStream(new FileInputStream(srcPath));
			// 2.创建客户端socket对象并指定地址和端口
			s = new Socket(ip, port);
			// 3.将字节写出流包装成字节缓冲输出流
			BufferedOutputStream bos = new BufferedOutputStream(s.getOutputStream());
			// 自定义缓冲区
			byte[] buf = new byte[1024];
			// 记录每次读取的字节长度
			int len;
			// 循环读写
			while ((len = bis.read(buf)) != -1) {
				// 读多少写多少
				bos.write(buf, 0, len);
			}
			bos.flush();

			// 告诉服务端一声，我写完了，没有东西可以写出了
			s.shutdownOutput();

			// 4.获取服务端反馈
			BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));
			System.out.println(br.readLine());
			// 5.关闭资源
			bis.close();
			s.close();
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			if(null!=s){
				try {
					s.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			if(null!=bis){
				try {
					bis.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}

}
