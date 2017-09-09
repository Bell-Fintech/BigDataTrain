<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
pageContext.setAttribute("path", path);
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
  </head>
  
  <body>
  <center> 欢迎${user.username}访问 <br>
  <a href="${path}/itemsList.shtml">商品管理</a>   <a href="${path}/ordersList.shtml">订单管理</a>
  <a href="${path}/cart.shtml">我的购物车</a>
  </center>
   
  </body>
</html>
