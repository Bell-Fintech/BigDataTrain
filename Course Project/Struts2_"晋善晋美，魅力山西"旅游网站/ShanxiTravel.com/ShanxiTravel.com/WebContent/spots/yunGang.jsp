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
    Integer hitsCount=(Integer)application.getAttribute("hitCounter7");
    if(hitsCount==null||hitsCount==0){
	    out.println("欢迎进入云冈石窟页面");
	    hitsCount=1;
	%>
	    <p>当前页面访问量：<%=hitsCount %></p>
	<% 
   }
    else{
    	 out.println("欢迎再次进入云冈石窟页面");
    	 hitsCount+=1;
   %>
       <p>当前页面访问量：<%=hitsCount %></p>
	<% 
    }
    application.setAttribute("hitCounter7",hitsCount);
  %>
<div id="img">
<img src="spotImg/wu.png">
</div> 
<p>云冈石窟是我国最大的石窟之一，与敦煌莫高窟、洛阳龙门石窟和麦积山石窟并称为中国四大石窟艺术宝库。位于山西省大同市以西16公里处的武周山南麓，依山而凿，东西绵延约一公里，气势恢弘，内容丰富。现存主要洞窟51个，造像5100余尊，最高的17米，最小的仅有几厘米，各类造像形象生动活泼，姿态飘逸隽秀。2001年，云冈石窟被列为世界文化遗产。其中的昙曜五窟，布局设计严谨统一，是中国佛教艺术第一个巅峰时期的经典杰作。五华洞雕饰绮丽，丰富多彩，是研究北魏历史、艺术、音乐、舞蹈、书法和建筑的珍贵资料。</p>

</body>
</html>