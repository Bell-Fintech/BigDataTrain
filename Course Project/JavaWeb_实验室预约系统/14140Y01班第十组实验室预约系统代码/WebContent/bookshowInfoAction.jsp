<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
     <%@ page import="java.sql.*" %>
     <%@ page import="java.lang.*" %>
     <%@ page import="nuc.sw.dao.ManagerDao" %>
    <%@ page import="nuc.sw.bean.manager" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>显示预约信息</title>
</head>
<body>
<%@include file="head.jsp" %>
<div id="one">
 <jsp:useBean id="m"   scope="session"  class="nuc.sw.bean.Member"></jsp:useBean>
 <jsp:useBean id="mDao"   scope="session"  class="nuc.sw.dao.MemberDao"></jsp:useBean>
        	 <br>
        	 <br>
        	 <br>
        	 <br>
        	 <table border="1" align="center"  width="1000" height="300">
        	 <tr align="center">
        	 
        	   <td>本实验室管理员姓名</td>
     <td>本实验室管理员密码</td>
     <td>实验室所属院名</td>
     <td>实验室名称</td>
     <td>预约周数</td>
      <td>预约星期几</td>
       <td>预约节次</td>
     <td>本实验室当前可预约人数</td>
         <td align="center">其他操作</td>
             </tr>
             <tr align="center">
              <td><span>${requestScope.username}</span></td>
        	  <td><span>${requestScope.password}</span></td> 
        	  <td><span>${requestScope.dept}</span></td>
        	 
        	  <td><span>${requestScope.name}</span></td>
        	    <td><span>${requestScope.week}</span></td>
        	      <td><span>${requestScope.day}</span></td>
        	   <td><span>${requestScope.time}</span></td>
        	  <td><span>${requestScope.sbook}</span></td>
        	   <td><a href="userLoginPage.jsp"id="" style="font-size:12px!important;;font-weight:12px!important;;">返回</a></td>
             </tr>
             </table>
             </div>
             <%@include file="foot.jsp" %>
</body>
</html>