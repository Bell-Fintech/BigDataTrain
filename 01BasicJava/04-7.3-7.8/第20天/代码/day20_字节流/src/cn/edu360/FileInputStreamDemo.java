package cn.edu360;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

/*
 * FileInputStream 从文件系统中的某个文件中获得输入字节
 * 
 */
public class FileInputStreamDemo {

	public static void main(String[] args) {
		FileInputStream fis = null;
		try {
			String destPath = "D:/test.txt";
			//public FileInputStream(File file)通过打开一个到实际文件的连接来创建一个 FileInputStream，该文件通过文件系统中的 File 对象 file 指定
			//FileInputStream fis = new FileInputStream(new File(destPath));
			
			//public FileInputStream(String name)通过打开一个到实际文件的连接来创建一个 FileInputStream，该文件通过文件系统中的路径名 name 指定
			 fis = new FileInputStream(destPath);
			
			//读取字节数据
			//public int read()从此输入流中读取一个数据字节
			//System.out.println((char)fis.read());
			
			//public int read(byte[] b)从此输入流中将最多 b.length 个字节的数据读入一个 byte 数组中
			byte[] buf = new byte[100];
			//len就是实际读取的字节长度
			int len = fis.read(buf);//将最多10个字节读取到buf数组中
			
			//public int read(byte[] b,int off,int len)从此输入流中将最多 len 个字节的数据读入一个 byte 数组中
			//public long skip(long n)从输入流中跳过并丢弃 n 个字节的数据
			//fis.skip(5);
			//int len = fis.read(buf, 5, 5);
			System.out.println(new String(buf,0,len));//将字节数组转换成字符串
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			closeIn(fis);
		}
	}

	/**
	 * 关闭所有的字节读取流
	 * @param fis
	 */
	private static void closeIn(InputStream fis) {
		if(null!=fis){
			try {
				fis.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}
