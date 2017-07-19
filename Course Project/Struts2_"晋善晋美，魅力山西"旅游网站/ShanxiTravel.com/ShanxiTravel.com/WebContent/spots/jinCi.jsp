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
    Integer hitsCount=(Integer)application.getAttribute("hitCounter3");
    if(hitsCount==null||hitsCount==0){
    	//在这里对应主页面相应的标题
	    out.println("欢迎进入晋祠页面");
	    hitsCount=1;
	%>
	    <p>当前页面访问量：<%=hitsCount %></p>
	<% 
   }
    else{
    	 out.println("欢迎再次进入晋祠页面");
    	 hitsCount+=1;
   %>
       <p>当前页面访问量：<%=hitsCount %></p>
	<% 
    }
    application.setAttribute("hitCounter3",hitsCount);
  %>
   <div id="img">
<img src="spotImg/jin.png">
   <p>晋祠始建于北魏386年，现有宋元明清各式建筑百余座、雕塑百余尊、碑碣四百余座，千年古树二十余棵，文物精品之多，实属罕见。</p>
    <p>晋祠的主殿圣母殿，建于宋代，殿堂内有43尊彩绘泥塑像，除圣母像两侧的小像外，其余都是宋代原塑。</p>
   <p> 圣母殿侍女各自有鲜明的个性和气质。有机智灵便、善解人意、极富经验的丫环，也有一脸稚气憨厚的丫环，还有一副庄重矜持、不苟言笑，像是捧印的“领班”， 其中一个侍女风姿绰约，但神情落寞，一看就知她是位自尊心极强、不肯随和、不会讨好人的姑娘。这些塑像，形态各异，表情生动，不仅体现雕塑家们的高超技艺，也让我们看到北宋社会有血有肉、有喜怒哀乐的真实人物，为不可多得之稀世珍品。</p>
    <p>献殿前的金人台上，四角各立有一尊宋代铁铸武士，为晋祠镇水护祠。与之遥遥相望的圣母殿中侍女群像，她们的阴柔之美与铁人的阳刚之气，形成鲜明对比以及美学的平衡感。</p>
    <p>圣母殿前的木雕盘龙，是我国现存最早的盘龙雕柱，有近千年的历史。</p>

</div>
</body>
</html>