<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
	<c:forEach items="${list }" var="product">
		<div
			style="float: left; width: 12%; margin: 10px; text-align: center;">
			<img src="./image/${product.id}.jpg" width="100%" /> <a href="/com.lol/DetailServlet?id=${product.id}">${product.name}</a><br />
			<a href="#"><font color="#FF0000">惊爆价：${product.price}</font></a>
		</div>
	</c:forEach>
