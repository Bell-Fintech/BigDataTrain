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
		<h3>订单管理</h3>
		<form method="post" action="${path}/ordersList.shtml">
			订单号:<input type="text" name="ordersId" value="${vo.ordersId}">商品名称:<input
				type="text" name="itemsName" value="${vo.itemsName}"> 商品价格:<input
				name="price" value="${vo.price}"> <input type="submit"
				value="搜索" />
		</form>
		<table border="1" width="800">
			<tr style="width:800px;height:100px">
				<td>订单编号</td>
				<td>商品件数</td>
				<td>状态</td>
				<td>商品明细</td>
				<td>收货人</td>
			</tr>
			<!-- 循环遍历数据 -->
			<c:forEach items="${ordersList}" var="orders">
				<tr style="width:800px;height:100px">
					<td>${orders.ordersId}</td>
					<td>${orders.count}</td>
					<td><c:if test="${orders.status==0}">
							<span style="color:red">未支付</span>
						</c:if> <c:if test="${orders.status==1}">
							<span style="color:green">已支付</span>
						</c:if></td>
					<td>
						<table>
							<c:forEach var="items" items="${orders.itemss}">
								<tr>
									<td>${items.itemsName}</td>
									<td>${items.price}</td>
								</tr>
							</c:forEach>
						</table>
					</td>

					<td>${orders.post.postName}</td>


				</tr>
			</c:forEach>
		</table>


	</center>
</body>
</html>
