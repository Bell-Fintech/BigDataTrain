<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@ page import="java.sql.*" %>  
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>实验室预约管理系统</title>
  
<style type="text/css">
<!--.STYLE1{
font-size:50px;
font-weight:bold;
color:blue;}-->
</style>
<link rel="stylesheet" type="text/css" href="css/layout.css"/>
</head>
<body>
<div id="one">
 <%request.setCharacterEncoding("utf-8"); %> 
 
<%@include file="head.jsp" %>
<%request.setCharacterEncoding("utf-8"); %> 
 <script type="text/javascript">
	function showTime()
	  { 
		 var now = new Date(); 
		 var nowTime = now.toLocaleString(); 
		 var date = nowTime.substring(0,10);//截取日期 
     	 var time = nowTime.substring(10,20); //截取时间 
		 var week = now.getDay(); //星期 
		 var hour = now.getHours(); //小时 
		  //判断星期几 
		  var weeks = ["日","一","二","三","四","五","六"]; 
		  var getWeek = "星期" + weeks[week]; 
		  var sc; 
		  //判断是AM or PM 
		  if(hour >= 0 && hour < 5){ 
		   sc = '凌晨'; 
		  } 
		  else if(hour > 5 && hour <= 7){ 
		   sc = '早上'; 
		  } 
		  else if(hour > 7 && hour <= 11){ 
		   sc = '上午'; 
		  } 
		  else if(hour > 11 && hour <= 13){ 
		   sc = '中午'; 
		  } 
		  else if(hour> 13 && hour <= 18){ 
		   sc = '下午'; 
		  } 
		  else if(hour > 18 && hour <= 23){ 
		   sc = '晚上'; 
		  } 
		  document.getElementById('time').innerHTML ="当前时间：" + date+" " + getWeek +" "+"   "+sc+"  "+time;
		  setTimeout('showTime()',1000); 
		} 
		</script>
		;当前日期：<div id="linkweb" style=" display:inline;">
</div>
<script> 
setInterval("document.getElementById('linkweb').innerHTML=new Date().toLocaleString()+'星期'+'日一二三四五六'.charAt(new Date().getDay());",1000); 
</script>
<div id="logo">
  <center>
  <span><font size="5" color="red">${requestScope.error}</font></span></center>
<form   name="form1" method="post" action="LoginServlet" >
<table width="1000" height="300" border="1" align="center">
<caption>
<span class="STYLE1">实验室预约系统</span>
</caption>

<tr>
<td width="200">用户名：</td>
<td width="400">
<input name="username" type="text"  id="username"></td></tr>
<tr>
<td width="200">密码：</td>
<td width="400"><input name="password" type="password" id="password">
</td>
</tr>
<tr>
<td width="200">登陆身份：</td>
<td width="400">
  <select name="type"  >
    <option value="学生">学生</option>
    <option value="院管理员" >院管理员</option>
    <option value="总管理员">总管理员</option>
    </select>
    
</td>
</tr>
<tr>
<td colspan="2" align="center">
<input type="submit" name="Submit" value="登录">

<input type="reset" name="Submit2" value="取消">
</td>
</tr>
</table>
</form>
</div>
<%@include file="foot.jsp" %>
</div>
</body>
</html>