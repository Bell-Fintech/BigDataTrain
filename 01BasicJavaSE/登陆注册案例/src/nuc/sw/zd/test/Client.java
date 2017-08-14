package nuc.sw.zd.test;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;
/**
 * 客户端
 * @author Administrator
 *
 */
//客户端先写后读
public class Client {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String username=null;
		String password=null;
		try {
			//与服务端进行连接 ，localhost(本机作为服务器，本机的ip地址)
			Socket socket=new Socket("localhost",8899);
			//得到Socket的读写流
			//输出流
			OutputStream os=socket.getOutputStream();
			PrintWriter pw=new PrintWriter(os);
			//输入流
			InputStream is=socket.getInputStream();
			BufferedReader br=new BufferedReader(new InputStreamReader(is));
			
			System.out.println("请输入数字选择登录或者是注册：(1.登陆  2.注册)");
			Scanner scanner = new Scanner(System.in);
			String string = scanner.next();
			if("1".equals(string)){
				//登陆
				System.out.print("请输入用户名：");
				username = scanner.next();
				System.out.print("请输入密码：");
				password = scanner.next();
				//向服务端发送消息(服务端通过解析字符串，得到第一个子字符串为login，就进行登陆的操作)
				String info = "login#"+username+"#"+password+"";
				pw.write(info);
				pw.flush();
				socket.shutdownOutput();
				//读取服务端返回的消息
				String reply = br.readLine();
				if(reply != null){
					System.out.println("服务端向客户端发送消息说："+reply);
				}
			}else{
				//注册
				System.out.print("请输入用户名：");
				username = scanner.next();
				System.out.print("请输入密码：");
				password = scanner.next();
				//向服务端发送消息(服务端通过解析字符串，得到第一个子字符串为register，就进行注册的操作)
				String info = "register#"+username+"#"+password+"";
				pw.write(info);
				pw.flush();
				socket.shutdownOutput();
				//读取服务端返回的消息
				String reply = br.readLine();
				if(reply != null){
					System.out.println("服务端向客户端发送消息说："+reply);
				}
			}
			//关闭资源
			br.close();
			is.close();
			pw.close();
			os.close();
			socket.close();
		} catch (Exception e) {
			e.printStackTrace();
		} 
	}

}