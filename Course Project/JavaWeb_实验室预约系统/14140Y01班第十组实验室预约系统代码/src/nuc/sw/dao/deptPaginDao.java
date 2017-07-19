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
		   //创建List
		   List<Member> list=new ArrayList<Member>();
		   // 获取数据库连接
		   Connection conn=DBUtil.getConn();
		   //分页查询的SQL语句
		   String sql="select * from student order by username desc limit ?,?";
				try {
					PreparedStatement ps=conn.prepareStatement(sql);
					ps.setInt(1, (page-1)*Member.PAGE_SIZE);
					ps.setInt(2,Member.PAGE_SIZE);
					ResultSet rs=ps.executeQuery();
					   //光标向后移动 并判释放有效
					while(rs.next()){
						   //将查询处理的结果集里的信息封装到m
						//实例化student   
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
//查询总记录数
public int findCount(){
int count=0;
//获取连接
Connection conn=DBUtil.getConn();
String sql="select count(*) from student";
try {
	Statement stmt=(Statement) conn.createStatement();
	ResultSet rs=stmt.executeQuery(sql);
	if(rs.next()){
		count=rs.getInt(1);
	   }
	
} catch (SQLException e) {
	// TODO 自动生成的 catch 块
	e.printStackTrace();
}
return count;
}
}