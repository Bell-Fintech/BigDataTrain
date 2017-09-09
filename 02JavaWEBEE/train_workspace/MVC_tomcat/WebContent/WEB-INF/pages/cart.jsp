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
<script>
function check(obj){
	var checkboxs=document.getElementsByName("ids");
	for(var i=0;i<checkboxs.length;i++){
		  checkboxs[i].checked=obj.checked;
	}
	
}

function sub(){
	var checkboxs=document.getElementsByName("ids");
	var postId=document.getElementById("post").value;
	var ids="";
	for(var i=0;i<checkboxs.length;i++){
		  if(checkboxs[i].checked==true){
			  var id=checkboxs[i].value;
			  ids+=id+",";
		  }
	}
	if(ids==""){
	  alert("至少得选择一件商品");
	}else{
		 $.ajax({
			    type : "post",
				url :"${path}/addOrders.shtml",
				data:{id:ids,post:postId},	
				success : function(data) {
					if(data==1){
						window.location.href="${path}/ordersList.shtml";
					}
				}
				
			});
	}
	
	
}

</script>

</head>

<body>
	<center>
		<h3>我的购物车</h3>
		<h4><a href="${path}/itemsList.shtml">返回商品列表</a></h4>
		<table border="1" width="800">
			<tr style="width:800px;height:100px">
				<td>商品编号<input type="checkbox" onclick="check(this)"/></td>
				<td>商品名称</td>
				<td>商品价格</td>
				<td>编辑</td>
			</tr>
			<!-- 循环遍历数据 -->
			<c:forEach items="${itemsList}" var="items">
				<tr style="width:800px;height:100px">
					<td>${items.itemsId} <input type="checkbox" name="ids" class="ids" value="${items.itemsId}"></td>
					<td>${items.itemsName}</td>
					<td>${items.price}</td>
						
					<td><a href="${path}/delCart.shtml?id=${items.itemsId}">删除</a></td>


				</tr>
			</c:forEach>
		</table>
		 <p>请选择收货人:<select id="post">
		  <c:forEach items="${postList}" var="post">
		  <option value="${post.id}">${post.postName}</option>
		  </c:forEach>
		 </select></p>
         <p><button onclick="sub()">付款</button></p>

	</center>
</body>
</html>
