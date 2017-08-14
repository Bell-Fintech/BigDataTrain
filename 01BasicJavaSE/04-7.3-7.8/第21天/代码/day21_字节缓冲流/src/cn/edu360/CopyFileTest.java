package cn.edu360;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

//把e:\\老鼠爱大米.mp3复制到当前项目目录下的copy.mp3中
//如果你在流关闭之前就有一些数据需要刷新出去，就直接调用flush方法强制刷新;如果数据在流关闭的时候刷新出去也可以，那么就无序调用flush方法，
//因为字节缓冲输出流在关闭流的时候，会调用flush方法，将缓冲区中的数据刷新到硬盘的文件里面 去
public class CopyFileTest {

	public static void main(String[] args) {
		// 先读
		BufferedInputStream bis = null;
		// 后写
		BufferedOutputStream bos = null;
		try {
			// public BufferedInputStream(InputStream in)将传入的字节流保证成缓冲字节流
			bis = new BufferedInputStream(new FileInputStream("E:/a.txt"));
			bos = new BufferedOutputStream(new FileOutputStream("E:/中北大学Java基础视频/day21/代码/day21_字节流练习/test.txt"));
			// 自定义缓冲区
			byte[] buf = new byte[1024];
			// 记录每次读取的字节长度
			int len = -1;
			// 循环读写
			while ((len = bis.read(buf)) != -1) {
				//读多少就写多少
				bos.write(buf, 0, len);
			}
			System.out.println("拷贝成功");
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			// 先创建的后关闭
			IOUtils.closeOut(bos);
			IOUtils.closeIn(bis);
		}
	}

}
