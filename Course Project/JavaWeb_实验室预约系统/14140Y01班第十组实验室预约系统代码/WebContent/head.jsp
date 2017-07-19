<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>head</title>
<style>
 a{ font-size:9px;
    color:red;}
 </style>
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
<link rel="stylesheet" type="text/css" href="css/layout.css">
</head>
<body>

			   <div id="header">
						<div id="logo">
			            </div>
						<div id="banner"> <CENTER><FONT face=隶书  size=20>
<MARQUEE direction=up behavior=alternate width=60 height=120>实</MARQUEE><FONT color=yellow>
<MARQUEE direction=up behavior=alternate width=60 height=80>验</MARQUEE><FONT color=brown>
<MARQUEE direction=up behavior=alternate width=60 height=120>室</MARQUEE><FONT color=green>
<MARQUEE direction=up behavior=alternate width=60 height=80>预</MARQUEE><FONT color=orange>
<MARQUEE direction=up behavior=alternate width=60 height=120>约</MARQUEE><FONT color=yellow>
<MARQUEE direction=up behavior=alternate width=60 height=80>系</MARQUEE><FONT color=orange>
<MARQUEE direction=up behavior=alternate width=60 height=80>统</MARQUEE><FONT color=orange>
</FONT></FONT></FONT></FONT></FONT></FONT></FONT></FONT></CENTER>
</div>
                         <div id="menu">
								<ul >
						          <li><a id="" href="" style="font-size:12px!important;;font-weight:12px!important;;">首页</a></li>
								  <li class="tiao"></li>
								  <li><a id="" href="" style="font-size:12px!important;;font-weight:12px!important;;">实验室概况</a></li>
								  <li class="tiao"></li>
								  <li><a id="" href="" style="font-size:12px!important;;font-weight:12px!important;;">实验室分布情况</a></li>
								  <li class="tiao"></li>
								  <li><a id="" href="" style="font-size:12px!important;;font-weight:12px!important;;">实验室发展历程</a></li>
								  <li class="tiao"></li>
								  <li><a id="" href="login.jsp" style="font-size:12px!important;;font-weight:12px!important;;">登录</a></li>
 &nbsp;当前日期：<div id="linkweb" style=" display:inline;">
</div>
<script> 
setInterval("document.getElementById('linkweb').innerHTML=new Date().toLocaleString()+'星期'+'日一二三四五六'.charAt(new Date().getDay());",1000); 
</script>
                                  </ul>
                                  </div>   
                            </div>
			   
</body>
</html>