package cn.edu360;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;

public class DataUtils {
	// 基本数据类和字节数组进行相互的转换

	// 基本数据转换成字节数组
	public static byte[] intTOByte(int i) throws Exception {
		// public DataOutputStream(OutputStream out)创建一个新的数据输出流，将数据写入指定基础输出流
		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		DataOutputStream dos = new DataOutputStream(baos);
		dos.writeInt(i);
		dos.close();
		return baos.toByteArray();
	}

	// 字节数组转换成基本数据类型
	public static int byteToInt(byte[] buf) throws Exception {
		// public DataInputStream(InputStream in)使用指定的底层 InputStream 创建一个
		// DataInputStream
		ByteArrayInputStream bais = new ByteArrayInputStream(buf);
		DataInputStream dis = new DataInputStream(bais);
		return dis.readInt();
	}
	// 基本数据转换成字节数组
	public static byte[] longTOByte(long i) throws Exception {
		// public DataOutputStream(OutputStream out)创建一个新的数据输出流，将数据写入指定基础输出流
		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		DataOutputStream dos = new DataOutputStream(baos);
		dos.writeLong(i);
		dos.close();
		return baos.toByteArray();
	}
	
	// 字节数组转换成基本数据类型
	public static long byteToLong(byte[] buf) throws Exception {
		// public DataInputStream(InputStream in)使用指定的底层 InputStream 创建一个
		// DataInputStream
		ByteArrayInputStream bais = new ByteArrayInputStream(buf);
		DataInputStream dis = new DataInputStream(bais);
		return dis.readLong();
	}
}
