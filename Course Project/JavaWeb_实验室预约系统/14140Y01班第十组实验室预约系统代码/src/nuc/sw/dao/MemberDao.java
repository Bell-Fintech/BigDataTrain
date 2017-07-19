package nuc.sw.dao;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import nuc.sw.bean.Member;
import nuc.sw.bean.LoginBean;
import nuc.sw.bean.manager;
import nuc.sw.dbc.DBUtil;

public class MemberDao {
	//判断是不是合法用户
		private Connection conn=null;
		private PreparedStatement ps=null;
		private ResultSet rs=null;
		public boolean isUser(LoginBean lb){
			boolean flag=false;
		//获取连接
		conn=DBUtil.getConn();
		//操作数据
		String sql="select username,password,type from login where username=? and password=?and type=?";
		
		try {
			ps=conn.prepareStatement(sql);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}


		try {
			ps.setString(1,lb.getUsername());
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			ps.setString(2,lb.getPassword());
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			ps.setString(2,lb.getPassword());
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			rs=ps.executeQuery();
		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			if(rs.next()){
				flag=true;
				
				
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return flag;
		
		
		}
		
		
		
		//判断是否预约成功
		public boolean doInsert(Member m){
			   boolean flag=false;
			   //获取链接  
			  conn=DBUtil.getConn();
			  
			   //操作数据
			   try {
				String sql="insert into student values(?,?,?,?,?,?,?,?)";
				 
				   ps=conn.prepareStatement(sql);
				   ps.setString(1,m.getUsername());
				   ps.setString(2,m.getPassword());
				   ps.setString(3,m.getDept());
				   ps.setString(4,m.getName());
				   ps.setString(5,m.getWeek());
				   ps.setString(6,m.getDay());
				   ps.setString(7,m.getTime());
				   ps.setString(8,m.getSbook());
					if(ps.executeUpdate()>0){
						flag=true;
					             }
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
				return flag;
				}	
		
		  //根据用户名查询所有用户的信息
		   public List<Member> findAllDay(String day){
			   List<Member> mlistday=new ArrayList<Member>();
			   Member  m=null;
			   //获取连接
			   conn=DBUtil.getConn();
			   //操作数据 查询到的数据放到m中
			   String sql="select * from student where day=?";
				try {
					ps=conn.prepareStatement(sql);
					ps.setString(1,day);
					rs=ps.executeQuery();
				} catch (SQLException e) {
					// TODO 自动生成的 catch 块
					e.printStackTrace();
				}
				   try {
					while(rs.next()){
						   //将查询处理的结果集里的信息封装到m
						   m=new Member();
						  m.setUsername(rs.getString(1));
						  m.setPassword(rs.getString(2));
						  m.setDept(rs.getString(3));
						  m.setName(rs.getString(4));
						  m.setWeek(rs.getString(5));
						  m.setDay(rs.getString(6));
						  m.setTime(rs.getString(7));
						  m.setSbook(rs.getString(8));
						  mlistday.add(m);
					   }
				} catch (SQLException e) {
					// TODO 自动生成的 catch 块
					e.printStackTrace();
				}
			   return mlistday;   
		   }
		   
		 //根据用户名查询所有用户的信息
		   public List<Member> findAllWeek(String week){
			   List<Member> mlist=new ArrayList<Member>();
			   Member  m=null;
			   //获取连接
			   conn=DBUtil.getConn();
			   //操作数据 查询到的数据放到m中
			   String sql="select * from student where week=?";
				try {
					ps=conn.prepareStatement(sql);
					ps.setString(1,week);
					rs=ps.executeQuery();
				} catch (SQLException e) {
					// TODO 自动生成的 catch 块
					e.printStackTrace();
				}
				   try {
					while(rs.next()){
						   //将查询处理的结果集里的信息封装到m
						   m=new Member();
						  m.setUsername(rs.getString(1));
						  m.setPassword(rs.getString(2));
						  m.setDept(rs.getString(3));
						  m.setName(rs.getString(4));
						  m.setWeek(rs.getString(5));
						  m.setDay(rs.getString(6));
						  m.setTime(rs.getString(7));
						  m.setSbook(rs.getString(8));
						  mlist.add(m);
					   }
				} catch (SQLException e) {
					// TODO 自动生成的 catch 块
					e.printStackTrace();
				}
			   return mlist;   
		   }
		   
		//显示个人预约信息
		public Member findByUsername(String username){
			Member m=null;
			//获取连接
			conn=DBUtil.getConn();
			System.out.println(username);
			//操作数据
			String sql="select * from student where username=?";
			try {
				ps=conn.prepareStatement(sql);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			try {
				ps.setString(1,username);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			try {
				rs=ps.executeQuery();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			try {
				if(rs.next()){
				//将查询到的数据封装到m中
					
					m=new Member();
					m.setUsername(rs.getString(1));
					m.setPassword(rs.getString(2));
					m.setDept(rs.getString(3));
					m.setName(rs.getString(4));
					m.setWeek(rs.getString(5));
					m.setDay(rs.getString(6));
					m.setTime(rs.getString(7));
					m.setSbook(rs.getString(8));
					
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			    return m;
		}
		public boolean doModify(Member m){
			 boolean flag=false;
			   //获取链接  
			   conn=DBUtil.getConn();
			//操作数据
			 String sql="update student set username=?,password=?,dept=?,name=?,week=?,day=?,time=?,sbook=? where username=?";
			 try {
				PreparedStatement ps=conn.prepareStatement(sql);
				ps.setString(1,m.getUsername());
				   ps.setString(2,m.getPassword());
				   ps.setString(3,m.getDept());
				   ps.setString(4,m.getName());
				   ps.setString(5,m.getWeek());
				   ps.setString(6,m.getDay());
				   ps.setString(7,m.getTime());
				   ps.setString(8,m.getSbook());
				   ps.setString(9,m.getUsername());
				   if(ps.executeUpdate()>0){
					   flag=true;
				                          }
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			   return flag;
		     }
		//取消预约
		public Member doDelete(String username){
			Member m=null;
			   //获取链接  
			   conn=DBUtil.getConn();
			   //操作数据
			   String sql="delete from student where username=?";
			   try {
				 ps=conn.prepareStatement(sql);
				   ps.setString(1,username);
				   if(ps.executeUpdate()>0){
					   
				                          }
			       } catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			                              }
			   return m;
		}
		public ResultSet Servlet(LoginBean lb){ 
			ResultSet rs=null;
			  conn=DBUtil.getConn();
			try{
				
				String sql="select * from login where username=? and password=? and type=?";
				PreparedStatement ps=conn.prepareStatement(sql);
				ps.setString(1, lb.getUsername());
				ps.setString(2, lb.getPassword());
				ps.setString(3, lb.getType());
				rs=ps.executeQuery();
			}
			catch(Exception e){
				e.printStackTrace();
			}
			return rs;
		}
		
		public int getId(int Id)
		{
		 int m=0;
		//获取链接  
		conn=DBUtil.getConn();
		//操作数据
		try{
		String sql="select count(*) from student Where Id=?";
		ps=conn.prepareStatement(sql);
		ps.setInt(1, Id);
		rs=ps.executeQuery();
		if(rs.next()){   
				rs.getInt(1);
		}
		}
		catch(SQLException ex){
		ex.printStackTrace();
		}
		return m;
		
}
}