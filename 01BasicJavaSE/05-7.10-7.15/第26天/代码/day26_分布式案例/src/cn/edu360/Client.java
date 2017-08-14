package cn.edu360;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.net.Socket;

public class Client {
	private static final String HEAD = "!@#$890JLJL880809&&";

	public static void main(String[] args) throws Exception {
		// 1.创建客户端的socket对象并指定ip地址和端口号
		Socket s = new Socket("127.0.0.1", 8888);
		// 2.写出的数据多少字节形式，读取的数据都是字符串形式的
		BufferedOutputStream bos = new BufferedOutputStream(s.getOutputStream());
		BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));

		// 写请求头
		writeHead(bos);
		// 接收服务端的返回结果，看身份是否验证通过
		String result = br.readLine();
		if (result.equals("1")) {
			System.out.println("身份验证通过");

			//写出保存jar包的路径
			writePath(bos);

			//上传jar包
			writeJar(bos);
			//接收服务端的返回结果，看服务端是否保存jar包成功
			result = br.readLine();
			if(result.equals("1")){
				System.out.println("上传jar包成功");
				
				//上传执行jar包的命令
				writeCommand(bos);
				
				//读取服务端返回的结果
				System.out.println(br.readLine());
				
			}else{
				System.out.println("上传jar包失败");
			}
		} else {
			System.out.println("身份验证失败，非法请求");
		}
		s.close();
	}

	private static void writeCommand(BufferedOutputStream bos) throws Exception {
		String command = "java -jar E:/FindJarCount.jar";
		//将执行jar包的命令字符串转换成字节数组
		byte[] bs = command.getBytes();
		//将执行jar包命令的字符串所在的字节大小转换字节数组
		byte[] bs2 = DataUtils.intTOByte(bs.length);
		//将执行jar包所占的字节大小写出去
		bos.write(bs2);
		//将执行jar包命令的字节数据写出去
		bos.write(bs);
		bos.flush();
	}

	private static void writeJar(BufferedOutputStream bos) throws Exception {
		String path = "D:/FindJar.jar";
		File file = new File(path);
		BufferedInputStream bis = new BufferedInputStream(new FileInputStream(file));
		//将jar包文件所占的字节大小转换成字节数组
		byte[] bs = DataUtils.longTOByte(file.length());
		//将jar包文件所占的字节大小写出去
		bos.write(bs);
		
		//分段将jar包发送到服务端
		byte[] buf = new byte[1024];
		int len;
		//循环读写
		while((len=bis.read(buf))!=-1){
			bos.write(buf, 0, len);
		}
		bos.flush();
		bis.close();
	}

	private static void writePath(BufferedOutputStream bos) throws Exception {
		String path = "E:/FindJarCount.jar";
		// 将保存的路径转换成字节数组
		byte[] bs = path.getBytes();
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
