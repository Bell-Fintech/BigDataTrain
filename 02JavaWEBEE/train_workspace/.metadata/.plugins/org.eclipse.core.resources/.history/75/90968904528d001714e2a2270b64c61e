<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">

<html>
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1.0, maximum-scale=1.0">
<title>商品管理系统</title>

<script>
	if (window.top !== window.self) {
		window.top.location = window.location
	};
</script>
<style type="text/css">
.row {
	padding: 20px;
	background: rgba(153, 153, 153, 0.5);
	border-radius: 15px;
}
* {
	font-family: Microsoft YaHei;
}
</style>
<link rel="stylesheet" href="resources/style/css/animate.min.css" type="text/css"></link>
<link rel="stylesheet" href="resources/style/css/bootstrap.min.css" type="text/css"></link>
<link rel="stylesheet" href="resources/style/css/font-awesome.min93e3.css" type="text/css"></link>
<link rel="stylesheet" href="resources/style/css/login.min.css" type="text/css"></link>
<link rel="stylesheet" href="resources/style/css/style.min.css" type="text/css"></link>
</head>
<body background="resources/style/img/login-background.png">
	<div class="signinpanel" style="color:#000 ;font-weight: bold;">
		<div class="row">
			<div class="col-sm-7">
				<div class="signin-info">
					<div class="m-b"></div>
					<br>
					<div class="logopanel m-b">
						<!-- 						<h1 style="text-align: center;font-size: 40px;"> -->
						<!-- 							<strong>管理系统</strong> -->
						<!-- 						</h1> -->
						<img alt="" src="resources/logo/loginTitleLogo.png" style="width: 400px;">
					</div>
				</div>
			</div>
			<div class="col-sm-5">
				<form id="loginForm" method="post" action="login"
					onsubmit="$(':input[name=userName]').each(function(){if($(this).is(':hidden')){$(this).remove();}});return true;"
				  >
					<h3 class="no-margins">登录：</h3>
					<input type="text" class="form-control uname" id="userName" name="name" value="1414010513" placeholder="请输入账号" />
					<input type="password" class="form-control pword m-b" id="userPwd" name="pwd" placeholder="输入你的密码" />
					
					<p style="height: 1em;color: #CC0066;" class="text-right"></p>
					<button class="btn btn-success btn-block" type="submit">登录</button>
				</form>
			</div>
		</div>
		<div class="signup-footer" style="border-top: solid  2px  rgba( 153,153,153, 0.8); ">
			<div class="pull-left">
				Powered By &nbsp;
				中北大学软件学院张丹
			</div>
		</div>
	</div>
</body>
</html>