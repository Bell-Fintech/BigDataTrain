package cn.edu360;

import java.io.FileOutputStream;
import java.io.OutputStreamWriter;

/*
 * 字符流：因为字节流对字符操作很不方便，所以就出现了字符流
 * 字符流：字节流+编码表组成
 * 编码表：就是字符对应数值的一张表
 * 	gbk:只有中文
 * 	IOS8859-1：java默认的码表
 * 	UTF-8：开发中用的码表，里面集成很多国家的语言
 * 
 * OutputStreamWriter 是字符流通向字节流的桥梁
 * public OutputStreamWriter(OutputStream out)创建使用默认字符编码的 OutputStreamWriter
 * public OutputStreamWriter(OutputStream out,String charsetName)创建使用指定字符集的 OutputStreamWriter
 */
public class OutputStreamWriterDemo {

	public static void main(String[] args) throws Exception {
		// String name = Charset.defaultCharset().displayName();
		// System.out.println(name);
		//public OutputStreamWriter(OutputStream out)创建使用默认字符编码的 OutputStreamWriter
		//OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("D:/tt.txt"));
		
		//public OutputStreamWriter(OutputStream out,String charsetName)创建使用指定字符集的 OutputStreamWriter
		OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("D:/tt.txt"), "gbk");
		
		//public String getEncoding()返回此流使用的字符编码的名称
		System.out.println(osw.getEncoding());
		
		//public void write(String str)写入字符串
		osw.write("中国你好");
		
		osw.close();
	}

}
