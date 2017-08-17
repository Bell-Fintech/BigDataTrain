<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<!-- 最新版本的 Bootstrap 核心 CSS 文件 -->
<link rel="stylesheet" href="${pageContext.request.contextPath}/bootstrap/css/bootstrap.min.css" >
<!-- Custom styles for this template -->
<link href="${pageContext.request.contextPath}/css/signin.css" rel="stylesheet">
<!-- 先引入jquery 再调用boostrap的js库 -->
<script src="${pageContext.request.contextPath}/jquery/jquery-1.12.4.js"></script>
<!-- 最新的 Bootstrap 核心 JavaScript 文件 -->
<script src="${pageContext.request.contextPath}/bootstrap/js/bootstrap.min.js"></script>
<title>Insert title here</title>
</head>
<body>
	<div class="container">
      <form class="form-signin">
        <h2 class="form-signin-heading">Please register in</h2>
        <input type="text" name="account" class="form-control" placeholder="用户名" required autofocus>
        <input type="password" name="password" class="form-control" placeholder="Password" required>
        <input type="password" name="surepassword" class="form-control" placeholder="SurePassword" required autofocus>
        <input type="text" name="nickname" class="form-control" placeholder="Nickname" required>
        <button class="btn btn-lg btn-primary btn-block" type="submit">Register</button>
      </form>
    </div> <!-- /container -->
    <!-- IE10 viewport hack for Surface/desktop Windows 8 bug -->
    <script src="../../assets/js/ie10-viewport-bug-workaround.js"></script>
</body>
</html>