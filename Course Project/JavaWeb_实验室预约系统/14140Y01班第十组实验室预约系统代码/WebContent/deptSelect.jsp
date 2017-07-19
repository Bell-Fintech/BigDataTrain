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
 <jsp:useBean id="m"  class="nuc.sw.bean.manager"></jsp:useBean>
   <jsp:useBean id="mDao"  class="nuc.sw.dao.ManagerDao"></jsp:useBean>
	 <center>
	 <br>
	  <br>
	   <br>
	    <br>
	     <br>
 <table border="1" width="800" height="300"  align="center">
   <tr>
     <td align="center"><h2>操作1</h2></td>
     <td align="center"><h2>操作2</h2></td>
   </tr>
   <tr>
     <td align="center"><a href="FindServlet"  id="" style="font-size:12px!important;;font-weight:12px!important;;">点击查询一天</a></td>
     <td align="center"><a href="SelectWeek.jsp" id="" style="font-size:12px!important;;font-weight:12px!important;;">点击查询一周</a></td>  
   </tr>
      </table>
      </center>
      </div>
      
      <%@  include file="foot.jsp" %>
      </div>
</body>
</html>