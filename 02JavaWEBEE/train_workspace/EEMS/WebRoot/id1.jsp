<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'id1.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
	
  </head>
  
  <body>
        <%
        	request.setCharacterEncoding("utf-8");
        	String errormessage = (String) request.getAttribute("errormessage");
        	if (errormessage == null) {
        		errormessage = "";
        	}
        %>
        <h3>请输入设备编号</h3>
    <form action="equipment?op=getByIdSingle"  method="post">
          <input type="text" name="id" id="a" placeholder="请输入整数">
          <input type="submit" value="查询" ><%=errormessage %>
    </form>
  </body>
</html>