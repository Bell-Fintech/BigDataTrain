<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>  
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>景点信息</title>
</head>
<body>
  删除一条评论信息成功，显示剩余评论信息！
  <table align="center" border="1">
 		<caption>评论信息</caption>
	<tr>
		<td>评论Id</td>
	     <td>景点Id</td>
		<td>景点评论</td>
		<td>操作1</td>
		<td>操作2</td>
	</tr>
 	  <!--  #session.Book   Book  -->
     <s:iterator value="#session.Comment"  var="sl">
	<tr <s:if test="#st.odd">style="background-color:#ff0000"</s:if>>
		<td><s:property value="#sl.id"/></td>
		<td><s:property value="#sl.mainspotId"/></td>
		<td><s:property value="#sl.content"/></td>
		<td><a href=" ${pageContext.request.contextPath}/deleteCommentAction?id=<s:property value="#sl.id" />" onClick="return confirm('确定要删除吗？');">删除</a></td>
	    <td><a href="main.jsp">返回</a></td></tr>
	</s:iterator>
  </table>
  <br>
 
  <s:debug/>
</body>
</html>