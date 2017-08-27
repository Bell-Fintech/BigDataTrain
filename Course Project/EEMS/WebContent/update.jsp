<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE html>
<html>
  <head>
    <title>update</title>
	
    <meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
    <meta http-equiv="description" content="this is my page">
    <meta http-equiv="content-type" content="text/html; charset=UTF-8">
    
    <!--<link rel="stylesheet" type="text/css" href="./styles.css">-->

  </head>
  
  <body>
    <form action="equipment" method="get">
    	<table width="80%" align="center">
    	      <tr >
    	          <td colspan="2"><h3>修改</h3></td>
    	      </tr>
    	      <tr>
    	      		<td>设备编号<input type="hidden" name="op" value="update"></td>
    	      		<td><input type="text" name="id" value="${equipment.equipmentNo }" disabled>
    	      		    <input type="hidden" name="id1" value="${equipment.equipmentNo }">
    	      		</td>
    	      </tr>
    	      <tr>
    	      		<td>设备名称</td>
    	      		<td><input type="text" name="equipmentName" value="${equipment.equipmentName }"></td>
    	      </tr>
    	      <tr>
    	      		<td>领用人</td>
    	      		<td><input type="text" name="person" value="${equipment.person }"></td>
    	      </tr>
    	      <tr>
    	      		<td>设备类型</td>
    	      		<td>
    	      			<select name="equipmentTypeId">
    	      				<c:forEach items="${typelist }" var="bean">
    	      			    <%-- <c:if test="${bean.id==book.categoryId }">
    	      					<option value="${bean.id }" selected>${bean.name }</option>
    	      				</c:if>
    	      				<c:if test="${bean.id!=book.categoryId}">
    	      					<option value="${bean.id }">${bean.name }</option>
    	      				</c:if>
    	      				 --%>
    	      				<option value="${bean.id }" <c:if test="${bean.id==equipment.equipmentTypeId }">selected</c:if> >${bean.type }</option> 
    	      				</c:forEach>
    	      			</select>
                    </td>
    	      </tr>
    	      <tr>
    	      		<td>设备状态</td>
    	      		<td>
    	      		  <select name="equipmentStatusId">
    	      				<c:forEach items="${statuslist }" var="bean">
    	      				<option value="${bean.id }" <c:if test="${bean.id==equipment.equipmentStatusId }">selected</c:if> >${bean.value }</option> 
    	      				</c:forEach>
    	      		  </select>
    	      		</td>
    	      </tr>
    	      <tr>
    	      		<td>是否报废</td>
    	      		<td>
    	      		   <select name="isScrapId">
    	      			<c:forEach items="${slist }" var="bean">
							<option value="${bean.id }"<c:if test="${bean.id==equipment.isScrapId }">selected</c:if>>
								${bean.value }
							</option>
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
