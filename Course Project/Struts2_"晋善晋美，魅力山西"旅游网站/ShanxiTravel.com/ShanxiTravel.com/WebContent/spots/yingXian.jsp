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
    Integer hitsCount=(Integer)application.getAttribute("hitCounter6");
    if(hitsCount==null||hitsCount==0){
	    out.println("欢迎进入应县木塔页面");
	    hitsCount=1;
	%>
	    <p>当前页面访问量：<%=hitsCount %></p>
	<% 
   }
    else{
    	 out.println("欢迎再次进入应县木塔页面");
    	 hitsCount+=1;
   %>
       <p>当前页面访问量：<%=hitsCount %></p>
	<% 
    }
    application.setAttribute("hitCounter6",hitsCount);
  %>
<div id="img">
<img src="spotImg/ying.png">
    <p>应县木塔与意大利比萨斜塔、巴黎埃菲尔铁塔并称“世界三大奇塔”。</p>
    <p>应县木塔位于山西朔州应县，建于辽清宁二年（公元1056年），是现存最古老最高大的纯木结构楼阁式建筑，也是我国古建筑中的瑰宝，世界木结构建筑的典范。</p>
    <p>应县木塔建在四米高的台基上，塔高67.31米，底层直径30.27米，呈平面八角形。塔高约底层直径的2.2倍，比例相当敦厚，使得木塔高峻而又不失凝重，将应县木塔稳当当地坐落在大地上。</p>
    <p>全塔耗材红松木料3000立方米，2600多吨，纯木结构、无钉无铆，历经千年风雨地震而岿然挺立。</p>
    <p>塔内曾经发现极为珍贵的辽代文物，其中以经卷较多，有手抄本，有辽代木版印刷本，有的经卷长达30多米，实属国内罕见，尤其是辽刻彩印，填补了中国印刷史上的空白。这些文物为研究辽代的政治经济文化提供了宝贵的资料。</p>
    <p>木塔内供奉着两颗全世界佛教界尊崇的圣物——佛牙舍利，经考证确认为是释迦牟尼灵牙遗骨</p>

</div>
</body>
</html>