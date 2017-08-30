package com.eems.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DBUtil 
{
	private Connection conn;
	private PreparedStatement ps;
	private ResultSet rs;
	//获得连接
	private void getConnection()
	{
		try {
			//注册获得数据库的驱动
			Class.forName("com.mysql.jdbc.Driver");
			//获得与数据库的连接
			String url="jdbc:mysql://localhost:3306/List";
			conn=DriverManager.getConnection(url,"root","");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e){
			e.printStackTrace();
		}
	}
	//关闭
	public void close()
	{
		if(rs!=null)
			try {
				rs.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		if(ps!=null)
			try {
				ps.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		if(conn!=null)
			try {
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
	}
	
	//做更新 -- 增删改
	//sql=insert into book(name,price,author,pubDate) values(?,?,?,?)
	public int executeUpdate(String sql,Object...objects)
	{
		try {
			this.getConnection();//获取连接
			ps=conn.prepareStatement(sql);//获取数据库对象
			if(objects!=null)//设置参数
				for(int i=0;i<objects.length;i++)
				{
					ps.setObject(i+1, objects[i]);
				}
			return ps.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}finally{
			this.close();
		}
		return -1;
	}
	//查询
	public ResultSet executeQuery(String sql,Object...objects)
	{
		try {
			this.getConnection();//获取连接
			ps=conn.prepareStatement(sql);//获取数据库对象
			if(objects!=null)//设置sql语句的参数
				for(int i=0;i<objects.length;i++)
				{
					ps.setObject(i+1, objects[i]);
				}
			return rs=ps.executeQuery();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}
}
