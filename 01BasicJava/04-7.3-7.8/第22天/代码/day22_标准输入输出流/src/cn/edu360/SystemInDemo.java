package cn.edu360;

public class SystemInDemo {

	public static void main(String[] args) throws Exception {
		//public static final InputStream in“标准”输入流。此流已打开并准备提供输入数据。通常，此流对应于键盘输入或者由主机环境或用户指定的另一个输入源
		//InputStream in = System.in;
		//把in转换成字符流
		//InputStreamReader isr = new InputStreamReader(in);
		//把字符流包装成字符缓冲流
		//BufferedReader br = new BufferedReader(isr);
		//BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		//当我调用如下代码的时候，程序会阻塞，向键盘索取数据
		//String content = br.readLine();
		//String content2 = br.readLine();
		//System.out.println(content);
		//System.out.println(content2);
		//System.out.println("over");
		
		MyScanner sc = new MyScanner(System.in);
		System.out.println(sc.nextInt());
		System.out.println(sc.nextLine());
		sc.close();
	}
}
