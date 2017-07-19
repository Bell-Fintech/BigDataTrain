package nuc.sw.dao;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import nuc.sw.bean.Member;
import nuc.sw.bean.LoginBean;
import nuc.sw.bean.manager;
import nuc.sw.dbc.DBUtil;

public class MemberDao {
	//�ж��ǲ��ǺϷ��û�
		private Connection conn=null;
		private PreparedStatement ps=null;
		private ResultSet rs=null;
		public boolean isUser(LoginBean lb){
			boolean flag=false;
		//��ȡ����
		conn=DBUtil.getConn();
		//��������
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
		
		
		
		//�ж��Ƿ�ԤԼ�ɹ�
		public boolean doInsert(Member m){
			   boolean flag=false;
			   //��ȡ����  
			  conn=DBUtil.getConn();
			  
			   //��������
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
		
		  //�����û�����ѯ�����û�����Ϣ
		   public List<Member> findAllDay(String day){
			   List<Member> mlistday=new ArrayList<Member>();
			   Member  m=null;
			   //��ȡ����
			   conn=DBUtil.getConn();
			   //�������� ��ѯ�������ݷŵ�m��
			   String sql="select * from student where day=?";
				try {
					ps=conn.prepareStatement(sql);
					ps.setString(1,day);
					rs=ps.executeQuery();
				} catch (SQLException e) {
					// TODO �Զ����ɵ� catch ��
					e.printStackTrace();
				}
				   try {
					while(rs.next()){
						   //����ѯ����Ľ���������Ϣ��װ��m
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
					// TODO �Զ����ɵ� catch ��
					e.printStackTrace();
				}
			   return mlistday;   
		   }
		   
		 //�����û�����ѯ�����û�����Ϣ
		   public List<Member> findAllWeek(String week){
			   List<Member> mlist=new ArrayList<Member>();
			   Member  m=null;
			   //��ȡ����
			   conn=DBUtil.getConn();
			   //�������� ��ѯ�������ݷŵ�m��
			   String sql="select * from student where week=?";
				try {
					ps=conn.prepareStatement(sql);
					ps.setString(1,week);
					rs=ps.executeQuery();
				} catch (SQLException e) {
					// TODO �Զ����ɵ� catch ��
					e.printStackTrace();
				}
				   try {
					while(rs.next()){
						   //����ѯ����Ľ���������Ϣ��װ��m
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
					// TODO �Զ����ɵ� catch ��
					e.printStackTrace();
				}
			   return mlist;   
		   }
		   
		//��ʾ����ԤԼ��Ϣ
		public Member findByUsername(String username){
			Member m=null;
			//��ȡ����
			conn=DBUtil.getConn();
			System.out.println(username);
			//��������
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
				//����ѯ�������ݷ�װ��m��
					
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
			   //��ȡ����  
			   conn=DBUtil.getConn();
			//��������
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
		//ȡ��ԤԼ
		public Member doDelete(String username){
			Member m=null;
			   //��ȡ����  
			   conn=DBUtil.getConn();
			   //��������
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
		//��ȡ����  
		conn=DBUtil.getConn();
		//��������
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