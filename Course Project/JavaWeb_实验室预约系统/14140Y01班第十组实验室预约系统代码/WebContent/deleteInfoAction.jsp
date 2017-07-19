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
<title>删除信息</title>
</head>
<body>
<%@include file="head.jsp" %>
<div id="one">

   <jsp:useBean id="m"  class="nuc.sw.bean.manager"></jsp:useBean>
   <jsp:useBean id="mDao"  class="nuc.sw.dao.ManagerDao"></jsp:useBean>

   <%
     request.setCharacterEncoding("utf-8");
	  m=mDao.doDelete((String)session.getAttribute("username"));
      if(m==null)
    	  out.print("删除成功!");
      else
    	  out.print("删除失败!");
      
         
%>
</div>
<%@include file="foot.jsp" %>
</body>
</html>