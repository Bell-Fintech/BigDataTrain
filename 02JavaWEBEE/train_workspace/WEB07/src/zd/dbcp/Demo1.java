package zd.dbcp;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import org.apache.commons.dbcp.BasicDataSource;



public class Demo1 {

	public static void main(String[] args) throws Exception {
		//创建数据库连接池
		BasicDataSource dataSource=new BasicDataSource();
		//设置四大参数
		dataSource.setDriverClassName("com.mysql.jdbc.Driver");
		dataSource.setUrl("jdbc:mysql:///train_mysql?characterEncoding=UTF-8");
		dataSource.setUsername("root");
		dataSource.setPassword("");
		//获取连接
		Connection conn=dataSource.getConnection();
		//sql语句对象
		String sql="update newUser set username=? where id=?";
		PreparedStatement ps=conn.prepareStatement(sql);
		ps.setString(1, "张丹");
		ps.setString(2, "1");
		ps.executeUpdate();
		ps.close();
		conn.close();
	}

}
