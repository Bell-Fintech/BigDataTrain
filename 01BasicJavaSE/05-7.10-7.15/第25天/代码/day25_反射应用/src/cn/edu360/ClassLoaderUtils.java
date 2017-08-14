package cn.edu360;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class ClassLoaderUtils {
	
	public static void replace(String classPath) throws Exception{
		byte[] byteArray = XORClass(classPath);
		//将加密过后的类字节数组替换之前的类文件
		ByteArrayInputStream bais = new ByteArrayInputStream(byteArray);
		BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(classPath));
		byte[] buf = new byte[1024];
		int len;
		while((len = bais.read(buf))!=-1){
			bos.write(buf, 0, len);
		}
		System.out.println("替换类文件成功");
		bos.close();
	}
	
	/**
	 * 将指定的类文件进行加密或者解密
	 * @param classPath
	 * @return
	 * @throws Exception
	 */
	public static byte[] XORClass(String classPath) throws Exception {
		// 将指定的类读取到内存中，然后进行加密
		BufferedInputStream bis = new BufferedInputStream(new FileInputStream(classPath));
		ByteArrayOutputStream bos = new ByteArrayOutputStream();
		byte[] buf = new byte[1024];
		int len;
		// 循环读写
		while ((len = bis.read(buf)) != -1) {
			bos.write(buf, 0, len);
		}
		bis.close();
		// 加密或者是解密
		byte[] byteArray = bos.toByteArray();
		for (int i = 0; i < byteArray.length; i++) {
			byteArray[i] = (byte) (byteArray[i] ^ 66);
		}
		return byteArray;
	}
}
