<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src="../js/jquery-1.8.3.min.js">

</script>
<script type="text/javascript">
//页面加载函数
$(function(){
	/*
	参数  1 url 请求的url
	    2 请求的数据  json格式
	    3 成功返回时的回调函数  一般携带响应的数据  data
	    4 接收的数据的数据格式  data  json  xml   text 
	*/

	//绑定点击事件
	$("button").click(function(){
		//触发ajax请求
		/* $.get("/WEB12/TestAjax",{"name":"吉吉"},function(data){
			alert(data.name)
		},"json"); */
		//触发ajax请求
	/* 	$.post("/WEB12/TestAjax",{"age":18},function(data){
			alert(data.age)
		},"json"); */
		$.ajax({
			url:"/WEB12/TestAjax" ,//请求的url
			data:{"name":"lisi"}, //携带的数据
			type:"post",//请求的方式
			success:function(data){//成功时的回调函数  string  json    jsp片段  
				alert(data.name);
			},
			error:function(data){//失败时的回调函数
				alert("服务器异常");
			},
			dataType:"json"//接收数据的处理格式
		});
	});
})

</script>

</head>
<body>
<button>发送ajax请求</button>
</body>
</html>