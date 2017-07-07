package cn.edu360;

//复制文本文件
public class CopyTextTest {
	public static void main(String[] args) {
		String srcPath = "E:/修仙.txt";
		String destPath = "D:/copy.txt";
		IOUtils.copyFile(srcPath, destPath);
	}
}
