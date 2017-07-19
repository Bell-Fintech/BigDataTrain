<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>晋善晋美，魅力山西旅游网站</title>
    <link rel="shortcut icon" href="favicon.ico" type="image/x-icon" />
	<link rel="icon" href="favicon.ico" type="image/x-icon" />
    <link rel="stylesheet" href="css/travel.css"/>
     <link rel="stylesheet" href="css/base.min.css">
    <link rel="stylesheet" type="text/css" href="css/goods-detail.min.css">
     <script type="text/javascript" src="js/jquery-2.1.4.min.js"></script>
    <script src="js/jquery.animate-colors-min.js"></script>
</head>
<body>
    <!-- head -->
     <div class="head_box"  >
         <div id="head_wrap">
             <div id="head_nav" >
                 <a>旅游网</a><span>|</span>
                 <a>我的账户</a><span>|</span>
                 <a>个人中心</a><span>|</span>
                 <a>线路规划</a><span>|</span>
                 <a>特色论坛</a><span>|</span>
                 <a>问题反馈</a><span>|</span>
                 <a>Select Region</a>
             </div>
             <div id="head_right"   >
                 <div id="head_landing" >
                     <s:if test="#session.uname==null">
                     <a href="login.jsp" >登陆</a>
                     <span>|</span>
                     <a href="registerPage.action">注册</a>   
                     </s:if>
                     <s:else>
                     <a href="#">${session.uname}</a>
                     <span>|</span>
                     <a href="logoutPage.action">退出</a>  
                     </s:else>
                 </div>
             </div>
         </div>
     </div>
       <div id="main_head_box">
         <div id="menu_wrap">
             <div id="menu_logo">
                 <a href="mainPage.action"><img src="images/travel_logo.jpg"></a>
             </div>
             <div id="menu_nav"  style="padding-left:10px;padding-right:60px;">
                 <ul id="menu_nav_ul">
                    <li><font size="3" color="red">欢迎${sessionScope.loginType}${sessionScope.loginUser}登录;</font></li> 
                     <li class="menu_li" control="overview">概况-晋古之风</li>
                     <li class="menu_li" control="mainspot">景点-善怀之景 </li>
                     <li class="menu_li" control="pingban">行程-晋享之旅</li>
                     <li class="menu_li" control="tv">读图-美丽之悦</li>
                 </ul>
             </div>
                 <div id="find_bar"  style="padding-top:32px;">
                     <form action="${pageContext.request.contextPath}/SpotActionPartName"  method="post">    
                        <div><input type="text" name="spotName"  id="find_input"   style="height:37px">
                                  <input type="submit"id="find_but" value="查找" style="height:37px">
                        </div>
  					</form>
                 </div>
             </div>
     </div>
     <div id="menu_content_bg" style="height: 0px;">
         <div id="menu_content_wrap" style="margin:auto;width:1260px;">
             <ul style="top:0px;" id="menu_content_ul">
                 <li id="overview">
                     <div align="center" class="menu_content">
                         <img src="images/history!160x110.jpg">                         
                         <p class="menu_content_tit">历史</p>
                     </div>
                     <span class="menu_content_line"></span>
                     <div align="center" class="menu_content">
                         <img src="images/geography!160x110.jpg">
                         <p class="menu_content_tit">地理</p>
                     </div>
                     <span class="menu_content_line"></span>
                     <div align="center" class="menu_content">
                         <img src="images/traffic!160x110.jpg">
                         <p class="menu_content_tit">交通</p>
                     </div>
                     <span class="menu_content_line"></span>
                     <div align="center"class="menu_content">
                         <img src="images/economy!160x110.jpg">
                         <p class="menu_content_tit">经济</p>
                     </div>
                     <span class="menu_content_line"></span>
                     <div align="center" class="menu_content">
                         <img src="images/city!160x110.jpg">
                         <p class="menu_content_tit">城市</p>
                     </div>
                 </li>
                 <li id="mainspot">
                     <div align="center"class="menu_content">
                         <img src="images/wutaishan!160x110.jpg">
                         <p class="menu_content_tit">五台山</p>
                     </div>
                     <span class="menu_content_line"></span>
                     <div align="center"class="menu_content">
                         <img src="images/pingyao!160x110.jpg">
                         <p class="menu_content_tit">平遥古城</p>
                     </div>
                     <span class="menu_content_line"></span>
                     <div align="center"class="menu_content">
                         <img src="images/yungang!160x110.jpg">
                         <p class="menu_content_tit">云冈石窟</p>
                     </div>
                     <span class="menu_content_line"></span>
                     <div align="center"class="menu_content">
                         <img src="images/jinci!160x110.jpg">
                         <p class="menu_content_tit">晋祠</p>
                     </div>
                 </li>
                 <li id="pingban">
                     <div align="center"class="menu_content">
                         <img src="images/taihangshan!160x110.jpg">
                         <p class="menu_content_tit">主题线路</p>
                     </div>
                     <span class="menu_content_line"></span>
                     <div align="center"class="menu_content">
                         <img src="images/city!160x110.jpg">
                         <p class="menu_content_tit">城市线路</p>
                     </div>
                      <span class="menu_content_line"></span>
                     <div align="center"class="menu_content">
                         <img src="images/chuxing!160x110.jpg">
                         <p class="menu_content_tit">出行服务</p>
                     </div>
                 </li>
                 <li id="tv">
                     <div align="center"class="menu_content">
                         <img src="images/shanyue!160x110.jpg">
                         <p class="menu_content_tit">山岳</p>
                     </div>
                     <span class="menu_content_line"></span>
                     <div align="center"class="menu_content">
                         <img src="images/hongse!160x110.jpg">
                         <p class="menu_content_tit">红色</p>
                     </div>
                     <span class="menu_content_line"></span>
                     <div align="center"class="menu_content">
                         <img src="images/simiao!160x110.jpg">
                         <p class="menu_content_tit">寺庙</p>
                     </div>
                     <span class="menu_content_line"></span>
                     <div align="center"class="menu_content">
                         <img src="images/changcheng!160x110.jpg">
                         <p class="menu_content_tit">长城</p>
                     </div>
                     <span class="menu_content_line"></span>
                     <div align="center"class="menu_content">
                         <img src="images/heliiu!160x110.jpg">
                         <p class="menu_content_tit">河流</p>
                     </div>
                     <span class="menu_content_line"></span>
                     <div align="center"class="menu_content">
                         <img src="images/dayuan!160x110.jpg">
                         <p class="menu_content_tit">大院</p>
                     </div>
                 </li>
             </ul>
         </div>
     </div>
        <!-- head -->
     <script type="text/javascript" src="js/travel.js"></script>
</body>
