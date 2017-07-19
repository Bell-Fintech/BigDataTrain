<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<style type="text/css">
#img{
	width:980px;
	height:300px;
	text-align:center;
	
}
</style>
</head>
<body>
  <%
    Integer hitsCount=(Integer)application.getAttribute("hitCounter8");
    if(hitsCount==null||hitsCount==0){
	    out.println("欢迎进入太行山页面");
	    hitsCount=1;
	%>
	    <p>当前页面访问量：<%=hitsCount %></p>
	<% 
   }
    else{
    	 out.println("欢迎再次进入太行山页面");
    	 hitsCount+=1;
   %>
       <p>当前页面访问量：<%=hitsCount %></p>
	<% 
    }
    application.setAttribute("hitCounter8",hitsCount);
  %>
<div id="img">
<img src="spotImg/tai.png">
</div> 
<p>绵延40多公里的太行山大峡谷，位于长治市壶关县境内，集雄、奇、峻、美于一体。相对高差200米～800米，峭壁陡立，峡谷纵横，极为壮观。刀削斧劈的悬崖，千奇百态的山石，甘甜可口的清泉，如练似银的瀑布，碧波荡漾的深潭，引人入胜的溶洞，遍布群山的林海尽在峰峦涧壑之中。景区主要以五指峡、龙泉峡、王莽峡三大峡谷组成，串联黑龙潭、紫团洞、羊肠坂、红豆峡、八泉峡、青龙峡、天桥、万佛山、十八盘等多个景点构成了雄浑壮丽的太行山大峡谷奇观。</p>

</body>
</html>