<%@ page language="Java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<%
	String path = request.getContextPath();
	pageContext.setAttribute("path", path);
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>添加商品</title>
</head>
<body>
	<center>
		<h3>添加商品</h3>
		<form method="post" action="${path}/addItems.shtml" enctype="multipart/form-data">
		<table>
		<tr><td>商品名称</td><td><input type="text" name="itemsName"/></td></tr>
		<tr><td>商品价格</td><td><input type="text" name="price"/></td></tr>
		<tr><td>上传图片</td><td><input type="file" name="file"/></td></tr>
		<tr><td colspan="2"><input type="submit" value="保存"/></td></tr>
		</table>
		</form>
	</center>
</body>
</html>