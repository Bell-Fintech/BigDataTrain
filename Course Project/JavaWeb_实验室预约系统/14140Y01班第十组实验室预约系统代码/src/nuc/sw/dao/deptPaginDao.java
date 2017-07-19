package nuc.sw.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.mysql.jdbc.Statement;

import nuc.sw.bean.Member;
import nuc.sw.dbc.DBUtil;

public class deptPaginDao {
	public List<Member> find(int page){
		   //����List
		   List<Member> list=new ArrayList<Member>();
		   // ��ȡ���ݿ�����
		   Connection conn=DBUtil.getConn();
		   //��ҳ��ѯ��SQL���
		   String sql="select * from student order by username desc limit ?,?";
				try {
					PreparedStatement ps=conn.prepareStatement(sql);
					ps.setInt(1, (page-1)*Member.PAGE_SIZE);
					ps.setInt(2,Member.PAGE_SIZE);
					ResultSet rs=ps.executeQuery();
					   //�������ƶ� �����ͷ���Ч
					while(rs.next()){
						   //����ѯ����Ľ���������Ϣ��װ��m
						//ʵ����student   
						Member m=new Member();
						  m.setUsername(rs.getString("username"));
						  m.setPassword(rs.getString("password"));
						  m.setDept(rs.getString("dept"));
						  m.setName(rs.getString("name"));
						  m.setWeek(rs.getString("week"));
						  m.setDay(rs.getString("day"));
						  m.setTime(rs.getString("time"));
						  m.setSbook(rs.getString("sbook"));
						   list.add(m);
						  //  rs.close();
							//ps.close();
					   }
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
  return list;   
	   }
//��ѯ�ܼ�¼��
public int findCount(){
int count=0;
//��ȡ����
Connection conn=DBUtil.getConn();
String sql="select count(*) from student";
try {
	Statement stmt=(Statement) conn.createStatement();
	ResultSet rs=stmt.executeQuery(sql);
	if(rs.next()){
		count=rs.getInt(1);
	   }
	
} catch (SQLException e) {
	// TODO �Զ����ɵ� catch ��
	e.printStackTrace();
}
return count;
}
}