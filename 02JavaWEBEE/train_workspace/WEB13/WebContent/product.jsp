<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="/com.edu360/GetAllProducts">
<input type="submit" value="查询所有的商品">
</form>
<form action="/com.edu360/DeleteProducts" method="post">
<table border="1" width="500px" cellspacing="0">
<tr>
 <th>选择</th>
 <th>商品名称</th>
 <th>商品价格</th>
 <th>商品类别</th>
 <th>商品数量</th>
 <th>商品描述</th>
</tr>

<c:forEach items="${plist }" var="product">
<tr>
<td><input type="checkbox" name="ids" value="${product.id }"></td>
<td>${product.name }</td>
<td>${product.price }</td>
<td>${product.category }</td>
<td>${product.pnum }</td>
<td>${product.description }</td>
</tr>
</c:forEach>
</table>
<input type="submit" value="删除选中商品">
</form>
<script type="text/javascript">




</script>


</body>
</html>