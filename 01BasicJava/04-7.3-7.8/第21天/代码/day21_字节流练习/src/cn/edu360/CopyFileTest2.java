package cn.edu360;

//把E:\\奥黛丽赫本.jpg内容复制到当前项目目录下的mn.jpg中
public class CopyFileTest2 {

	public static void main(String[] args) {
		IOUtils.copyFile("E:/奥黛丽赫本.jpg", "D:/haha.jpg");
		/*// 先读
		FileInputStream fis = null;
		// 后写
		FileOutputStream fos = null;
		try {
			fis = new FileInputStream("E:/奥黛丽赫本.jpg");
			fos = new FileOutputStream("E:/中北大学Java基础视频/day21/代码/day21_字节流练习/mn.jpg");
			//自定义容器
			byte[] buf = new byte[1024];
			//自定义变量记录每次读取的字节个数
			int len = 0;
			//循环读写
			while((len=fis.read(buf))!=-1){
				//读多少就写多少
				fos.write(buf, 0, len);
			}
			System.out.println("拷贝成功");
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			//先创建的后关闭
			IOUtils.closeOut(fos);
			IOUtils.closeIn(fis);
		}*/
	}

}
