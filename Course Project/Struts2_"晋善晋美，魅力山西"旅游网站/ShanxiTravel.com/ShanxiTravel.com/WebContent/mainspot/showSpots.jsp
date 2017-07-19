<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>显示景点信息</title>
</head>
<body>
<table border="1">
    <caption>景点信息</caption>
	<tr>
	     <td>景点Id</td>
		<td>景点名称</td>
		<td>门票价</td>
		<td>所属类型</td>
		<td>主要简介</td>
		<td>路线图</td>
		<td>所属图片编号</td>
		<td>操作1</td>
		<td>操作2</td>
		<td>操作3</td>
		<td>操作4</td>
	</tr>
	<s:iterator value="SpotList" var="sl"  status="t">
		<tr<s:if test="#t.odd">style="background-color:yellow"</s:if>>
		<td><s:property value="#sl.id"/></td>
		<td><s:property value="#sl.name"/></td>
		<td><s:property value="#sl.price"/></td>
		 <td><s:property value="#sl.city"/></td>
        <td><s:property value="#sl.type"/></td>
		<td><s:property value="#sl.editorial"/></td>
		<td><s:property value="#sl.route"/></td>
		<td><a href="../mainspot/updateSpot.jsp?spotId=<s:property value="#sl.id" />&spotName=<s:property value="#sl.name" />&spotCity=<s:property value="#sl.city" />&spotType=<s:property value="#sl.type" />&spotPrice=<s:property value="#sl.price" />&spotEditorial=<s:property value="#sl.editorial" />&spotRoute=<s:property value="#sl.route" />">修改</a></td>
		<td><a href=" ${pageContext.request.contextPath}/deleteSpotAction?spotId=<s:property value="#sl.id" />" onClick="return confirm('确定要删除吗？');">删除</a></td>
	    <td><a href="main.jsp">预定</a></td>
	    <td><a href="main.jsp">返回</a></td>
	</tr>
	</s:iterator>
</table>
</body>
</html>