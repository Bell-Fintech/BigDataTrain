package nuc.sw.zd.logreg;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

import server_slient_socket.ClientInputThread;
import server_slient_socket.ClientOutputThread;
/**
 * 服务端线程类
 * @author Administrator
 *
 */
//服务端先读后写
public class ServerThread implements Runnable{
	private Socket socket = null;
	private BufferedReader br = null;
	private PrintWriter pw = null;
	//通过构造方法将客户端与服务端连接的scoket注入进来
	public ServerThread(Socket socket) {
		this.socket=socket;
	}
	@Override
	public void run() {
		try {
			
			//缓冲字符流操作起来更为简单，把socket的字节流转换为缓冲字符流
			br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			//网络编程时用PrintWriter比BufferedWriter方便
			pw = new PrintWriter(socket.getOutputStream());
			
		    //读取客户端发送的请求
			String info = br.readLine();
			System.out.println(info);
			if(info != null){
				String result = operate(info);//根据不同内容执行不同的操作
				pw.println(result);
				pw.flush();
			}
			
		 
		}catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	public  String operate(String info) {
		String result = null;
		if(info.indexOf("login")!=-1){
			//执行登录  读取文件并比对登录信息是否正确
		      result = login(info);
		}else if (info.indexOf("regist")!=-1){
			//执行注册 写入文件
			 result = regist(info);
		}
		return result;
	}
	public  String login(String info) {
		//执行登录
		String[] strings = info.split("#");    //把客户端发送过来的字符串按#进行拆分，下标1和2分别代表用户名和密码
        try {
			FileReader reader = new FileReader("user.txt");
			BufferedReader bufferedReader = new BufferedReader(reader);
			String string = bufferedReader.readLine();
			while(string != null){
				String[] strings2 = string.split(" ");
				if(strings2[0].equals(strings[1]) && strings2[1].equals(strings[2])){
					    
				        return "恭喜您，登陆成功！";
				}
				string = bufferedReader.readLine();
			}
			bufferedReader.close();
			////reader.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
        
        return "对不起，您输入的用户名和密码有误！";
	}
	public  String regist(String info) {
		//执行注册
		String[] strings = info.split("#");    //把客户端发送过来的字符串按#进行拆分，下标1和2分别代表用户名和密码
		System.out.println(1);
		System.out.println(strings[1]+" "+strings[2]);
		try {
			FileWriter writer = new FileWriter("user.txt",true);
			BufferedWriter bufferedWriter = new BufferedWriter(writer);
			System.out.println(strings[1]+" "+strings[2]);
			bufferedWriter.write(strings[1]+" "+strings[2]);
			bufferedWriter.newLine();
			bufferedWriter.close();
			//writer.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return "恭喜您，注册成功";
	}
}