package zd.test;
import java.util.Properties;
import java.util.ResourceBundle;
import java.io.IOException;
import java.io.InputStream;
public class ReadProperties {

	public static void main(String[] args) throws IOException {
		//1.获取全路径
		/*
		FileInputStream in = new FileInputStream("src/db.properties");
		Properties p=new Properties();
		p.load(in);
		String url=p.getProperty("url");
		System.out.println(url);
		*/
		//2.获取类加载器 获取文件的输入流
		/*
		InputStream in=ReadProperties.class.getClassLoader().getResourceAsStream("config/db.properties");
		Properties p=new Properties();
		p.load(in);
		String url=p.getProperty("url");
		System.out.println(url);
		*/
		//3.
		ResourceBundle bundle=ResourceBundle.getBundle("config/db");
		String name=bundle.getString("password");
		System.out.println(name);
	}

}
