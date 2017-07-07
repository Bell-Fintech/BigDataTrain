package cn.edu360;

import java.io.FileInputStream;
import java.io.InputStreamReader;

/*
 * InputStreamReader 是字节流通向字符流的桥梁
 *
 *是以什么编码方式写的，就以什么编码方式读取
 */
public class InputStreamReaderDemo {

	public static void main(String[] args) throws Exception {
		// public InputStreamReader(InputStream in)创建一个使用默认字符集的
		// InputStreamReader
		InputStreamReader isr = new InputStreamReader(new FileInputStream("D:/tt.txt"));
		
		// public InputStreamReader(InputStream in,String charsetName)创建使用指定字符集的
		isr = new InputStreamReader(new FileInputStream("D:/tt.txt"), "gbk");
		// InputStreamReader
		//自定义一个字符数组容器
		char[] cbuf = new char[1024];
		//public int read(char[] cbuf)将字符读入数组。在某个输入可用、发生 I/O 错误或者已到达流的末尾前，此方法一直阻塞
		int len = isr.read(cbuf);
		System.out.println(new String(cbuf,0,len));
		
		
	}

}
