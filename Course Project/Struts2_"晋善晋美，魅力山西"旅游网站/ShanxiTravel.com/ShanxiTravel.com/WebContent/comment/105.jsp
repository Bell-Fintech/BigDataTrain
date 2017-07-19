<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<style>
	#left{
		width:300px;
		height:800px;
		float:left;
		background-color:rgb(245,255,255);
		}
		a{
		text-decoration:none;
		}
</style>
</head>
<body>
	<div id="left">
		<h3>用户评价管理：</h3>
		  <a href="../comment/addComment.jsp" target="rightFrame"><font size="3">添加评论信息</font></a><br><br>
		  <a href="CommentActionAll" target="rightFrame"><font size="3">显示所有评价信息</font></a><br><br>
		  <a href="CommentActionAll" target="rightFrame"><font size="3">删除用户评价信息</font></a><br><br>
		  <a href="../comment/findBySpotIdComments.jsp" target="rightFrame"><font size="3">查询景点评价</font></a>
		</div>
	
</body>
</html>