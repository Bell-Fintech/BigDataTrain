package com.ShanxiTravel.dao;

import java.io.UnsupportedEncodingException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.ShanxiTravel.dbc.DBUtil;
import com.ShanxiTravel.entity.mainspot;
import com.ShanxiTravel.entity.user;
import com.ShanxiTravel.entity.images;

public class SpotDao implements BaseDao<mainspot> {
	Connection conn=null;
	PreparedStatement ps=null;
	ResultSet rs=null;
	
	public void addOne(mainspot Spot) throws UnsupportedEncodingException {
		// TODO Auto-generated method stub
		conn=DBUtil.getConnection();
		String sql="insert into mainspot(id,name,price,city,type,editorial,route,image,comment) values(?,?,?,?,?,?,?,?,?)";
		try {
			ps=conn.prepareStatement(sql);
			ps.setString(1, Spot.getId());
			ps.setString(2, Spot.getName());
			ps.setInt(3, Spot.getPrice());
			ps.setString(4, Spot.getCity());
			ps.setString(5, Spot.getType());
			ps.setString(6, Spot.getEditorial());
			ps.setString(7, Spot.getRoute());
			ps.setLong(8, Spot.getImage());
			ps.setString(9, Spot.getComment());
			if(ps.executeUpdate()>0){
				//sql.query("SET NAMES GBK");
				sql.getBytes("utf8");
		      	System.out.print("添加景点信息成功！");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public void addComment(mainspot Spot) throws UnsupportedEncodingException {
		// TODO Auto-generated method stub
		conn=DBUtil.getConnection();
		String sql="insert into mainspot(comment) values(?)";
		try {
			ps=conn.prepareStatement(sql);
			ps.setString(1, Spot.getComment());
			if(ps.executeUpdate()>0){
				//sql.query("SET NAMES GBK");
				sql.getBytes("utf8");
		      	System.out.print("景点表添加评论信息成功！");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void updateById(mainspot Spot) {
		// TODO Auto-generated method stub
		conn=DBUtil.getConnection();
		String sql="update  mainspot set name=?,price=?,city=?,type=?, editorial=?,route=? where id=?";
		try {
			ps=conn.prepareStatement(sql);
			
			ps.setString(1, Spot.getName());
			ps.setInt(2, Spot.getPrice());
			ps.setString(3, Spot.getCity());
			ps.setString(4, Spot.getType());
			ps.setString(5, Spot.getEditorial());
			ps.setString(6, Spot.getRoute());
			ps.setString(7, Spot.getId());
			if(ps.executeUpdate()>0){
				//sql.query("SET NAMES GBK");
		      	System.out.print("修改景点信息成功！");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public List<mainspot> findAll() {
		// TODO Auto-generated method stub
		List<mainspot> Spots=new ArrayList<mainspot>();
		conn=DBUtil.getConnection();
		String sql="select * from mainspot";
		try {
			ps=conn.prepareStatement(sql);
			rs=ps.executeQuery();
		
			mainspot Spot=null;
			while(rs.next()){
				Spot=new mainspot();
				Spot.setId(rs.getString(1));
				Spot.setName(rs.getString(2));
				Spot.setPrice(rs.getInt(3));
				Spot.setCity(rs.getString(5));
				Spot.setType(rs.getString(6));
				Spot.setEditorial(rs.getString(7));
				Spot.setRoute(rs.getString(8));
				Spots.add(Spot);
		
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return Spots;
	}

	
	public List<mainspot> findByName(String name) {
		// TODO Auto-generated method stub
		List<mainspot> Spots=new ArrayList<mainspot>();
		conn=DBUtil.getConnection();
		String sql="select * from mainspot where name like ?";
		try {
			ps=conn.prepareStatement(sql);
			ps.setString(1, "%"+name+"%");
			rs=ps.executeQuery();
			mainspot Spot=null;
			while(rs.next()){
				Spot=new mainspot();
				Spot.setId(rs.getString(1));
				Spot.setName(rs.getString(2));
				Spot.setPrice(rs.getInt(3));
				Spot.setCity(rs.getString(5));
				Spot.setType(rs.getString(6));
				Spot.setEditorial(rs.getString(7));
				Spot.setRoute(rs.getString(8));
				Spots.add(Spot);
		
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return Spots;
	}
	
	public List<mainspot> findByType(String type) {
		// TODO Auto-generated method stub
		List<mainspot> Spots=new ArrayList<mainspot>();
		conn=DBUtil.getConnection();
		String sql="select * from mainspot where type like?";
		try {
			ps=conn.prepareStatement(sql);
			ps.setString(1, "%"+type+"%");
			rs=ps.executeQuery();
			mainspot Spot=null;
			while(rs.next()){
				Spot=new mainspot();
				Spot.setId(rs.getString(1));
				Spot.setName(rs.getString(2));
				Spot.setPrice(rs.getInt(3));
				Spot.setCity(rs.getString(5));
				Spot.setType(rs.getString(6));
				Spot.setEditorial(rs.getString(7));
				Spot.setRoute(rs.getString(8));
				Spots.add(Spot);
		
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return Spots;
	}
	
	public List<mainspot> findByCity(String city) {
		// TODO Auto-generated method stub
		List<mainspot> Spots=new ArrayList<mainspot>();
		conn=DBUtil.getConnection();
		String sql="select * from mainspot where city=?";
		try {
			ps=conn.prepareStatement(sql);
			ps.setString(1, city);
			rs=ps.executeQuery();
			mainspot Spot=null;
			while(rs.next()){
				Spot=new mainspot();
				Spot.setId(rs.getString(1));
				Spot.setName(rs.getString(2));
				Spot.setPrice(rs.getInt(3));
				Spot.setCity(rs.getString(5));
				Spot.setType(rs.getString(6));
				Spot.setEditorial(rs.getString(7));
				Spot.setRoute(rs.getString(8));
				Spots.add(Spot);
		
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return Spots;
	}
	public List<mainspot> findByRoute(String route) {
		// TODO Auto-generated method stub
		List<mainspot> Spots=new ArrayList<mainspot>();
		conn=DBUtil.getConnection();
		String sql="select * from mainspot where route like?";
		try {
			ps=conn.prepareStatement(sql);
			ps.setString(1, "%"+route+"%");
			rs=ps.executeQuery();
			mainspot Spot=null;
			while(rs.next()){
				Spot=new mainspot();
				Spot.setId(rs.getString(1));
				Spot.setName(rs.getString(2));
				Spot.setPrice(rs.getInt(3));
				Spot.setCity(rs.getString(5));
				Spot.setType(rs.getString(6));
				Spot.setEditorial(rs.getString(7));
				Spot.setRoute(rs.getString(8));
				Spots.add(Spot);
		
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return Spots;
	}
	public mainspot findById(String spotId) {
		// TODO Auto-generated method stub
		mainspot Spot=null;
		conn=DBUtil.getConnection();
		String sql="select * from mainspot where id=?";
		try {
			ps=conn.prepareStatement(sql);
			ps.setString(1,spotId);
			rs=ps.executeQuery();
			if(rs.next()){
				Spot=new mainspot();
				Spot.setId(rs.getString(1));
				Spot.setName(rs.getString(2));
				Spot.setPrice(rs.getInt(3));
				Spot.setCity(rs.getString(5));
				Spot.setType(rs.getString(6));
				Spot.setEditorial(rs.getString(7));
				Spot.setRoute(rs.getString(8));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return Spot;
	}


	public void addImage(images image) {
		// TODO Auto-generated method stub
		
	}

	public void deleteSpot(mainspot Spot) {
		// TODO Auto-generated method stub
		conn=DBUtil.getConnection();
		String sql="delete from mainspot where id=?";
		try {
			ps=conn.prepareStatement(sql);
			ps.setString(1,Spot.getId());
			if(ps.executeUpdate()>0){
				
				System.out.println("删除成功");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


	public void updateByUsername(user u) {
		// TODO Auto-generated method stub
		
	}


	public void deleteByUsername(user u) {
		// TODO Auto-generated method stub
		
	}


	public mainspot findById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

}
