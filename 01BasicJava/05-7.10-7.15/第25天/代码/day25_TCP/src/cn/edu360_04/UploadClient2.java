package cn.edu360_04;

import java.io.IOException;

//客户端上传图片，服务端保存起来
public class UploadClient2 {

	public static void main(String[] args) throws Exception, IOException {
		ClientRunnable clientRunnable = new ClientRunnable("127.0.0.1", 8888, "E:/奥黛丽赫本.jpg");
		ThreadPoolUtils.execute(clientRunnable);
	}

}
