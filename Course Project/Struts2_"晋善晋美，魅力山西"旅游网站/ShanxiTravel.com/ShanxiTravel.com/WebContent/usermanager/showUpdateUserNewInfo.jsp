<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>  
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>景点信息</title>
</head>
<body>
<%
  String username=request.getParameter("username");
  username=new String(username.getBytes("ISO-8859-1"),"utf-8");
  String password=request.getParameter("password");
  password=new String(password.getBytes("ISO-8859-1"),"utf-8");
  String surepass=request.getParameter("surepass");
  surepass=new String(surepass.getBytes("ISO-8859-1"),"utf-8");
  String phone=request.getParameter("phone");
  phone=new String(surepass.getBytes("ISO-8859-1"),"utf-8");
  String email=request.getParameter("email");
  email=new String(surepass.getBytes("ISO-8859-1"),"utf-8");
%>
  <table align="center" border="1">
 		<caption>用户信息</caption>
	<tr>
		<td>用户名</td>
		<td>密码</td>
		<td>所属类型</td>
		<td>电话</td>
		<td>邮箱</td>
		<td>操作1</td>
		<td>操作2</td>
	</tr>
 	  <!--  #session.Book   Book  -->
     <s:iterator value="#session.u"  var="sl">
		<tr>
		<td><s:property value="#sl.name"/></td>
		<td><s:property value="#sl.password"/></td>
		<td><s:property value="#sl.type"/></td>
		<td><s:property value="#sl.phone"/></td>
		<td><s:property value="#sl.email"/></td>
		<td><a href=" ../usermanager/updateUser.jsp?username=<s:property value="#sl.username" />&password=<s:property value="#sl.password" />&surepass=<s:property value="#sl.surepass" />&type=<s:property value="#sl.type" />&phone=<s:property value="#sl.phone" />&email=<s:property value="#sl.email" />">修改</a></td>
		<td><a href=" ${pageContext.request.contextPath}/deleteUserAction?username=<s:property value="#sl.uesrname" />" onClick="return confirm('确定要删除吗？');">删除</a></td>
	</tr>
	</s:iterator>
  </table>
  <br>
 
  <s:debug/>
</body>
</html>