<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
</head>
<body>
<form action="${pageContext.request.contextPath}/SpotActionType"  method="post">
  <table align="center" border="1"> 
    <caption>山水类查询信息</caption>
	<tr>
		   <td>所属分类</td>
		  <td><input type="checkbox" name="spotType" value="山" checked>山&nbsp;
		       <input type="checkbox" name="spotType" value="水" >水&nbsp;
		         <input type="checkbox" name="spotType" value="冰" >冰
		   </td>
		</tr>
  <tr>
  <tr>
    <td><input type="submit" value="查找"></td>
  </tr>
</table>
</form>
</body>
</html>