<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>转账的页面</title>
</head>
<body>
<h1>转账的页面</h1>
	<form action="${pageContext.request.contextPath }/AccountServlet" method="post">
		<table border="1" width="400">
			<tr>
				<td>付款人:</td>
				<td><input type="text" name="from"/></td>
			</tr>
			<tr>
				<td>收款人:</td>
				<td><input type="text" name="to"/></td>
			</tr>
			<tr>
				<td>转账金额:</td>
				<td><input type="text" name="money"/></td>
			</tr>
			<tr>
				<td colspan="2"><input type="submit" value="转账"/></td>
			</tr>
		</table>
	</form>
</body>
</html>