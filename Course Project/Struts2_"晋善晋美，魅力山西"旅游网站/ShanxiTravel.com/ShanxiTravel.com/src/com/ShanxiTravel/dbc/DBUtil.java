package com.ShanxiTravel.dbc;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
public class DBUtil{
	private static final String DBDRIVER="org.gjt.mm.mysql.Driver";
	private static final String DBURL="jdbc:mysql://182.254.145.80:3306/shanxitravel?useUnicode=true&characterEncoding=UTF-8";
	private static final String DBUSER="root";
	private static final String DBPASSWORD="hz19950326";
	private static Connection conn=null;
	static{
		try{
			   Class.forName(DBDRIVER);
			   conn=DriverManager.getConnection(DBURL,DBUSER,DBPASSWORD);
			//   System.out.print(conn);
			}catch(Exception e){}
	}
	public DBUtil(){
		
	}
	public static Connection getConnection(){
		return conn;
	}
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		   Class.forName(DBDRIVER);
		   conn=DriverManager.getConnection(DBURL,DBUSER,DBPASSWORD);
		   //System.out.print(conn);
	}
	public void close(){
		if(conn!=null){
		   try{
			conn.close();
		   }catch(Exception e){}
		}
	}
}
