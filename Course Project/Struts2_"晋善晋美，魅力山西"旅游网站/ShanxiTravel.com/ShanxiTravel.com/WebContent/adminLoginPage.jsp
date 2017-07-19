<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>后台管理员页面</title>
<style>
	#main{
		margin:0 auto;
		text-align:center;
		width:1226px;
		height:800px;
		}
	#left{
		width:226px;
		height:800px;
		float:left;
		background-color:rgb(255,255,255);
		}
	#right{
		width:1000px;
		height:800px;
		float:right;
		background-color:rgb(245,255,255);
</style>
</head>
<body>
	<div><%@ include file="header.jsp" %></div>
	<div id="main">
		<div id="left">
		<center>
			<ul>
			    <!--  <li><font size="5">欢迎${sessionScope.loginType}${sessionScope.loginUser}登录;</font></li>-->
				<li><a href="mainspot/101.jsp" target="rightFrame"><font size="5">景点信息管理</font></a><br><br><br>
				<li><a href="mainspot/102.jsp" target="rightFrame"><font size="5">城市分类管理</font></a><br><br><br>
				<li><a href="mainspot/103.jsp" target="rightFrame"><font size="5">山水分类管理</font></a><br><br><br>
				<li><a href="mainspot/104.jsp" target="rightFrame"><font size="5">旅游路线管理</font></a><br><br><br>
				<li><a href="comment/105.jsp" target="rightFrame"><font size="5">用户评价管理</font></a><br><br><br>
				<li><a href="usermanager/106.jsp" target="rightFrame"><font size="5">用户信息管理</font></a><br><br><br>
			    <li><a href="main.jsp" ><font size="5">返回首页</font></a><br><br><br>
			</ul>
		</center>		
		</div>
		<div id="right" style="text-align:center;vertical-align:center;height:800px">
			<iframe style="height:100%;width:100%; MARGIN-top:1px;" frameborder="1" scrolling="no" name="rightFrame"></iframe>       
		</div>
		<div><%@ include file="footer.jsp" %></div>
	</div>
</body>
</html>