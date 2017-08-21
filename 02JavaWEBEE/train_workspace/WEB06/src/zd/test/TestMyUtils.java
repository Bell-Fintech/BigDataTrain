package zd.test;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import org.junit.Before;
import org.junit.Test;

import zd.utils.MyDbUtils;

public class TestMyUtils {
	Connection conn=null;
	@Before
	public void init() throws SQLException{
		//已经注册驱动  因为是static代码块 在类加载时已经加载那一部分代码
		conn=MyDbUtils.getConnection();
	}
	
	@Test
	public void add() throws SQLException{
		Statement st=conn.createStatement();
		String sql="insert into products values(null,'c#',100,'计算机',1000,'简单') ";
		st.executeUpdate(sql);
		MyDbUtils.release(conn, st, null);
	}
	@Test
	public void update(){
		
	}
	@Test
	public void delete(){
		
	}
}
