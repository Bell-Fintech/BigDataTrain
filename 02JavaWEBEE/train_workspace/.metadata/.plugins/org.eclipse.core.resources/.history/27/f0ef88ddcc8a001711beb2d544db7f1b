<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE html>
<html>
  <head>
    <title>add.jsp</title>
	
    <meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
    <meta http-equiv="description" content="this is my page">
    <meta http-equiv="content-type" content="text/html; charset=UTF-8">
    
    <!--<link rel="stylesheet" type="text/css" href="./styles.css">-->

  </head>
  
  <body>
    <form action="equipment" method="post">
    	<table width="80%" align="center">
    	      <tr >
    	          <td colspan="2"><h3>添加实验设备</h3></td>
    	      </tr>
    	      <tr>
    	      		<td>设备编号<input type="hidden" name="op" value="add"></td>
    	      		<td><input type="text" name="id"></td>
    	      </tr>
    	      <tr>
    	      		<td>设备名称</td>
    	      		<td><input type="text" name="equipmentName"></td>
    	      </tr>
    	      <tr>
    	      		<td>领用人</td>
    	      		<td><input type="text" name="person"></td>
    	      </tr>
    	      <tr>
    	      		<td>类型</td>
    	      		<td>
    	      			<select name="equipmentTypeId">
    	      				<c:forEach items="${typelist }" var="bean">
    	      					<option value="${bean.id }">${bean.type }</option>
    	      				</c:forEach>
    	      			</select>
                    </td>
    	      </tr>
    	      
    	      <tr>
    	      		<td>设备状态</td>
    	      		<td>
    	      		    <select name="equipmentStatusId">
    	      				<c:forEach items="${statuslist }" var="bean">
    	      					<option value="${bean.id }">${bean.value }</option>
    	      				</c:forEach>
    	      			</select>
    	      		</td>
    	      </tr>
    	      <tr>
    	      		<td>是否报废</td>
    	      		<td>
    	      		    <select name="isScrapId">
    	      				<c:forEach items="${slist }" var="bean">
    	      					<option value="${bean.id }">${bean.value }</option>
    	      				</c:forEach>
    	      			</select>
    	      		</td>
    	      </tr>
    	      <tr>
    	      		
    	      		<td colspan="2" align="center"><input type="submit" value="提交"></td>
    	      </tr>
    	</table>
    </form>
  </body>
</html>
