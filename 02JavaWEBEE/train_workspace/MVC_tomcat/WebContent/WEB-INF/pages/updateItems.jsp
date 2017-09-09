<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%
	String path = request.getContextPath();
	pageContext.setAttribute("path", path);
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<script type="text/javascript" src="${path}/js/jquery.min.js"></script>


</head>

<body>
	<center>
		<h3>编辑商品</h3>
		<form method="post" action="${path}/updateItems.shtml">
		<table>
		<input type="hidden" name="itemsId" value="${items.itemsId}"/>
		<tr><td>商品名称</td><td><input type="text" value="${items.itemsName}" name="itemsName" readonly></td></tr>
		<tr><td>商品价格</td><td><input type="text" value="${items.price}" name="price"></td></tr>
		<tr><td colspan="2"><input type="submit" value="修改"/></td></tr>
		</table>
		
		</form>
	

	</center>
</body>
</html>
