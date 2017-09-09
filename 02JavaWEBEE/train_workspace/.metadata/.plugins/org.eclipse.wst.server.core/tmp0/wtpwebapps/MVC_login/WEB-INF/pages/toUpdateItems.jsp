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
<title>Insert title here</title>
</head>
<body>
	<center>
		<h3>编辑商品</h3>
		<form action="${path}/updateItems.shtml" method="post">
		<table border="1" width="800">
			<tr style="width: 800px; height: 100px">
			<input type="hidden" name="itemsId" value="${items.itemsId}"/>
				<td>商品名称<input type="text" value="${items.itemsName}" name="itemsName" readonly/></td>
			</tr>
			<tr>
				<td>商品价格<input type="text" value="${items.price}" name="price"/></td>
							</tr>
				<tr>
				<td><input type="submit" value="确认修改"/></td>
			</tr>
			
		</table>
		</form>
	</center>
</body>
</html>