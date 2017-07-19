<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<style>
body{
		a:link,a:visited{
			text-decoration:none;  /*超链接无下划线*/ 
			}
		}
</style>
</head>
<body>

		<div id="left">
		<h3>景点信息管理：</h3>
		  <a href="../mainspot/addSpot.jsp" target="rightFrame"><font size="3">添加一个景点信息</font></a><br><br>
		  <a href="SpotActionAll" target="rightFrame"><font size="3">显示所有景点信息</font></a><br><br>
		  <a href="SpotActionAll" target="rightFrame"><font size="3">修改景点信息</font></a><br><br>
		  <a href="SpotActionAll" target="rightFrame"><font size="3">删除景点信息</font></a><br><br>
		  <a href="../mainspot/findSpotPartName.jsp" target="rightFrame"><font size="3">模糊查询景点信息</font></a><br><br>
		  <a href="../mainspot/findSpotType.jsp" target="rightFrame"><font size="3">山水类查询用户信息</font></a><br><br>
		  <a href="../mainspot/findSpotCity.jsp" target="rightFrame"><font size="3">地域类查询用户信息</font></a>
		</div>
</body>
</html>