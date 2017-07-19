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
  //括号里的值每个页面都不一样
    Integer hitsCount=(Integer)application.getAttribute("hitCounter2");
    if(hitsCount==null||hitsCount==0){
    	//在这里对应主页面相应的标题
	    out.println("欢迎进入壶口瀑布页面");
	    hitsCount=1;
	%>
	    <p>当前页面访问量：<%=hitsCount %></p>
	<% 
   }
    else{
    	 out.println("欢迎再次进入壶口瀑布页面");
    	 hitsCount+=1;
   %>
       <p>当前页面访问量：<%=hitsCount %></p>
	<% 
    }
    application.setAttribute("hitCounter2",hitsCount);
  %>
 <div id="img">
<img src="spotImg/hu.png">
</div> 
    <p>世界第一大黄色瀑布---山西壶口瀑布。</p>
    <p>黄河在此由河宽300米收窄为50米，飞流直下，骇浪翻滚，如千军万马奔腾怒吼，声传数十里外，其排山倒海的雄壮之势，素有“不观壶口大瀑布，难识黄河真面目”的盛誉。</p>
    <p>壶口瀑布有多壮观？去一趟你才能体会，文字只是表达的工具，在无法形容的壶口瀑布面前，任何表述都苍白无力。</p> 
    <p>壶口景色，四季各异，严冬时江水歇息，冰封河面；春来则凌汛咆哮，如雷贯耳；盛夏则大水盈岸，颇为壮观；秋季则浩浩汤汤，彩虹通天。一般而言壶口瀑布最佳观赏期有2个，一是春季4～5月份，漫山遍野的山桃花盛开，冻结的冰水消融，称为“三月桃花汛”；二是秋季9~11月份雨季刚刚过去，周边众多山泉小溪，汇集大量清流，阵阵秋风吹过，常有彩虹出现，叫做“壶口秋风”。这两个时期，水大而稳，瀑布宽度可达千米左右。</p>


</body>
</html>