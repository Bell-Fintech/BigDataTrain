package cn.edu360;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Socket;

public class ServerRunnable implements Runnable {
	private static final String HEAD = "!@#$890JLJL880809&&";
	private Socket s;

	public ServerRunnable(Socket s) {
		this.s = s;
	}

	@Override
	public void run() {
		try {
			// 3.获取的数据都是字节类型，写出的数据都是字符类型
			BufferedInputStream bis = new BufferedInputStream(s.getInputStream());
			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(s.getOutputStream()));

			// 读取请求头
			String head = readFourString(bis);

			if (head.equals(HEAD)) {
				System.out.println("身法验证通过");
				bw.write("1");
				bw.newLine();
				bw.flush();

				// 获取保存jar包的路径
				String savePath = readFourString(bis);

				// 将jar包保存到指定的路径中
				saveJar(bis, bw, savePath);

				// 接收客户端发送过来的命令
				String command = readFourString(bis);
				// 获取当前的运行环境实例对象
				Runtime runtime = Runtime.getRuntime();
				// 在子进程中运行命令
				Process process = runtime.exec(command);
				// 从子进程中获取数据
				BufferedReader br = new BufferedReader(new InputStreamReader(process.getInputStream(), "gbk"));
				String result = br.readLine();
				System.out.println(result);
				bw.write(result);
				bw.newLine();
				bw.flush();
			} else {
				System.out.println("身法验证失败");
				bw.write("2");
				bw.newLine();
				bw.flush();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			if(null!=s){
				try {
					s.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}

	private void saveJar(BufferedInputStream bis, BufferedWriter bw, String savePath) {
		// 获取八个字节，转换成long值，然后就知道jar所占的字节大小了
		byte[] buf = new byte[8];
		BufferedOutputStream bos = null;
		try {
			bos = new BufferedOutputStream(new FileOutputStream(savePath));
			bis.read(buf);
			long len = DataUtils.byteToLong(buf);

			// 如果文件不是很大是不需要分段存储，如果文件大于了1024个字节就进行分段的存储
			if (len > 1024) {
				System.out.println("需要进行分段存储");
				long count = len / 1024;
				buf = new byte[1024];
				// 循环读写指定的次数
				for (long i = 0; i < count; i++) {
					bis.read(buf);
					bos.write(buf);
				}

				// 看有没有还剩余的字节没有读写
				if (count * 1024 < len) {
					buf = new byte[(int) (len - count * 1024)];
					bis.read(buf);
					bos.write(buf);
				}
			} else {
				System.out.println("不需要进行分段存储");
				buf = new byte[(int) len];
				bis.read(buf);
				bos.write(buf);
			}

			System.out.println("保存jar包成功");
			bw.write("1");
			bw.newLine();
			bw.flush();

		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("保存jar包失败");
			try {
				bw.write("2");
				bw.newLine();
				bw.flush();
			} catch (IOException e1) {
				e1.printStackTrace();
			}
		} finally {
			if (null != bos) {
				try {
					bos.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}

	}

	/**
	 * 读取四个字节所表示字符串
	 * 
	 * @param bis
	 * @return
	 * @throws IOException
	 * @throws Exception
	 */
	private String readFourString(BufferedInputStream bis) throws IOException, Exception {
		// 首先读取四个字节表示请求头所占的字节大小
		byte[] buf = new byte[4];
		bis.read(buf);
		int len = DataUtils.byteToInt(buf);
		// 读取请求头的字节数据
		buf = new byte[len];
		bis.read(buf);
		String head = new String(buf);
		return head;
	}

}
