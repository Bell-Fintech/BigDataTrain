<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>删除书籍信息</title>
  <script type="text/javascript">
	function load(){
		document.all.form1.submit();
	}
  </script>
</head>
<body  onload="load()">

	<% 
	   String spotId=request.getParameter("spotId"); 
	   spotId=new String(spotId.getBytes("ISO-8859-1"),"utf-8");
	%>
	<form name="form1"  action="${pageContext.request.contextPath}/deleteSpotAction"   method="post">
		<input type="text" name="spotId" />
		<input type="submit" value="删除"/>
	</form>
</body>
</html>