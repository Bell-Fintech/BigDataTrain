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
    <title></title>
    <link rel="shortcut icon" href="favicon.ico" type="image/x-icon" />
	<link rel="icon" href="favicon.ico" type="image/x-icon" />
    <link rel="stylesheet" href="css/xiaomi.css"/>
     <link rel="stylesheet" href="css/base.min.css">
    <link rel="stylesheet" type="text/css" href="css/goods-detail.min.css">
     <script type="text/javascript" src="js/jquery-2.1.4.min.js"></script>
    <script src="js/jquery.animate-colors-min.js"></script>
</head>
<body>
    <!-- head -->
     <div class="head_box">
         <div id="head_wrap">
             <div id="head_nav">
                 <a>小米网</a><span>|</span>
                 <a>MIUI</a><span>|</span>
                 <a>米聊</a><span>|</span>
                 <a>游戏</a><span>|</span>
                 <a>多看阅读</a><span>|</span>
                 <a>云服务</a><span>|</span>
                 <a>小米移动版</a><span>|</span>
                 <a>问题反馈</a><span>|</span>
                 <a>Select Region</a>
             </div>
             <div id="head_right">
                 <div id="head_landing">
                     <s:if test="#session.uname==null">
                     <a href="loginPage.action" >登陆</a>
                     <span>|</span>
                     <a href="registerPage.action">注册</a>   
                     </s:if>
                     <s:else>
                     <a href="#">${session.uname}</a>
                     <span>|</span>
                     <a href="logoutPage.action">退出</a>  
                     </s:else>
                 </div>
                 <div id="head_car">
                     <a class="head_car_text">&nbsp<span id="back"></span>购物车（0）</a>
                     <div id="car_content" >
                         <a class="car_text" style="display:none;">购物车中还没有商品，赶紧选购吧！</a>
                     </div>
                 </div>
             </div>
         </div>
     </div>
       <div id="main_head_box">
         <div id="menu_wrap">
             <div id="menu_logo">
                 <a href="mainPage.action"><img src="img/xiaomi_logo.png"></a>
             </div>
             <div id="menu_nav">
                 <ul id="menu_nav_ul">
                     <li class="menu_li" control="xiaomiphone">小米手机</li>
                     <li class="menu_li" control="hongmiphone">红米</li>
                     <li class="menu_li" control="pingban">平板</li>
                     <li class="menu_li" control="tv">电视&nbsp;&nbsp;盒子</li>
                     <li class="menu_li" control="luyou">路由器</li>
                     <li class="menu_li" control="yingjian">智能硬件</li>
                     <li><a style="text-decoration: none;">服务</a></li>
                     <li><a style="text-decoration: none;">社区</a></li>
                 </ul>
             </div>
             <div id="find_wrap">
                 <div id="find_bar">
                     <input type="text" id="find_input" style="padding-left:20px;">
                 </div>
                 <div id="find_but">GO</div>
             </div>
         </div>
     </div>
     <div id="menu_content_bg" style="height: 0px;">
         <div id="menu_content_wrap" style="margin:auto;width:1260px;">
             <ul style="top:0px;" id="menu_content_ul">
                 <li id="xiaomiphone">
                     <div class="menu_content">
                         <img src="img/mi4!160x110.jpg">
                         <p class="menu_content_tit">小米手机4</p>
                         <p class="menu_content_price">1499元起</p>
                     </div>
                     <span class="menu_content_line"></span>
                     <div class="menu_content">
                         <img src="img/minote!160x110.jpg">
                         <p class="menu_content_tit">小米NOTE标准版</p>
                         <p class="menu_content_price">1999元起</p>
                     </div>
                     <span class="menu_content_line"></span>
                     <div class="menu_content">
                         <img src="img/minotepro!160x110.jpg">
                         <p class="menu_content_tit">小米NOTE顶配版</p>
                         <p class="menu_content_price">2999元起</p>
                     </div>
                 </li>
                 <li id="hongmiphone">
                     <div class="menu_content">
                         <img src="img/hongmi2a!160x110.jpg">
                         <p class="menu_content_tit">红米手机2A</p>
                         <p class="menu_content_price">499元</p>
                     </div>
                     <span class="menu_content_line"></span>
                     <div class="menu_content">
                         <img src="img/hongmi2!160x110.jpg">
                         <p class="menu_content_tit">红米手机2</p>
                         <p class="menu_content_price">599元</p>
                     </div>
                     <span class="menu_content_line"></span>
                     <div class="menu_content">
                         <img src="img/note!160x110.jpg">
                         <p class="menu_content_tit">红米NOTE</p>
                         <p class="menu_content_price">699元</p>
                     </div>
                     <span class="menu_content_line"></span>
                     <div class="menu_content">
                         <img src="img/note2!160x110.jpg">
                         <p class="menu_content_tit">红米NOTE2</p>
                         <p class="menu_content_price">799元</p>
                     </div>
                 </li>
                 <li id="pingban">
                     <div class="menu_content">
                         <img src="img/mipad16!160x110.jpg">
                         <p class="menu_content_tit">小米平板16G</p>
                         <p class="menu_content_price">1299元</p>
                     </div>
                     <span class="menu_content_line"></span>
                     <div class="menu_content">
                         <img src="img/mipad64!160x110.jpg">
                         <p class="menu_content_tit">小米平板64G</p>
                         <p class="menu_content_price">1499元起</p>
                     </div>
                 </li>
                 <li id="tv">
                     <div class="menu_content">
                         <img src="img/mitv40!160x110.jpg">
                         <p class="menu_content_tit">小米电视2&nbsp;40英寸</p>
                         <p class="menu_content_price">1999元</p>
                     </div>
                     <span class="menu_content_line"></span>
                     <div class="menu_content">
                         <img src="img/mitv48!160x110.jpg">
                         <p class="menu_content_tit">小米电视2S&nbsp;48英寸</p>
                         <p class="menu_content_price">2999元起</p>
                     </div>
                     <span class="menu_content_line"></span>
                     <div class="menu_content">
                         <img src="img/mitv49!160x110.jpg">
                         <p class="menu_content_tit">小米电视2&nbsp;49英寸</p>
                         <p class="menu_content_price">3399元起</p>
                     </div>
                     <span class="menu_content_line"></span>
                     <div class="menu_content">
                         <img src="img/mitv55!160x110.jpg">
                         <p class="menu_content_tit">小米电视2&nbsp;55英寸</p>
                         <p class="menu_content_price">4499元起</p>
                     </div>
                     <span class="menu_content_line"></span>
                     <div class="menu_content">
                         <img src="img/hezimini!160x110.jpg">
                         <p class="menu_content_tit">小米盒子MINI版</p>
                         <p class="menu_content_price">199元</p>
                     </div>
                     <span class="menu_content_line"></span>
                     <div class="menu_content">
                         <img src="img/hezis!160x110.jpg">
                         <p class="menu_content_tit">小米盒子增强版</p>
                         <p class="menu_content_price">299元</p>
                     </div>
                 </li>
                 <li id="luyou">
                     <div class="menu_content">
                         <img src="img/miwifi!160x110.jpg">
                         <p class="menu_content_tit">全新小米路由器</p>
                         <p class="menu_content_price">699元起</p>
                     </div>
                     <span class="menu_content_line"></span>
                     <div class="menu_content">
                         <img src="img/miwifimini!160x110.jpg">
                         <p class="menu_content_tit">小米路由器&nbsp;MINI</p>
                         <p class="menu_content_price">129元</p>
                     </div>
                     <span class="menu_content_line"></span>
                     <div class="menu_content">
                         <img src="img/miwifilite!160x110.jpg">
                         <p class="menu_content_tit">小米路由器&nbsp;青春版</p>
                         <p class="menu_content_price">79元</p>
                     </div>
                     <span class="menu_content_line"></span>
                     <div class="menu_content">
                         <img src="img/wifiExtension!160x110.jpg">
                         <p class="menu_content_tit">小米WIFI放大器</p>
                         <p class="menu_content_price">39元</p>
                     </div>
                 </li>
                 <li id="yingjian">
                     <div class="menu_content">
                         <img src="http://c1.mifile.cn/f/i/15/goods/nav/scale!160x110.jpg">
                         <p class="menu_content_tit">体重称</p>
                         <p class="menu_content_price">99元</p>
                     </div>
                     <span class="menu_content_line"></span>
                     <div class="menu_content">
                         <img src="img/xiaoyi!160x110.jpg">
                         <p class="menu_content_tit">摄像头</p>
                         <p class="menu_content_price">129元起</p>
                     </div>
                     <span class="menu_content_line"></span>
                     <div class="menu_content">
                         <img src="img/yicamera!160x110.jpg">
                         <p class="menu_content_tit">运动相机</p>
                         <p class="menu_content_price">399元起</p>
                     </div>
                     <span class="menu_content_line"></span>
                     <div class="menu_content">
                         <img src="img/ihealth!160x110.jpg">
                         <p class="menu_content_tit">血压计</p>
                         <p class="menu_content_price">199元</p>
                     </div>
                     <span class="menu_content_line"></span>
                     <div class="menu_content">
                         <img src="img/chazuo!160x110.jpg">
                         <p class="menu_content_tit">智能插座</p>
                         <p class="menu_content_price">59元</p>
                     </div>
                     <span class="menu_content_line"></span>
                     <div class="menu_content">
                         <img src="img/smart!160x110.jpg">
                         <p class="menu_content_tit">查看全部
                             <br>智能硬件</p>
                     </div>
                 </li>
             </ul>
         </div>
     </div>
        <!-- head -->
     <script type="text/javascript" src="js/xiaomi.js"></script>
</body>
