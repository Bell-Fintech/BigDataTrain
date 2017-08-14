package cn.edu360;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class SplitAndGroupFile {

	public static void main(String[] args) throws Exception {
		// 将一个文件文件分割成最多4部分，最少3部分
		splitFile("E:/奥黛丽赫本.jpg");
		// 将最多4个，最少3个碎片文件组成一个文件
		groupFile("E:/mm.jpg");
	}

	/**
	 * 将几个碎片文件组合成指定的文件
	 * 
	 * @param destPath
	 * @throws Exception
	 */
	private static void groupFile(String destPath) throws Exception {
		// 1.将最多四个文件，最少三个文件读取到同一个字节数组中
		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		BufferedInputStream bis = null;
		for (int i = 0; i < 4; i++) {
			switch (i) {
			case 0:
				// 件文件读取到字节数组中
				bis = new BufferedInputStream(new FileInputStream("D:/temp1.dll"));
				readToByteArray(baos, bis);
				break;
			case 1:
				bis = new BufferedInputStream(new FileInputStream("D:/temp2.dll"));
				readToByteArray(baos, bis);
				break;
			case 2:
				bis = new BufferedInputStream(new FileInputStream("D:/temp3.dll"));
				readToByteArray(baos, bis);
				break;
			case 3:
				File file = new File("D:/temp4.dll");
				if (file.exists()) {// 需要先判断一下第四个文件存不存在
					bis = new BufferedInputStream(new FileInputStream(file));
					readToByteArray(baos, bis);
				}
				break;
			}
			bis.close();
		}

		// 2.将字节数组拿出来，然后进行解密
		byte[] byteArray = lockAndUnLock(baos);

		// 3.将字节数组保存到指定文件中
		BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(destPath));
		ByteArrayInputStream bais = new ByteArrayInputStream(byteArray);
		byte[] buf = new byte[1024];
		int len;
		while ((len = bais.read(buf)) != -1) {
			bos.write(buf, 0, len);
		}
		bos.close();
		System.out.println("文件组合成功");
	}

	private static void readToByteArray(ByteArrayOutputStream baos, BufferedInputStream bis) throws IOException {
		byte[] buf = new byte[1024];
		int len;
		while ((len = bis.read(buf)) != -1) {
			baos.write(buf, 0, len);
		}
	}

	private static void splitFile(String srcPath) throws Exception {
		// 1.将图片转换成字节数组
		BufferedInputStream bis = new BufferedInputStream(new FileInputStream(srcPath));
		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		readToByteArray(baos, bis);
		bis.close();
		// System.out.println(baos.toByteArray().length);

		// 2.将字节数组加密
		byte[] byteArray = lockAndUnLock(baos);

		// 3.将字节数组最多保存到四个文件中
		int size = byteArray.length / 3;
		BufferedOutputStream bos = null;
		for (int i = 0; i < 3; i++) {
			switch (i) {
			case 0:
				// 将第一部分的字节写出去
				bos = new BufferedOutputStream(new FileOutputStream("D:/temp1.dll"));
				bos.write(byteArray, 0, size);
				break;
			case 1:
				// 将第二部分的字节写出去
				bos = new BufferedOutputStream(new FileOutputStream("D:/temp2.dll"));
				bos.write(byteArray, size, size);
				break;
			case 2:
				// 将第三部分的字节写出去
				bos = new BufferedOutputStream(new FileOutputStream("D:/temp3.dll"));
				bos.write(byteArray, size * 2, size);
				break;
			}
			bos.close();
		}
		// 判断还有没有字节没有被写出
		if (size * 3 < byteArray.length) {
			// 将剩余的字节写出去
			bos = new BufferedOutputStream(new FileOutputStream("D:/temp4.dll"));
			bos.write(byteArray, size * 3, byteArray.length - size * 3);
			bos.close();
		}
		System.out.println("文件分割成功");
	}

	/**
	 * 将字节数组从字节数组流中读取出来进行加密或者解密
	 * 
	 * @param baos
	 * @return
	 */
	private static byte[] lockAndUnLock(ByteArrayOutputStream baos) {
		byte[] byteArray = baos.toByteArray();
		for (int i = 0; i < byteArray.length; i++) {
			byteArray[i] = (byte) (byteArray[i] ^ 66);
		}
		return byteArray;
	}

}
