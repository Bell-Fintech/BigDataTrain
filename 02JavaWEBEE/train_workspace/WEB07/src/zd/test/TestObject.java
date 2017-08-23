package zd.test;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.junit.Before;
import org.junit.Test;

import zd.demo.MyDbUtils;

public class TestObject {
	Connection conn  = null ;
	@Before
	public void init() throws SQLException{
		//获取数据库连接
	 conn = MyDbUtils.getConnection();
	}
	
	@Test
	public void run() throws SQLException{
		//String name="zhangsan or 1=1" ;
		String sql = "select * from user1 where username = ? and password = ?" ;
		//获取执行sql语句的对象
		PreparedStatement ps = conn.prepareStatement(sql) ;
		//select * from user1 where username =zhangsan or 1=1 and password=abc ;
		ps.setString(1, "zhangsan");
		ps.setString(2, "123");
		//在执行sql语句之前
		ResultSet resultSet = ps.executeQuery() ;
		while(resultSet.next()){
			String name = resultSet.getString("username");
			System.out.println(name);
		}
		MyDbUtils.release(conn, ps,resultSet);
	}
	@Test
	/**
	 * 插入数据
	 * @throws SQLException
	 */
	public void run1() throws SQLException{
		//String name="zhangsan or 1=1" ;
		String sql = "insert into user1 values(null,?,?,?,?,?,?,?,null)" ;
		//获取执行sql语句的对象
		PreparedStatement ps = conn.prepareStatement(sql) ;
		//select * from user1 where username =zhangsan or 1=1 and password=abc ;
		ps.setString(1, "熊二");
		ps.setString(2, "111");
		ps.setString(3, "nan");
		ps.setString(4, "123@qq.com");
		ps.setString(5, "12345678912");
		ps.setString(6, "1");
		ps.setString(7, "主角");
		//在执行sql语句之前
		int i = ps.executeUpdate();
		System.out.println(i);
		MyDbUtils.release(conn, ps,null);
	}
	
	
	
	
	
	
}
