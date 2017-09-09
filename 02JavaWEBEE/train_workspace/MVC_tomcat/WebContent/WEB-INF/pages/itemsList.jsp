<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%
	String path = request.getContextPath();
	pageContext.setAttribute("path", path);
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>


</head>

<body>
	<center>
		<h3>商品管理</h3>
		<h4><a href="${path}/toAddItems.shtml">添加商品</a></h4>
		<form method="post" action="${path}/itemsList.shtml">
			商品名称:<input type="text" name="itemsName" value="${vo.itemsName}">最低价:<input
				type="text" name="minPrice" value="${vo.minPrice}"> 最高价:<input
				name="maxPrice" value="${vo.maxPrice}"> <input type="submit"
				value="搜索" />
		</form>
		<table border="1" width="800">
			<tr style="width:800px;height:100px">
				<td>商品编号</td>
				<td>商品名称</td>
				<td>商品价格</td>
				<td>商品图片</td>
				<td>购物车</td>
				<td>修改</td>
			</tr>
			<!-- 循环遍历数据 -->
			<c:forEach items="${itemsList}" var="items">
				<tr style="width:800px;height:100px">
					<td>${items.itemsId}</td>
					<td>${items.itemsName}</td>
					<td>${items.price}</td>
					<td><img src="${items.url}" style="width:100px;height:100px"/></td>	
					<td><a href="${path}/addCart.shtml?id=${items.itemsId}">添加进购物车</a></td>
                     <td><a href="${path}/toUpdateItems.shtml?id=${items.itemsId}">编辑商品</a></td>

				</tr>
			</c:forEach>
		</table>


	</center>
</body>
</html>
