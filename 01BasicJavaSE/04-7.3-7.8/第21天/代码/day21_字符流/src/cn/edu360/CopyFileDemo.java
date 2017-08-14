package cn.edu360;

import java.io.FileReader;
import java.io.FileWriter;

/*
 * FileWriter和FileReader是对转换流的简化写法，里面的方法使用是一模一样的
 * FileWrter和FileReader只能使用平台默认的编码写和读
 */
public class CopyFileDemo {
	public static void main(String[] args) throws Exception {
		// 先读
		FileReader fr = new FileReader("D:/student.txt");
		// 后写
		FileWriter fw = new FileWriter("E:/haha.txt");
		
		//自定义字符数组容器
		char[] buf = new char[1024];
		//定义一个变量记录每次读取字符的个数
		int len;
		//循环读写
		while((len=fr.read(buf))!=-1){
			//读多少就写多少
			fw.write(buf, 0, len);
		}
		//创建的后关闭
		fw.close();
		fr.close();
		System.out.println("拷贝成功");
	}
}
