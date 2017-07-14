package cn.edu360;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

public class ClientRunnable implements Runnable {
	private static final String HEAD = "!@#$890JLJL880809&&";
	private String ip;
	private int port;
	private String srcJarPath;
	private String destJarPath;
	private String command;

	/**
	 * 创建客户端的socket对象
	 * 
	 * @param ip
	 *            要访问服务端ip地址
	 * @param port
	 *            要访问服务端的端口
	 * @param srcJarPath
	 *            要发送jar包的原路径
	 * @param destJarPath
	 *            指定服务端保存jar包的路径
	 * @param command
	 *            执行jar包名的命令
	 */
	public ClientRunnable(String ip, int port, String srcJarPath, String destJarPath, String command) {
		this.ip = ip;
		this.port = port;
		this.srcJarPath = srcJarPath;
		this.destJarPath = destJarPath;
		this.command = command;
	}

	@Override
	public void run() {
		Socket s = null;
		try {
			// 1.创建客户端的socket对象并指定ip地址和端口号
			s = new Socket(ip, port);
			// 2.写出的数据多少字节形式，读取的数据都是字符串形式的
			BufferedOutputStream bos = new BufferedOutputStream(s.getOutputStream());
			BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));

			// 写请求头
			writeHead(bos);
			// 接收服务端的返回结果，看身份是否验证通过
			String result = br.readLine();
			if (result.equals("1")) {
				System.out.println("身份验证通过");

				// 写出保存jar包的路径
				writePath(bos);

				// 上传jar包
				writeJar(bos);
				// 接收服务端的返回结果，看服务端是否保存jar包成功
				result = br.readLine();
				if (result.equals("1")) {
					System.out.println("上传jar包成功");

					// 上传执行jar包的命令
					writeCommand(bos);

					// 读取服务端返回的结果
					System.out.println(br.readLine());

				} else {
					System.out.println("上传jar包失败");
				}
			} else {
				System.out.println("身份验证失败，非法请求");
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (null != s) {
				try {
					s.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}

	private void writeCommand(BufferedOutputStream bos) throws Exception {
		// 将执行jar包的命令字符串转换成字节数组
		byte[] bs = command.getBytes();
		// 将执行jar包命令的字符串所在的字节大小转换字节数组
		byte[] bs2 = DataUtils.intTOByte(bs.length);
		// 将执行jar包所占的字节大小写出去
		bos.write(bs2);
		// 将执行jar包命令的字节数据写出去
		bos.write(bs);
		bos.flush();
	}

	private void writeJar(BufferedOutputStream bos) throws Exception {
		File file = new File(srcJarPath);
		BufferedInputStream bis = new BufferedInputStream(new FileInputStream(file));
		// 将jar包文件所占的字节大小转换成字节数组
		byte[] bs = DataUtils.longTOByte(file.length());
		// 将jar包文件所占的字节大小写出去
		bos.write(bs);

		// 分段将jar包发送到服务端
		byte[] buf = new byte[1024];
		int len;
		// 循环读写
		while ((len = bis.read(buf)) != -1) {
			bos.write(buf, 0, len);
		}
		bos.flush();
		bis.close();
	}

	private void writePath(BufferedOutputStream bos) throws Exception {
		// 将保存的路径转换成字节数组
		byte[] bs = destJarPath.getBytes();
		// 将所占的字节大小转换字节数组
		byte[] bs2 = DataUtils.intTOByte(bs.length);
		// 将路径所占的字节大小写出去
		bos.write(bs2);
		bos.write(bs);
		bos.flush();

	}

	private static void writeHead(BufferedOutputStream bos) throws Exception {
		// 把请求头转换成字节数组
		byte[] bs = HEAD.getBytes();
		// 请求头所占的字节大小
		int len = bs.length;
		// 把len转换成字节数组
		byte[] bs2 = DataUtils.intTOByte(len);
		// 把请求头所占的字节大小写出去
		bos.write(bs2);
		// 把请求头的字节数据写出去
		bos.write(bs);
		bos.flush();
	}
}
