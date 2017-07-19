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
	
}
</style>
</head>
<body>

  <%
  //括号里的值每个页面都不一样
    Integer hitsCount=(Integer)application.getAttribute("hitCounter");
    if(hitsCount==null||hitsCount==0){
    	//在这里对应主页面相应的标题
	    out.println("欢迎进入五台山页面");
	    hitsCount=1;
	%>
	    <p>当前页面访问量：<%=hitsCount %></p>
	<% 
   }
    else{
    	 out.println("欢迎再次进入五台山页面");
    	 hitsCount+=1;
   %>
       <p>当前页面访问量：<%=hitsCount %></p>
	<% 
    }
    application.setAttribute("hitCounter",hitsCount);
  %>
    
  <!-- 在这里显示具体的信息 -->
<div id="img">
<img src="spotImg/wu.png">
</div> 
   <p>在中国历史上著名的“康乾盛世”有一个能让三位帝王亲临的圣地——五台山。</p>
   <p> 五台山有当今世界上仅存的音乐绝响梵乐，并存有各类佛教建筑，大量庙堂殿宇构成了世界现存最庞大的佛教古建群，享有“佛国”盛誉，是中国最早、最大的国际性佛教道场。</p>
   <p>五台山是中国最早寺庙显通寺的诞生地，而南禅寺和佛光寺作为中国最早的木结构建筑，则为唐代文明提供了宝贵的见证。<p> 
   <p>作为世界上最早浮出地面的陆地，五台山拥有全球罕见的地层地貌，其历史可追溯到26亿年前，是全球气候变化的检测器。<p> 
   <p>世界遗产委员会评价五台山：中国四大佛教名山之首，将自然地貌和佛教文化融为一体，将对佛的信仰凝结在对自然山体的崇拜之中，成为独特而富有生命力的组合型文化景观。<p>  
   <p>东台顶的日出是五台山不容错过的自然景观，旭日初升，霞光万道，静谧的望海寺便完全浸沉在一片云山雾海的仙境之中，望海寺便因此得名。<p> 
   
      
</body>
</html>