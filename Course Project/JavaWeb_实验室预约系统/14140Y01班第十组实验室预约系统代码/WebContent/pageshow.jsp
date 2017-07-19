<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
  <%@ page import="java.sql.*,java.util.*,nuc.sw.dao.MemberDao,nuc.sw.bean.Member" %> 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>分页显示</title>
</head>
<body>
<%@include file="head.jsp" %>
<div id="one">
<br>
<br>
<br>
<br>
<br>
<br>
<table align="center" width="500" border="1" cellspacing="0">
<tr>
<td align="center" colspan="6">
  <h2>所有预约信息</h2>
</td></tr>
<tr align="center">
        	    <td><font size="2" color="black">用户名</font></td> 
        	    <td><font size="2" color="black">密码</font></td>
        	    <td><font size="2" color="black">学院</font></td>
        	    <td><font size="2" color="black">名称</font></td>
        	    <td><font size="2" color="black">周</font></td>
        	    <td><font size="2" color="black">星期</font></td>
        	    <td><font size="2" color="black">时间</font></td>
        	    <td><font size="2" color="black">人数</font></td>
 </tr>
<%
    List<Member> list= (List<Member>)request.getAttribute("list");
    for(Member m:list){
%>
<tr>
<td><font size="2"><%=m.getUsername()%></font></td>
<td><font size="2"><%=m.getPassword()%></font></td>
<td><font size="2"><%=m.getDept()%></font></td>
<td><font size="2"><%=m.getName()%></font></td>
<td><font size="2"><%=m.getWeek()%></font></td>
<td><font size="2"><%=m.getDay()%></font></td>
<td><font size="2"><%=m.getTime()%></font></td>
<td><font size="2"><%=m.getSbook()%></font></td>
</tr>
<%   
 }
%>
<tr>
  <td align="center"colspan="6">
  <%=request.getAttribute("bar")%>
  </td>
  </tr>
  </table>
  </div>
  <%@include file="foot.jsp" %>
</body>
</html>