package cn.edu360;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

//将一张图片转换成字节数组
public class ImageToByteArray {

	public static void main(String[] args) {
		// 将图片转换成字节数组
		byte[] byteArray = fileToByteArray("E:/奥黛丽赫本.jpg");
		// 再将字节数组转换成图片
		byteArrayToFile(byteArray, "E:/group.jpg");
	}

	/**
	 * 将指定的字节转换保存到指定的文件路径中
	 * 
	 * @param byteArray
	 *            字节数组
	 * @param string
	 *            文件的路径名
	 */
	private static void byteArrayToFile(byte[] byteArray, String destPath) {
		// ByteArrayInputStream 包含一个内部缓冲区，该缓冲区包含从流中读取的字节
		// public ByteArrayInputStream(byte[] buf)创建一个 ByteArrayInputStream，使用
		// buf 作为其缓冲区数组
		// 将字节序列写到指定文件中
		try (ByteArrayInputStream bais = new ByteArrayInputStream(byteArray);
				BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(destPath))) {
			//自定义缓冲区
			byte[] buf = new byte[1024];
			//记录每次读取的字节个数
			int len;
			//循环读写
			while((len=bais.read(buf))!=-1){
				bos.write(buf, 0, len);
			}
			System.out.println("文件组合成功");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * 将指定文件转换成字节数组
	 * 
	 * @param filePath
	 *            文件的路径
	 * @return 如果返回的是null说明转换失败
	 */
	private static byte[] fileToByteArray(String filePath) {
		// 此类实现了一个输出流，其中的数据被写入一个 byte 数组。缓冲区会随着数据的不断写入而自动增长。可使用 toByteArray() 和
		// toString() 获取数据
		// public ByteArrayOutputStream()创建一个新的 byte 数组输出流。缓冲区的容量最初是 32
		// 字节，如有必要可增加其大小
		// 先读
		try (BufferedInputStream bis = new BufferedInputStream(new FileInputStream(filePath));
				ByteArrayOutputStream baos = new ByteArrayOutputStream();) {
			// 自定义缓冲区
			byte[] buf = new byte[1024];
			// 记录每次读取的字节个数
			int len;
			// 循环读写
			while ((len = bis.read(buf)) != -1) {
				// 写到字节数组中
				baos.write(buf, 0, len);
			}

			// System.out.println(baos.toByteArray().length);
			show(baos.toByteArray().length);
			return baos.toByteArray();
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

	private static boolean falg = true;

	public static void show(Object msg) {
		if (falg) {
			System.out.println(msg);
		}
	}
}
