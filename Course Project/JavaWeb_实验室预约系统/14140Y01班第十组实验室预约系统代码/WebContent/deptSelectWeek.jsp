<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
     <%@ page import="java.sql.*" %>
 <%@page import="nuc.sw.servlet.ShowDayInfoServlet" %>
  <%@ page   import="java.util.*" %>
  <%@ page import="nuc.sw.bean.Member" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>按周查找</title>
</head>
<body>
<%@include file="head.jsp" %>
<div id="one">
   <jsp:useBean id="m"  class="nuc.sw.bean.Member"></jsp:useBean>
   <jsp:useBean id="mDao"  class="nuc.sw.dao.MemberDao"></jsp:useBean>
    <% 
    List<Member> mlist=new ArrayList<Member>();
    mlist=mDao.findAllWeek(request.getParameter("week"));
	//用表格显示查看的数据
	 %>
	 <br/>
	 <br>
	 <br>
	 <br>
	 <br>
	 <br>
	 
	<center>
 <table border="1" width="1000" height="300" align="center">
   <tr>
     <td>本实验室管理员姓名</td>
     <td>本实验室管理员密码</td>
     <td>实验室所属院名</td>
     <td>实验室名称</td>
     <td>预约周数</td>
      <td>预约星期几</td>
       <td>预约节次</td>
     <td>本实验室当前可预约人数</td>
   </tr>
   <% 
   //System.out.println(mlist.size());
   for(int i=0;i<mlist.size();i++){
	 m=mlist.get(i);
	 %>
      <tr>
     <td align="center"><%=m.getUsername()%></td>
     <td align="center"><%=m.getPassword()%></td>
     <td align="center"><%=m.getDept()%></td>
     <td align="center"><%=m.getName()%></td>
     <td align="center"><%=m.getWeek()%></td>
     <td align="center"><%=m.getDay()%></td>
     <td align="center"><%=m.getTime()%></td>
     <td align="center"><%=50-mlist.size()%></td>
   </tr>
      <%
      }
    %>
      </table>
      </center>
      </div>
      <%@include file="foot.jsp" %>
</body>
</html>