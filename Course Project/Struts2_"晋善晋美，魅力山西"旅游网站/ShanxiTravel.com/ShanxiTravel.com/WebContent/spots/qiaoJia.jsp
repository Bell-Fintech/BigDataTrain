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
    Integer hitsCount=(Integer)application.getAttribute("hitCounter5");
    if(hitsCount==null||hitsCount==0){
	    out.println("欢迎进入乔家大院页面");
	    hitsCount=1;
	%>
	    <p>当前页面访问量：<%=hitsCount %></p>
	<% 
   }
    else{
    	 out.println("欢迎再次进入乔家大院页面");
    	 hitsCount+=1;
   %>
       <p>当前页面访问量：<%=hitsCount %></p>
	<% 
    }
    application.setAttribute("hitCounter5",hitsCount);
  %>
  <div id="img">
<img src="spotImg/qiao.png">
</div>
    <p>乔家大院布局工整，华贵威严，屋檐、门窗、栏杆、台阶等处处雕工精巧，极其讲究细节，被誉为“北方民居建筑史上一颗璀璨的明珠”。</p>
    <p>然而这颗明珠，并非上天赐予。富贵的乔家是由一个孤儿靠着卖豆腐烧饼起家，商号“复盛公”，遍及包头、北京、天津、太原，其发迹实在令人难以想象。</p>
    <p>独具特色的文化内涵与精彩绝伦的建筑艺术融合在一起，乔家大院成了众多导演钟爱的外景地，曾有四十多部影视作品在此拍摄。</p>
    <p>传说：</p>
    <p>乔贵发，奋斗20年衣锦还乡，回村后竟娶了一个寡妇。以他的财力，堪称现在的“钻石王老五”，他可以选择一个貌美如花的年轻女子，但为什么是一个寡妇呢？</p>
    <p>传说，乔贵发当年被人嘲笑穷光蛋，但有位小媳妇打抱不平说他日后可能有大出息，这句话深深触动了乔贵发，经商致富之后，乔贵发毫不犹豫的选择寡妇——那个曾经给他温暖的小媳妇。</p> 
    <p>镇宅之宝九龙灯</p>
    <p>塞外的军人及蒙古部落所欠缺的生活用品，是内地能提供的；而内地所欠缺的皮毛、呢绒，又是塞北能提供的，山西人抓住这个巨大的商机，来往的商队络绎不绝，规模越来越大，山西因而成为海内最富的省份。</p>

</body>
</html>