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
	background-color:rgb(150,255,255);
	
}
</style>
</head>
<body>

  <%
  //括号里的值每个页面都不一样
    Integer hitsCount=(Integer)application.getAttribute("hitCounter1");
    if(hitsCount==null||hitsCount==0){
    	//在这里对应主页面相应的标题
	    out.println("欢迎进入洪洞大槐树页面");
	    hitsCount=1;
	%>
	    <p>当前页面访问量：<%=hitsCount %></p>
	<% 
   }
    else{
    	 out.println("欢迎再次进入洪洞大槐树页面");
    	 hitsCount+=1;
   %>
       <p>当前页面访问量：<%=hitsCount %></p>
	<% 
    }
    application.setAttribute("hitCounter1",hitsCount);
  %>
    
  <!-- 在这里显示具体的信息 -->
   <div id="img">
<img src="spotImg/hong.png">
</div> 
	<p>古大槐树又叫洪洞大槐树，位于山西临汾洪洞县西北2公里的贾村。</p>
   	<p> “问我祖先在何处，山西洪洞大槐树。”指的就是这里。</p>
    <p>话说明朝建立之初，由于天灾人祸人口锐减，而山西未经战乱，人口稠密，河南河北山东的总人口不及山西的一半。从洪武初年到永乐十五年，五十多年内共有十八次大规模的迁徙，把山西人分散到十八省五百县，他们就是从这里出发的。</p>
    <p>当时的移民条律是四口之家留一，六口之家留二，八口之家留三，同姓同宗不能同迁一地，于是有人改姓，有人半路逃跑，但被抓回的有的个割耳朵有的用刀划脸。由于大部分的山西人不愿离乡背井，官兵担心百姓逃跑，就在每个人的小脚趾甲上刻了一刀作为标记，所以相传小脚趾甲两半的，都是山西人的后代。</p>
    <p>你，看看自己的小脚趾甲，是不是两半？</p>
</body>
</html>