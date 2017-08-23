package shiwu;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class TestShiWu {
	public static void main(String[] args) throws Exception {

		// DriverManager.registerDriver(new Driver());
		Class.forName("com.mysql.jdbc.Driver");
		// 获取连接
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/train_mysql?characterEncoding=UTF-8",
				"root", "");
		// 获取执行SQL语句的对象
		Statement statement = conn.createStatement();
		conn.setAutoCommit(false);
		String sql1 = "update user set  money= money-100  where id = 1";
		//西门庆花钱
		int i = statement.executeUpdate(sql1);
		//int h = 1/0 ;
		//大朗收钱
		String sql2 = "update user set money = money+100 where id = 2";
		int j = statement.executeUpdate(sql2);
		conn.commit();
		// 释放资源
		statement.close();
		conn.close();

	}

}
