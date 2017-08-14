package nuc.sw.zd.logreg;

import java.net.ServerSocket;
import java.net.Socket;

public class UploadServer2{
	@SuppressWarnings("resource")
	public static void main(String[] args) throws Exception {
		 ServerMain server = new ServerMain();
		  ThreadPoolUtils.exxcute(server);		 
//	 ServerSocket s = new ServerSocket(8888);
//		 while(true){
//			   //获取客户端信息
//			  Socket accept = s.accept();
//			   ServerMain server = new ServerMain();
//			   ThreadPoolUtils.exxcute(server);		 
//		 }
	}

}
