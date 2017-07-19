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
	 <br>
 <table border="1" width="1000" height="300" align="center">
   <tr>
     <td align="center"><h2>操作1</h2></td>
     <td align="center"><h2>操作2</h2></td>
     <td align="center"><h2>操作3</h2></td>
     <td align="center"><h2>操作4</h2></td>
     <td align="center"><h2>操作5</h2></td>
     <td align="center"><h2>操作6</h2></td>
   </tr>
   <tr>
     <td align="center"><a href="register.jsp"id="" style="font-size:12px!important;;font-weight:12px!important;;">注册实验室信息</a></td> 
     <td align="center"><a href="ShowInfoServlet"id="" style="font-size:12px!important;;font-weight:12px!important;;">查看注册信息</a></td>
     <td align="center"><a href="userAllShowPage.jsp"id="" style="font-size:12px!important;;font-weight:12px!important;;">查看全部信息</a></td>
     <td align="center"><a href="updateInfoPage.jsp"id="" style="font-size:12px!important;;font-weight:12px!important;;">修改信息</a></td>
     <td align="center"><a href="DeleteInfoServlet"  onclick="return confirm('你确定要删除吗？')"id="" style="font-size:12px!important;;font-weight:12px!important;;">删除信息</a></td>
     <td align="center"><a href="SelectSort.jsp"id="" style="font-size:12px!important;;font-weight:12px!important;;">点击预约</a></td> 
   </tr>
      </table>
      </center>
      </div>
      <%@include file="foot.jsp" %>
</body>
</html>