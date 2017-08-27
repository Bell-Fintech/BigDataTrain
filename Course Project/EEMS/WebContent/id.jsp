<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'id.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
   
  </head>
  
  <body>
      <%
         request.setCharacterEncoding("utf-8");
         String NoReturn=(String)request.getAttribute("NoReturn");
         
      %>
    <br/>
    <center><marquee width="80%" direction="left" bgcolor="#ccc"><%=NoReturn %></marquee></center>
    <br/>
    <table width="80%" align="center">
      <tr>
      	<td>设备编号</td>
      	<td>设备名称</td>
      	<td>领用人</td>
      	<td>设备类型</td>
      	<td>设备状态</td>
      	<td>报废状态</td>
      	<td>操作</td>
      </tr>
<!-- 		${status.index} 输出行号，从0开始。 -->
<!-- 	    ${status.count} 输出行号，从1开始。 -->
<!-- 		${status.current} 当前这次迭代的（集合中的）项 -->
<!-- 	    ${status.first}判断当前项是否为集合中的第一项，返回值为true或false  -->
<!-- 	    ${status.last}判断当前项是否为集合中的最后一项，返回值为true或false -->
	 
       <tr>
      	<td>${equipment.equipmentNo }</td>
      	<td>${equipment.equipmentName }</td>
      	<td>${equipment.person }</td>
      	
      	<td>
      	  <c:forEach items="${typelist }" var="equipmentType" >
      		<c:if test="${equipmentType.id==equipment.equipmentTypeId }">
      		     ${equipmentType.type}
      		</c:if>
      	  </c:forEach>
      	</td>
      	
      	<td>
      	   <c:forEach items="${statuslist }" var="equipmentStatus" >
      		<c:if test="${equipmentStatus.id==equipment.equipmentStatusId }">
      		     ${equipmentStatus.value}
      		</c:if>
      	   </c:forEach>
      	</td>
      	<td>
      	  <c:forEach items="${slist }" var="isScrap" >
      		<c:if test="${isScrap.id==equipment.isScrapId }">
      		     ${isScrap.value}
      		</c:if>
      	  </c:forEach>
        </td>
      	<td>
      		<a href="equipment?op=getById&id=${equipment.equipmentNo }" <c:if test="${bean.isScrapId==2 }" >style="color:#ccc;" onclick="javascript:return false;"</c:if> >修改</a>
      		<a href="equipment?op=delete&id=${equipment.equipmentNo }">删除</a>
      	</td>
      </tr>
    </table>
  </body>
</html>
