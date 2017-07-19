package com.ShanxiTravel.dao;

import java.io.UnsupportedEncodingException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.ShanxiTravel.dbc.DBUtil;
import com.ShanxiTravel.entity.images;
import com.ShanxiTravel.entity.mainspot;
import com.ShanxiTravel.entity.user;

public class UserDao implements BaseDao<user> {
	Connection conn=null;
	PreparedStatement ps=null;
	ResultSet rs=null;
	
	public void addOne(user u) {
		// TODO Auto-generated method stub
		conn=DBUtil.getConnection();
		String sql="insert into user(username,password,surepass,type,phone,email) values(?,?,?,?,?,?)";
		try {
			ps=conn.prepareStatement(sql);
			ps.setString(1, u.getUsername());
			ps.setString(2, u.getPassword());
			ps.setString(3, u.getSurepass());
			ps.setString(4, u.getType());
			ps.setString(5,u.getPhone());
			ps.setString(6, u.getEmail());
			if(ps.executeUpdate()>0){
				//sql.query("SET NAMES GBK");
		      	System.out.print("注册用户信息成功！");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


	public void updateByUsername(user u) {
		// TODO Auto-generated method stub
		conn=DBUtil.getConnection();
		String sql="update  user set username=?,password=?,surepass=?,type=?, phone=?,email=? where username=?";
		try {
			ps=conn.prepareStatement(sql);
			ps.setString(1, u.getUsername());
			ps.setString(2, u.getPassword());
			ps.setString(3, u.getSurepass());
			ps.setString(4, u.getType());
			ps.setString(5,u.getPhone());
			ps.setString(6, u.getEmail());
			ps.setString(7, u.getUsername());
			if(ps.executeUpdate()>0){
				//sql.query("SET NAMES GBK");
		      	System.out.print("修改景点信息成功！");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public List<user> findAll() {
		// TODO Auto-generated method stub
		List<user> us=new ArrayList<user>();
		conn=DBUtil.getConnection();
		String sql="select * from user";
		try {
			ps=conn.prepareStatement(sql);
			rs=ps.executeQuery();
			user u=null;
			while(rs.next()){
				u=new user();
				u.setUsername(rs.getString(1));
				u.setPassword(rs.getString(2));
				u.setSurepass(rs.getString(3));
				u.setType(rs.getString(4));
				u.setPhone(rs.getString(5));
				u.setEmail(rs.getString(6));
				us.add(u);
		
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return us;
	}

	
	public List<user> findByName(String name) {
		// TODO Auto-generated method stub
		List<user> us=new ArrayList<user>();
		conn=DBUtil.getConnection();
		String sql="select * from user where username like ?";
		try {
			ps=conn.prepareStatement(sql);
			ps.setString(1, "%"+name+"%");
			rs=ps.executeQuery();
			user u=null;
			while(rs.next()){
				u=new user();
				u.setUsername(rs.getString(1));
				u.setPassword(rs.getString(2));
				u.setSurepass(rs.getString(3));
				u.setType(rs.getString(4));
				u.setPhone(rs.getString(5));
				u.setEmail(rs.getString(6));
				us.add(u);
		
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return us;
	}
	
	public List<user> findByType(String type) {
		// TODO Auto-generated method stub
		List<user> us=new ArrayList<user>();
		conn=DBUtil.getConnection();
		String sql="select * from user where type like?";
		try {
			ps=conn.prepareStatement(sql);
			ps.setString(1, "%"+type+"%");
			rs=ps.executeQuery();
			user u=null;
			while(rs.next()){
				u=new user();
				u.setUsername(rs.getString(1));
				u.setPassword(rs.getString(2));
				u.setSurepass(rs.getString(3));
				u.setType(rs.getString(4));
				u.setPhone(rs.getString(5));
				u.setEmail(rs.getString(6));
				us.add(u);
		
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return us;
	}

		
	public user findByUsername(String username) {
		// TODO Auto-generated method stub
		user u=null;
		conn=DBUtil.getConnection();
		String sql="select * from user where username=?";
		try {
			ps=conn.prepareStatement(sql);
			ps.setString(1,username);
			rs=ps.executeQuery();
			if(rs.next()){
				u=new user();
				u.setUsername(rs.getString(1));
				u.setPassword(rs.getString(2));
				u.setSurepass(rs.getString(3));
				u.setType(rs.getString(4));
				u.setPhone(rs.getString(5));
				u.setEmail(rs.getString(6));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return u;
	}


	public void addImage(images image) {
		// TODO Auto-generated method stub
		
	}

	public void deleteByUsername(user u) {
		// TODO Auto-generated method stub
		conn=DBUtil.getConnection();
		String sql="delete from user where username=?";
		try {
			ps=conn.prepareStatement(sql);
			ps.setString(1,u.getUsername());
			if(ps.executeUpdate()>0){
				System.out.println("删除成功");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}





	public List<user> findByCity(String city) {
		// TODO Auto-generated method stub
		return null;
	}


	public List<user> findByRoute(String route) {
		// TODO Auto-generated method stub
		return null;
	}


	public void updateById(mainspot Spot) {
		// TODO Auto-generated method stub
		
	}


	public void deleteSpot(mainspot Spot) {
		// TODO Auto-generated method stub
		
	}


	public void addOne(mainspot Spot) throws UnsupportedEncodingException {
		// TODO Auto-generated method stub
		
	}


	public void addImage1(images image) {
		// TODO Auto-generated method stub
		
	}


	public user findById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

}
