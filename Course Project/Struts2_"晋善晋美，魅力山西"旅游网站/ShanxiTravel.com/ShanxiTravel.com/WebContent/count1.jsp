<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
  <%@page import="com.ShanxiTravel.dbc.DBUtil,java.sql.Connection,java.sql.PreparedStatement,java.sql.ResultSet,com.ShanxiTravel.entity.count,java.util.ArrayList,java.util.List" %>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
Connection conn=null;
PreparedStatement ps=null;
ResultSet rs=null;
count c=new count();
conn=DBUtil.getConnection();
String sql="select * from count";
ps=conn.prepareStatement(sql);
//ps.setName(1,五台山--中国最早，时间最大佛教道场);
rs=ps.executeQuery();
if(rs.next()){
	c=new count();
	c.setSpotName(rs.getString(2));
	c.setaHitCount(rs.getInt(1)+1);
	out.print(c.getaHitCount());
}
%>
		
</body>
</html>