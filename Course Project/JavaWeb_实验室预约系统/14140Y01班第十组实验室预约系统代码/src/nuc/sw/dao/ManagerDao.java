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
  
	   //�����û�����ѯ�����û�����Ϣ
	   public List<manager> findAll(String dept){
		   List<manager> mlist=new ArrayList<manager>();
		   manager  m=null;
		   //��ȡ����
		   conn=DBUtil.getConn();
		   //�������� ��ѯ�������ݷŵ�m��
		   String sql="select * from manager where dept=?";
			try {
				ps=conn.prepareStatement(sql);
				ps.setString(1,dept);
				rs=ps.executeQuery();
			} catch (SQLException e) {
				// TODO �Զ����ɵ� catch ��
				e.printStackTrace();
			}
			   try {
				while(rs.next()){
					   //����ѯ����Ľ���������Ϣ��װ��m
					   m=new manager();
					  m.setUsername(rs.getString(1));
					  m.setPassword(rs.getString(2));
					  m.setDept(rs.getString(3));
					  m.setName(rs.getString(4));
					  m.setScount(rs.getString(5));
					 mlist.add(m);
				   }
			} catch (SQLException e) {
				// TODO �Զ����ɵ� catch ��
				e.printStackTrace();
			}
		   return mlist;   
	   }
	   
	   
	   public List<manager> findAll(){
		   List<manager> mlist=new ArrayList<manager>();
		   manager  m=null;
		   //��ȡ����
		   conn=DBUtil.getConn();
		   //�������� ��ѯ�������ݷŵ�m��
		   String sql="select * from manager";
			try {
				ps=conn.prepareStatement(sql);
				rs=ps.executeQuery();
			} catch (SQLException e) {
				// TODO �Զ����ɵ� catch ��
				e.printStackTrace();
			}
			   try {
				while(rs.next()){
					   //����ѯ����Ľ���������Ϣ��װ��m
					   m=new manager();
					  m.setUsername(rs.getString(1));
					  m.setPassword(rs.getString(2));
					  m.setDept(rs.getString(3));
					  m.setName(rs.getString(4));
					  m.setScount(rs.getString(5));
					 mlist.add(m);
				   }
			} catch (SQLException e) {
				// TODO �Զ����ɵ� catch ��
				e.printStackTrace();
			}
		   return mlist;   
	   }
	   
	   //�����û�����ѯ���û�����Ϣ
	   public manager findByUsername(String name){
		   manager m=null;
		   //��ȡ����
		   conn=DBUtil.getConn();
		   //�������� ��ѯ�������ݷŵ�m��
		   String sql="select * from manager where name=?";
		   try {
			ps=conn.prepareStatement(sql);
			ps.setString(1,name);
			rs=ps.executeQuery();
			   if(rs.next()){
				   //����ѯ����Ľ���������Ϣ��װ��m
				   m=new manager();
				  m.setUsername(rs.getString(1));
				  m.setPassword(rs.getString(2));
				  m.setDept(rs.getString(3));
				  m.setName(rs.getString(4));
				  m.setScount(rs.getString(5));
			   }
		} catch (SQLException e) {
			// TODO �Զ����ɵ� catch ��
			e.printStackTrace();
		}
		   return m;   
	   }
	   
	 //�����û����޸ĸ��û�����Ϣ
	   public boolean doUpdate(manager m){
		     boolean flag2=false;
		    //��ȡ����
		  conn=DBUtil.getConn();
		  //��������
		  String sql="update manager set username=?,password=?,dept=?,name=?,scount=? where username=?";
				try {
					ps=conn.prepareStatement(sql);
				} catch (SQLException e1) {
					// TODO �Զ����ɵ� catch ��
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
					// TODO �Զ����ɵ� catch ��
					e.printStackTrace();
				}
		return flag2;
	   }
	   
	  

	//�����û���ɾ�����û�����Ϣ
	   public manager doDelete(String username){
		   manager m=null;
		    //��ȡ����
		  conn=DBUtil.getConn();
		  //��������
		  String sql="delete from manager where username=?";
				try {
					ps=conn.prepareStatement(sql);
					ps.setString(1,username);
					if(ps.executeUpdate()>0){
						return m;
					}
				} catch (SQLException e) {
					// TODO �Զ����ɵ� catch ��
					e.printStackTrace();
				}
				return m;
	   }
}
