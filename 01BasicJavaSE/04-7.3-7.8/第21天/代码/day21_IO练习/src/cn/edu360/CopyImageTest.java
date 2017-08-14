package cn.edu360;

//复制图片
public class CopyImageTest {

	public static void main(String[] args) {
		String srcPath = "E:/奥黛丽赫本.jpg";
		String destPath = "D:/mm.jpg";
		IOUtils.copyFile2(srcPath, destPath);
	}

}
