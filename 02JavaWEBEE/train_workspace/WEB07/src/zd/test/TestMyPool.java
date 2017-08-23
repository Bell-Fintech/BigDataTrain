package zd.test;

import java.sql.Connection;
import java.sql.PreparedStatement;

import zd.mypool.MyDataPool;

public class TestMyPool {
	public static void main(String[] args) throws Exception {
		MyDataPool pool = new MyDataPool();
		//获取数据库连接池中的连接
		Connection conn = pool.getConnection();
		String sql = "insert into user1 values(null,?)" ;
		PreparedStatement ps = conn.prepareStatement(sql);
		ps.setString(1, "西门庆");
		ps.executeUpdate();
		//将连接返回给池子
		pool.addBack(conn);
	}
}
