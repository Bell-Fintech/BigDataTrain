package zd.utils;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;


public class MyDbUtils {
	
	//读取配置文件  注册驱动
	static String driverClass = null;
	static String url = null;
	static String username = null;
	static String password = null;
	static {
		// 读取配置文件
		InputStream in = MyDbUtils.class.getClassLoader().getResourceAsStream("db.properties");
		// 创建Properties工具类
		Properties p = new Properties();
		try {
			p.load(in);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driverClass = p.getProperty("driverClass");
		url = p.getProperty("url");
		username = p.getProperty("username");
		password = p.getProperty("password");
		try {
			Class.forName(driverClass);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * 获取连接
	 * @throws SQLException 
	 */
	public static  Connection getConnection() throws SQLException{
		return DriverManager.getConnection(url, username, password);
	}
	
	
	/**
	 * 关闭资源
	 */
	public static void release(Connection conn,Statement st,ResultSet set){
		
		try {
			if (null != set) {
				set.close();
				set = null;// 经验
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			if (null != st) {
				st.close();
				st = null;// 经验
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		try {
			if (null != conn) {
				conn.close();
				conn = null;// 经验
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	

}
