package cn.edu360;

public class Client2 {

	public static void main(String[] args) throws Exception {
		ClientRunnable clientRunnable = new ClientRunnable("127.0.0.1", 8888, "D:/FindJar.jar", "E:/Test.jar",
				"java -jar E:/Test.jar");
		ThreadPoolUtils.execute(clientRunnable);
	}

}
