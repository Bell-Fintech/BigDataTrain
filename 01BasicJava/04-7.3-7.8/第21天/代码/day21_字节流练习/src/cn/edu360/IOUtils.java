package cn.edu360;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

//IO流的一个工具类
public class IOUtils {
	/**
	 * 拷贝文件
	 * @param srcPath	原文件路径
	 * @param destPath	目标文件路径
	 */
	public static void copyFile(String srcPath, String destPath) {
		// 先读：先将原文件读取成字节
		FileInputStream fis = null;
		// 后写：将字节写出到目标文件中
		FileOutputStream fos = null;
		try {
			fis = new FileInputStream(srcPath);
			fos = new FileOutputStream(destPath);
			//定义一个缓冲区，用于读取数据的容器
			byte[] buf = new byte[1024];
			//定义一个变量用于记录每次读取的字节个数
			int len = -1;
			//循环读写
			while((len=fis.read(buf))!=-1){//只要读取的长度不等于-1就表明还有数据可以读取
				//读多少就写多少
				fos.write(buf, 0, len);
			}
			System.out.println("拷贝成功");
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			//先创建的后关闭
			IOUtils.closeOut(fos);
			IOUtils.closeIn(fis);
		}
	}
	
	/**
	 * 关闭字节读取流
	 * @param fis
	 */
	public static void closeIn(InputStream fis) {
		if(null!=fis){
			try {
				fis.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	/**
	 * 关闭字节输出流
	 * @param fos
	 */
	public static void closeOut(OutputStream fos) {
		if(null!=fos){
			try {
				fos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
