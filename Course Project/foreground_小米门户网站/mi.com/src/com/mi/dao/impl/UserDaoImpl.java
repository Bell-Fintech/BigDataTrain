package com.mi.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import com.mi.util.DataBaseConnection;
import com.mi.domain.User;


public class UserDaoImpl {
	private Connection conn;
	private PreparedStatement pstmt;
	private ResultSet rs;
	
	public UserDaoImpl(){
		this.conn = DataBaseConnection.getConnection();
	}
	
	public boolean login(User user){
		boolean flag = false;
		String sql="select * from user where uname = ? and upassword = ?";
		try {
			pstmt=conn.prepareStatement(sql);
			pstmt.setString(1, user.getUname());
			pstmt.setString(2, user.getUpassword());
			ResultSet rs= pstmt.executeQuery();
			if(rs.next()){
				flag = true;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return flag;
	}
	
	public int addUser(User user){
		
		int result=0;
		
		String sql="select * from user where uname=?";
		
		try {
			pstmt=conn.prepareStatement(sql);
			pstmt.setString(1, user.getUname());
			rs=pstmt.executeQuery();
			if(rs.next()){
				result=2;
			}else{
				sql="insert into user values(?,?,?,?,?,?,?)";
				pstmt=conn.prepareStatement(sql);
				pstmt.setInt(1,user.getUid());
				pstmt.setString(2,user.getUname());
				pstmt.setString(3,user.getUpassword());
				pstmt.setString(4,user.getUtelephone());
				pstmt.setString(5,user.getUemail());
				pstmt.setString(6,user.getUaddress());
				pstmt.setString(7,user.getSex());
				result=pstmt.executeUpdate();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return result;
	}
	
	public int findIdByUname(String uname){
		int uid = 0;
		String sql="select uid from user where uname=?";
		try {
			pstmt=conn.prepareStatement(sql);
			pstmt.setString(1, uname);
			rs=pstmt.executeQuery();
			if(rs.next()){
				uid = rs.getInt(1);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return uid;	
	}
}
