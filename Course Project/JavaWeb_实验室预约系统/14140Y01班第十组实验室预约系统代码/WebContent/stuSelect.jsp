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
<title>按学院预约</title>
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
    <% 
    List<manager> mlist=new ArrayList<manager>();
    mlist=mDao.findAll(request.getParameter("dept"));
	//用表格显示查看的数据
	 %>
	 <br/>
	<center>
 <table border="1" width="800" height="300" align="center">
 <tr>
     <td align="center"><h2>本实验室管理员姓名</h2></td>
     <td align="center"><h2>实验室所属院名</h2></td>
     <td align="center"><h2>实验室名称</h2></td>
     <td align="center"><h2>本实验室总人数</h2></td>
     <td align="center"><h2>本实验室当前可预约人数</h2></td>
       <td align="center"><h2>本实验预约人数</h2></td>
     <td align="center"><h2>预约</h2></td>
   </tr>
   <% 
   //System.out.println(mlist.size());
   for(int i=0;i<mlist.size();i++){
	 m=mlist.get(i);
	 %>
      <tr>
     <td align="center"><%=m.getUsername()%></td>
     <td align="center"><%=m.getDept()%></td>
     <td align="center"><%=m.getName()%></td>
     <td align="center"><%=m.getScount()%></td>
     <td align="center"><%=m.getScount()%></td>
      <td align="center"><%=mlist.size()%></td>
      <td align="center"><a href="book.jsp"id="" style="font-size:12px!important;;font-weight:12px!important;;">点击预约</a></td>
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