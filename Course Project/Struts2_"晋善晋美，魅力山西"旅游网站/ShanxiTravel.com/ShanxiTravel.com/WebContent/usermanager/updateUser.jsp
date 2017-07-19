<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>修改用户信息</title>
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
<form action="${pageContext.request.contextPath}/updateUserAction" method="post" >
<table align="center" border="1">
  <caption>修改用户信息</caption>
<tr>
    <td>用户名:</td>
    <td><input type="text" name="username"   value="<%=username%>"  readonly> </td>
  </tr>
  <tr>
    <td>密码:</td>
    <td><input type="text" name="password"  value="<%=password%>"> </td>
  </tr>
  <tr>
    <td>确认密码:</td>
    <td><input type="text" name="surepass"  value="<%=surepass%>"></td>
  </tr>
   <tr>
                	<td>用户类型：</td>
	                <td>
						<select name="type" >
									  <option  value="普通用户">普通用户</option>
           							  <option  value="管理员">管理员</option>
						</select>
					</td>
			</tr>
   <tr>
					<td>联系方式：</td>
					<td><input name="phone" type="text"  value="<%=phone%>"></td>
			</tr>
        <tr>
			<td>邮箱：</td>
	        <td><input name="email" type="text" value="<%=email%>"></td>
        </tr>
     <tr>
     <td><input type="submit" value="修改用户信息"></td>
  </tr>
  </table>
</form>
</body>
</html>