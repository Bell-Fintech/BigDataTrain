package com.ShanxiTravel.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import com.ShanxiTravel.dbc.DBUtil;
import com.ShanxiTravel.entity.mainspot;
import com.ShanxiTravel.entity.user;
import com.ShanxiTravel.entity.images;

public class ImagesDao implements BaseDao<images> {

	Connection conn=null;
	PreparedStatement ps=null;
	ResultSet rs=null;
	

	public void addOne(mainspot Spot) {
		// TODO Auto-generated method stub
	}

		public void addImage(images image) {
			// TODO Auto-generated method stub
			conn=DBUtil.getConnection();
			String sql="insert into images(id,name,path) values(?,?,?)";
			System.out.println(image.getId());
			System.out.println(image.getName());
			System.out.println(image.getPath());
			try {
				ps=conn.prepareStatement(sql);
				ps.setLong(1, image.getId());
				ps.setString(2, image.getName());
				ps.setString(3, image.getPath());
				if(ps.executeUpdate()>0){
			      	System.out.print("添加图片成功！");
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
		}
	}
	public List<images> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	public List<images> findByName(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	public images findById(Long id) {
		// TODO Auto-generated method stub
		images image=null;
		conn=DBUtil.getConnection();
		String sql="select * from Images where id=?";
		try {
			ps=conn.prepareStatement(sql);
			ps.setLong(1,id);
			rs=ps.executeQuery();
			if(rs.next()){
				image=new images();
				image.setId(rs.getLong(1));
				image.setName(rs.getString(2));
				image.setPath(rs.getString(3));
				
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return image;
	}

	public List<images> findByCity(String city) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<images> findByType(String type) {
		// TODO Auto-generated method stub
		return null;
	}

	public void updateById(mainspot Spot) {
		// TODO Auto-generated method stub
		return;
	}


	public void deleteSpot(mainspot Spot) {
		// TODO Auto-generated method stub
		
	}

	public List<images> findByRoute(String route) {
		// TODO Auto-generated method stub
		return null;
	}

	public void updateByUsername(user u) {
		// TODO Auto-generated method stub
		
	}

	public void deleteByUsername(user u) {
		// TODO Auto-generated method stub
		
	}



	






}
