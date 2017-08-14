package cn.edu360_04;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.net.Socket;

public class ServerRunnable implements Runnable {
	private Socket s;

	public ServerRunnable(Socket s) {
		this.s = s;
	}

	@Override
	public void run() {
		BufferedOutputStream bos = null;
		try {
			// 3.将字节读取流包装成字节缓冲读取流
			BufferedInputStream bis = new BufferedInputStream(s.getInputStream());
			// 4.将图片要写出的目的文件封装在流中
			bos = new BufferedOutputStream(new FileOutputStream("D:/" + System.currentTimeMillis() + ".jpg"));
			// 循环读写
			byte[] buf = new byte[1024];
			int len;
			while ((len = bis.read(buf)) != -1) {
				bos.write(buf, 0, len);
			}

			System.out.println("保存图片成功");
			// 5.给客户度返回结果
			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(s.getOutputStream()));
			bw.write("上传成功");
			bw.newLine();
			bw.flush();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (null != bos) {
				try {
					bos.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			if (null != s) {
				try {
					s.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}

}
