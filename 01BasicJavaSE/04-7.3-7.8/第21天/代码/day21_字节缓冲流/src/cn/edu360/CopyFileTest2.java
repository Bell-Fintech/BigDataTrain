package cn.edu360;

//把e:\\老鼠爱大米.mp3复制到当前项目目录下的copy.mp3中
//如果你在流关闭之前就有一些数据需要刷新出去，就直接调用flush方法强制刷新;如果数据在流关闭的时候刷新出去也可以，那么就无序调用flush方法，
//因为字节缓冲输出流在关闭流的时候，会调用flush方法，将缓冲区中的数据刷新到硬盘的文件里面 去
public class CopyFileTest2 {

	public static void main(String[] args) throws Exception {
		/*String srcPath = "E:/修仙.txt";
		String destPath = "D:/test.txt";
		//开始时间
		long start = System.currentTimeMillis();
		IOUtils.copyFile(srcPath, destPath);//缓冲字节流：2071	普通字节流：2591
		//结束时间
		long end = System.currentTimeMillis();
		//所用时间
		System.out.println(end-start);*/
	}

}
