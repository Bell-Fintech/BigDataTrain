<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@ page import="java.sql.*" %>
 <%@page import="nuc.sw.servlet.ShowInfoServlet" %>
  <%@ page   import="java.util.*" %>
  <%@ page import="nuc.sw.bean.manager" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>实验室信息操作</title>
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
   <jsp:useBean id="m"  class="nuc.sw.bean.manager"></jsp:useBean>
   <jsp:useBean id="mDao"  class="nuc.sw.dao.ManagerDao"></jsp:useBean>
	 <center>
 <table border="1" width="1000" height="300"align="center">
   <tr>
     <td align="center"><h2>本实验室管理员姓名</h2></td>
     <td align="center"><h2>管理员密码</h2></td>
     <td align="center"><h2>实验室所属院名</h2></td>
     <td align="center"><h2>实验室名称</h2></td>
     <td align="center"><h2>本实验室总人数</h2></td>
     <td align="center"><h2>其他操作</h2></td>
   </tr>
      <tr>
      <td>${requestScope.username}</td>
     <td>${requestScope.password}</td>
     <td>${requestScope.dept}</td>
     <td>${requestScope.name}</td>
     <td>${requestScope.scount}</td>
     <td align="center"><a href="manShowPage.jsp"id="" style="font-size:12px!important;;font-weight:12px!important;;">返回</a></td>
   </tr>
      </table>
      </center>
      </div>
      <%@include file="foot.jsp" %>
</body>
</html>