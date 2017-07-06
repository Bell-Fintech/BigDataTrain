package cn.edu360;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/*
 * 需求：向D盘的test.txt文件中输出HelloWorld，分析发现使用字符流更合适，但是字符流是由字节流包装得来的，所以需要先学习字节流
 * 我们操作的是一个文件，所以用文件字节输出流
 * FileOutputStream:文件输出流是用于将数据写入 File
 * 
 * public FileOutputStream(File file)创建一个向指定 File 对象表示的文件中写入数据的文件输出流
 * public FileOutputStream(String name)创建一个向具有指定名称的文件中写入数据的输出文件流
 * 
 * 写出数据的常见问题？
 * 	如何追加写出数据？
 * 		在创建字节输出流的时候，将第二个参数传入true即可
 * 	如何将写出的数据换行？
 * 		可以在写出的时候，在想要换行的地方加上\r\n
 * 	创建字节输出流干了哪些事情？
 * 		见图
 * 	字节输出流使用完毕之后需要关闭掉，因为不关闭会导致内存泄漏，如果一个程序中所有流的操作都不关闭，时间久了就会内存溢出，内存溢出整个程序就会crash掉
 */
public class FileOutputStreamDemo {
	public static void main(String[] args) {
		test2();
	}

	private static void test2() {
		/*
		 * JDK1.7的关流新方式：
		 * 	try(创建流的代码){
		 *	...
		 * }catch(...){
		 * 	...
		 * }
		 * 在try里面代码执行完毕之后，创建的流会被自动的关闭
		 */
		try (FileOutputStream fos = new FileOutputStream( "D:/test.txt",true);
				FileOutputStream fos2 = new FileOutputStream( "D:/test.txt",true)){
			// public FileOutputStream(File file)创建一个向指定 File 对象表示的文件中写入数据的文件输出流
			//FileOutputStream fos = new FileOutputStream(new File(destPath));
			// public FileOutputStream(String name)创建一个向具有指定名称的文件中写入数据的输出文件流
			 
			//将"HelloWorld"转换成字节数组
			byte[] bytes = "HelloWorld\r\n".getBytes();
			//public void write(int b)将指定字节写入此文件输出流。实现 OutputStream 的 write 方法。 
			//fos.write(bytes[0]);
			//fos.write(bytes[1]);
			//fos.write(bytes[2]);
			//public void write(byte[] b)将 b.length 个字节从指定 byte 数组写入此文件输出流中
			fos.write(bytes);
			//public void write(byte[] b,int off,int len)将指定 byte 数组中从偏移量 off 开始的 len 个字节写入此文件输出流
			//fos.write(bytes, 5, 5);
			//int i = 1/0;在这里可能发生异常，所以不应该在这里面关闭，应该放在肯定会执行的地方关闭流
			//fos.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private static void test() {
		FileOutputStream fos = null;
		try {
			String destPath = "D:/test.txt";
			// public FileOutputStream(File file)创建一个向指定 File 对象表示的文件中写入数据的文件输出流
			//FileOutputStream fos = new FileOutputStream(new File(destPath));
			// public FileOutputStream(String name)创建一个向具有指定名称的文件中写入数据的输出文件流
			 fos = new FileOutputStream(destPath,true);
			//将"HelloWorld"转换成字节数组
			byte[] bytes = "HelloWorld\r\n".getBytes();
			
			//public void write(int b)将指定字节写入此文件输出流。实现 OutputStream 的 write 方法。 
			//fos.write(bytes[0]);
			//fos.write(bytes[1]);
			//fos.write(bytes[2]);
			
			//public void write(byte[] b)将 b.length 个字节从指定 byte 数组写入此文件输出流中
			fos.write(bytes);
			
			//public void write(byte[] b,int off,int len)将指定 byte 数组中从偏移量 off 开始的 len 个字节写入此文件输出流
			//fos.write(bytes, 5, 5);
			//int i = 1/0;在这里可能发生异常，所以不应该在这里面关闭，应该放在肯定会执行的地方关闭流
			//fos.close();
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			closeOut(fos);
		}
	}

	/**
	 * 关闭所有的字节输出流
	 * @param fos
	 */
	private static void closeOut(OutputStream fos) {
		if(null != fos){
			try {
				fos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}