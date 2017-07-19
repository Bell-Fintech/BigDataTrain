<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page import="java.io.*,java.util.*,java.lang.*"%>
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
    Integer hitsCount=(Integer)application.getAttribute("hitCounter4");
    if(hitsCount==null||hitsCount==0){
	    out.println("欢迎进入平遥古城页面");
	    hitsCount=1;
	%>
	    <p>当前页面访问量：<%=hitsCount %></p>
	<% 
   }
    else{
    	 out.println("欢迎再次进入平遥古城页面");
    	 hitsCount+=1;
   %>
       <p>当前页面访问量：<%=hitsCount %></p>
	<% 
    }
    application.setAttribute("hitCounter4",hitsCount);
  %>
<div id="img">
<img src="spotImg/ping.png">
</div> 
    <p>在世界上还没有华尔街的1824年，这里已经开创了华尔街的事业；</p>
    <p>在全世界都忙着旧貌换新颜的当下，这里依然保持着2700年前的样貌。</p>
    <p>你不必早出生200年或2000年，你只要到山西来，便可一览数百年前的中国华尔街诞生地，领略中国保存最完整的古城风采。</p>
    <p>平遥古城有“龟城”之称，街道格局为“土”字形，整体布局遵从八卦方位，体现了明清时期城市规划理念和形制分布。城内外有各类遗址、古建筑300多处，有保存完整的明清民宅近4000座，街道商铺都体现历史原貌，被称作研究中国古代城市的活样本。</p>
    <p>平遥城墙为明洪武三年(1370年)所建，周长6.4公里，墙高12米左右，外表全部砖砌，墙外有护城河，深广各4米。墙上筑有3000个垛口、72座敌楼，据说象征孔子三千弟子及七十二贤士。城墙历经600余年的风雨沧桑，至今仍雄风犹存，是中国现存规模较大、历史较早、保存较完整的古城墙之一，亦是世界遗产平遥古城的核心组成部分。</p>
    <p>世界遗产委员会的评价：</p>
    <p>平遥古城是中国境内保存最为完整的一座古代县城，是中国汉民族城市在明清时期的杰出范例，在中国历史的发展中，为人们展示了一幅非同寻常的文化、社会、经济及宗教发展的完整画卷。</p>
    <p>平遥古城十大怪，其中之一就是房子半边盖。流传最广的说法为“四水归堂”或“肥水不流外人田”。山西地处干旱，且风沙较大，将房屋建成单坡，能增加房屋临街外墙的高度，而临街又不开窗户，则能够有效地抵御风沙和提高安全系数。</p>
    <p>清代晚期（1840-1911），平遥经济高度发展，昌荣鼎盛，票号多达22家，成为当时的金融中心。</p>
    <p>日升昌是中国第一家票号，是中国现代银行的开山鼻祖，日升昌票号曾在山东、河南、辽宁、江苏等先后设立分支机构，19世纪40年代，它的业务更进一步扩展到日本、 新加坡 、俄罗斯等国家 。</p>
    <p>2015年7月20日，平遥古城被批准为国家5A级景区。</p>

   
    
  
  
</body>
</html>