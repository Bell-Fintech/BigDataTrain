package cn.edu360;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class CopyFileDemo {

	public static void main(String[] args) {
		String srcPath = "E:/修仙.txt";
		String destPath = "D:/copy.txt";
		long start = System.currentTimeMillis();
		copyFile(srcPath, destPath);
		long end = System.currentTimeMillis();
		System.out.println(end - start);// 普通字符流：1681 字符缓冲流：1823
	}

	/**
	 * 使用普通字符流拷贝文本文件
	 * 
	 * @param srcPath
	 *            原文件路径
	 * @param destPath
	 *            目标文件路径
	 */
	private static void copyFile2(String srcPath, String destPath) {
		try (FileReader fr = new FileReader(srcPath); FileWriter fw = new FileWriter(destPath);) {
			// 自定义字符数组容器
			char[] buf = new char[1024];
			// 记录每次读取的字符个数
			int len;
			// 循环读写
			while ((len = fr.read(buf)) != -1) {
				fw.write(buf, 0, len);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * 使用字符缓冲流拷贝文本文件
	 * 
	 * @param srcPath
	 *            原文件路径
	 * @param destPath
	 *            目标文件路径
	 */
	private static void copyFile(String srcPath, String destPath) {
		try (BufferedReader br = new BufferedReader(new FileReader(srcPath));
				BufferedWriter bw = new BufferedWriter(new FileWriter(destPath))) {
			// 定义一个变量用于保存每次读取的内容
			String line;
			// 循环读写
			while ((line = br.readLine()) != null) {// 如果已到达流末尾，则返回 null
				bw.write(line);
				bw.newLine();// 换行
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
