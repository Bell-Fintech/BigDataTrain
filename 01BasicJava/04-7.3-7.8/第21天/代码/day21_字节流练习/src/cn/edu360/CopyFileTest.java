package cn.edu360;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

//把当前项目目录下的a.txt内容复制到当前项目目录下的b.txt中
public class CopyFileTest {

	public static void main(String[] args) {
		// 原文件路径
		String srcPath = "E:/中北大学Java基础视频/day21/代码/day21_字节流练习/a.txt";
		// 目标文件路径
		String destPath = "E:/中北大学Java基础视频/day21/代码/day21_字节流练习/b.txt";
		// IOUtils.copyFile(srcPath, destPath);

		// 先读：先将原文件读取成字节
		FileInputStream fis = null;
		// 后写：将字节写出到目标文件中
		FileOutputStream fos = null;
		try {
			fis = new FileInputStream(srcPath);
			fos = new FileOutputStream(destPath);
			// 定义一个缓冲区，用于读取数据的容器
			byte[] buf = new byte[1024];
			// 定义一个变量用于记录每次读取的字节个数
			int len = -1;
			// 循环读写
			while ((len = fis.read(buf)) != -1) {// 只要读取的长度不等于-1就表明还有数据可以读取
				// 读多少就写多少
				fos.write(buf, 0, len);
			}
			System.out.println("拷贝成功");
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			// 先创建的后关闭
			if (null != fos) {
				try {
					fos.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			if (null != fis) {
				try {
					fis.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}

	/*
	 * private static void copyFile(String srcPath, String destPath) { //
	 * 先读：先将原文件读取成字节 FileInputStream fis = null; // 后写：将字节写出到目标文件中
	 * FileOutputStream fos = null; try { fis = new FileInputStream(srcPath);
	 * fos = new FileOutputStream(destPath); //定义一个缓冲区，用于读取数据的容器 byte[] buf =
	 * new byte[1024]; //定义一个变量用于记录每次读取的字节个数 int len = -1; //循环读写
	 * while((len=fis.read(buf))!=-1){//只要读取的长度不等于-1就表明还有数据可以读取 //读多少就写多少
	 * fos.write(buf, 0, len); } System.out.println("拷贝成功"); } catch (Exception
	 * e) { e.printStackTrace(); }finally { //先创建的后关闭 IOUtils.closeOut(fos);
	 * IOUtils.closeIn(fis); } }
	 */
}
