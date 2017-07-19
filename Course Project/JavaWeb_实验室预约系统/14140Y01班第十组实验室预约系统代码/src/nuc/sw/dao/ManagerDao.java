package nuc.sw.dao;
import nuc.sw.dbc.*;
import nuc.sw.bean.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
//import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import nuc.sw.dbc.*;
public class ManagerDao {
	private Connection conn=null;
	   private PreparedStatement ps=null;
	   private ResultSet rs=null;
	   public boolean doInsert(manager m){
			boolean flag=false;
			conn=DBUtil.getConn();
			String sql="insert into manager values(?,?,?,?,?)";
			try {
				ps=conn.prepareStatement(sql);
				ps.setString(1,m.getUsername());
				ps.setString(2,m.getPassword());
				ps.setString(3,m.getDept());
				ps.setString(4,m.getName());
				ps.setString(5,m.getScount());
				if( ps.executeUpdate()>0){
					flag=true;
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return flag;
		}
  
	   //根据用户名查询所有用户的信息
	   public List<manager> findAll(String dept){
		   List<manager> mlist=new ArrayList<manager>();
		   manager  m=null;
		   //获取连接
		   conn=DBUtil.getConn();
		   //操作数据 查询到的数据放到m中
		   String sql="select * from manager where dept=?";
			try {
				ps=conn.prepareStatement(sql);
				ps.setString(1,dept);
				rs=ps.executeQuery();
			} catch (SQLException e) {
				// TODO 自动生成的 catch 块
				e.printStackTrace();
			}
			   try {
				while(rs.next()){
					   //将查询处理的结果集里的信息封装到m
					   m=new manager();
					  m.setUsername(rs.getString(1));
					  m.setPassword(rs.getString(2));
					  m.setDept(rs.getString(3));
					  m.setName(rs.getString(4));
					  m.setScount(rs.getString(5));
					 mlist.add(m);
				   }
			} catch (SQLException e) {
				// TODO 自动生成的 catch 块
				e.printStackTrace();
			}
		   return mlist;   
	   }
	   
	   
	   public List<manager> findAll(){
		   List<manager> mlist=new ArrayList<manager>();
		   manager  m=null;
		   //获取连接
		   conn=DBUtil.getConn();
		   //操作数据 查询到的数据放到m中
		   String sql="select * from manager";
			try {
				ps=conn.prepareStatement(sql);
				rs=ps.executeQuery();
			} catch (SQLException e) {
				// TODO 自动生成的 catch 块
				e.printStackTrace();
			}
			   try {
				while(rs.next()){
					   //将查询处理的结果集里的信息封装到m
					   m=new manager();
					  m.setUsername(rs.getString(1));
					  m.setPassword(rs.getString(2));
					  m.setDept(rs.getString(3));
					  m.setName(rs.getString(4));
					  m.setScount(rs.getString(5));
					 mlist.add(m);
				   }
			} catch (SQLException e) {
				// TODO 自动生成的 catch 块
				e.printStackTrace();
			}
		   return mlist;   
	   }
	   
	   //根据用户名查询该用户的信息
	   public manager findByUsername(String name){
		   manager m=null;
		   //获取连接
		   conn=DBUtil.getConn();
		   //操作数据 查询到的数据放到m中
		   String sql="select * from manager where name=?";
		   try {
			ps=conn.prepareStatement(sql);
			ps.setString(1,name);
			rs=ps.executeQuery();
			   if(rs.next()){
				   //将查询处理的结果集里的信息封装到m
				   m=new manager();
				  m.setUsername(rs.getString(1));
				  m.setPassword(rs.getString(2));
				  m.setDept(rs.getString(3));
				  m.setName(rs.getString(4));
				  m.setScount(rs.getString(5));
			   }
		} catch (SQLException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}
		   return m;   
	   }
	   
	 //根据用户名修改该用户的信息
	   public boolean doUpdate(manager m){
		     boolean flag2=false;
		    //获取连接
		  conn=DBUtil.getConn();
		  //操作数据
		  String sql="update manager set username=?,password=?,dept=?,name=?,scount=? where username=?";
				try {
					ps=conn.prepareStatement(sql);
				} catch (SQLException e1) {
					// TODO 自动生成的 catch 块
					e1.printStackTrace();
				}
				try {
					ps.setString(1,m.getUsername());
					ps.setString(2,m.getPassword());
					ps.setString(3, m.getDept());
					ps.setString(4, m.getName());
					ps.setString(5, m.getScount());
					ps.setString(6,m.getUsername());
					if(ps.executeUpdate()>0){
						 flag2=true;
					}
					if(ps!=null)
                               ps.close();
				} catch (SQLException e) {
					// TODO 自动生成的 catch 块
					e.printStackTrace();
				}
		return flag2;
	   }
	   
	  

	//根据用户名删除该用户的信息
	   public manager doDelete(String username){
		   manager m=null;
		    //获取连接
		  conn=DBUtil.getConn();
		  //操作数据
		  String sql="delete from manager where username=?";
				try {
					ps=conn.prepareStatement(sql);
					ps.setString(1,username);
					if(ps.executeUpdate()>0){
						return m;
					}
				} catch (SQLException e) {
					// TODO 自动生成的 catch 块
					e.printStackTrace();
				}
				return m;
	   }
}
