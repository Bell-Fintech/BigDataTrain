package cn.edu360;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.FilenameFilter;
import java.util.ArrayList;
import java.util.Scanner;

public class IOUtils {
	/**
	 * 拷贝多级文件夹
	 * 
	 * @param srcFolder
	 *            原文件夹路径
	 * @param destFolder
	 *            目标文件夹的路径
	 */
	public static void copyMultiFolder(File srcFolder, File destFolder) {
		// 4.判断当前原文件是不是一个文件夹
		if (srcFolder.isDirectory()) {
			// 4.1在目标文件夹中创建一个和原文件夹一模一样名字的文件夹
			destFolder = new File(destFolder, srcFolder.getName());
			destFolder.mkdir();
			// 4.2获取原文件夹底下所有的子文件对象，然后再遍历将所有的子文件拷贝到目标文件夹中
			File[] files = srcFolder.listFiles();
			for (File srcFile : files) {
				copyMultiFolder(srcFile, destFolder);
			}
		} else {
			// 5.如果是标准文件就直接拷贝
			// 在目标文件夹中创建一个名字一样的文件
			File destFile = new File(destFolder, srcFolder.getName());
			// 6.调用拷贝文件的方法
			IOUtils.copyFile2(srcFolder.getAbsolutePath(), destFile.getAbsolutePath());
		}
	}

	/**
	 * 拷贝单级文件夹中的指定文件并以当前时间重名名
	 * 
	 * @param srcFolder
	 *            原目录路径
	 * @param destFolder
	 *            目标目录路径
	 */
	public static void copySingleFolder(File srcFolder, File destFolder) {
		// 3.在目标盘符创建一个名字一样的文件夹
		destFolder = new File(destFolder, srcFolder.getName());
		destFolder.mkdir();

		// 4.过滤指定的文件
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入要拷贝的文件的后缀名：");
		String suffix = sc.nextLine();
		sc.close();

		File[] files = srcFolder.listFiles(new FilenameFilter() {
			@Override
			public boolean accept(File dir, String name) {
				return name.endsWith(suffix);
			}
		});

		// 5.循环拷贝
		for (File srcFile : files) {
			File destFile = new File(destFolder, System.currentTimeMillis() + suffix);
			IOUtils.copyFile2(srcFile.getAbsolutePath(), destFile.getAbsolutePath());
		}
	}

	/**
	 * 将指定文件中的内容填充到集合中，并将集合返回
	 * 
	 * @param srcPath
	 *            原文件路径
	 * @return 返回的集合
	 */
	public static ArrayList<String> FileToArrayList(String srcPath) {
		// 新建一个集合
		ArrayList<String> list = new ArrayList<String>();
		// 先读
		try (BufferedReader br = new BufferedReader(new FileReader(srcPath));) {
			// 记录每次读取的内容
			String line;
			while ((line = br.readLine()) != null) {
				list.add(line);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}

	/**
	 * 将指定集合中的内容输出到指定文件中
	 * 
	 * @param list
	 *            集合
	 * @param destPath
	 *            目标文件路径
	 */
	public static void ArrayListToFile(ArrayList<String> list, String destPath) {
		try (BufferedWriter bw = new BufferedWriter(new FileWriter(destPath))) {
			// 遍历集合，将集合中的字符串写出去
			for (String value : list) {
				bw.write(value);
				bw.newLine();
			}
			System.out.println("写出成功");
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
	public static void copyFile(String srcPath, String destPath) {
		try (BufferedReader br = new BufferedReader(new FileReader(srcPath));
				BufferedWriter bw = new BufferedWriter(new FileWriter(destPath));) {
			// 定义一个记录每次读取的内容
			String line;
			// 循环读写
			while ((line = br.readLine()) != null) {
				bw.write(line);
				bw.newLine();
			}
			System.out.println("拷贝成功");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * 使用字节缓冲流拷贝文件
	 * 
	 * @param srcPath
	 *            原文件路径
	 * @param destPath
	 *            目标文件路径
	 */
	public static void copyFile2(String srcPath, String destPath) {
		try (BufferedInputStream bis = new BufferedInputStream(new FileInputStream(srcPath));
				BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(destPath))) {
			// 自定义容器
			byte[] buf = new byte[1024];
			// 记录每次读取的字节个数
			int len;
			// 循环读写
			while ((len = bis.read(buf)) != -1) {
				bos.write(buf, 0, len);
			}
			System.out.println("拷贝成功");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
