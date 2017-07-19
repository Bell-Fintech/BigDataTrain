package com.ShanxiTravel.dao;

import java.io.UnsupportedEncodingException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.ShanxiTravel.dbc.DBUtil;
import com.ShanxiTravel.entity.usercomment;
public class UserCommentDao implements CommentDao<usercomment> {
	Connection conn=null;
	PreparedStatement ps=null;
	ResultSet rs=null;
	
	public void addOne(usercomment comment) throws UnsupportedEncodingException {
		// TODO Auto-generated method stub
		conn=DBUtil.getConnection();
		String sql="insert into usercomment(id,mainspotId,content) values(?,?,?)";
		try {
			ps=conn.prepareStatement(sql);
			ps.setString(1, comment.getId());
			ps.setString(2, comment.getMainspotId());
			ps.setString(3, comment.getContent());
			if(ps.executeUpdate()>0){
				//sql.query("SET NAMES GBK");
				sql.getBytes("utf8");
		      	System.out.print("评论表添加评论信息成功！");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public usercomment findById(String commentId) {
		// TODO Auto-generated method stub
		usercomment comment=null;
		conn=DBUtil.getConnection();
		String sql="select * from usercomment where id=?";
		try {
			ps=conn.prepareStatement(sql);
			ps.setString(1,commentId);
			rs=ps.executeQuery();
			if(rs.next()){
				comment=new usercomment();
				comment.setId(rs.getString(1));
				comment.setMainspotId(rs.getString(2));
				comment.setContent(rs.getString(3));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return comment;
	}
	public List<usercomment> findAll() {
		// TODO Auto-generated method stub
		List<usercomment> comments=new ArrayList<usercomment>();
		conn=DBUtil.getConnection();
		String sql="select * from usercomment";
		try {
			ps=conn.prepareStatement(sql);
			rs=ps.executeQuery();
		   usercomment comment=null;
			while(rs.next()){
				comment=new usercomment();
				comment.setId(rs.getString(1));
				comment.setMainspotId(rs.getString(2));
				comment.setContent(rs.getString(3));
				comments.add(comment);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
		return comments;
	}
	public List<usercomment> findBySpotId(String id) {
		// TODO Auto-generated method stub
		List<usercomment> comments=new ArrayList<usercomment>();
		conn=DBUtil.getConnection();
		String sql="select * from usercomment where mainspotId = ?";
		try {
			ps=conn.prepareStatement(sql);
			ps.setString(1,id);
			rs=ps.executeQuery();
			usercomment comment=null;
			while(rs.next()){
				comment=new usercomment();
				comment.setId(rs.getString(1));
				comment.setMainspotId(rs.getString(2));
				comment.setContent(rs.getString(3));
				comments.add(comment);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
		return comments;
	}
	public void deleteOne(usercomment comment){
		// TODO Auto-generated method stub
		conn=DBUtil.getConnection();
		String sql="delete from usercomment where id=?";
		try {
			ps=conn.prepareStatement(sql);
			ps.setString(1,comment.getId());
			if(ps.executeUpdate()>0){
				System.out.println("删除成功");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
