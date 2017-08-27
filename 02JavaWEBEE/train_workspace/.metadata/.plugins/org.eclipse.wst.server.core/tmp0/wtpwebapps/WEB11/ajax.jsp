<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<script type="text/javascript" src="./js/jquery-1.8.3.min.js"></script>
<body>
<button onclick="myajax()">发送ajax请求</button>

<input type="text" id="ha" onblur="myajax()"/>
<span id="msg"></span>
<table id="p">



</table>
</body>

<script type="text/javascript">
    function myajax(){
    	//$.get()
    	//参数1 请求的url
    	  // 参数2 传输的数据json
    	 //  成功的回调函数
    	  // 参数4 支持的数据类型
    	
    	/* $.get("/web10/TestA",
    			{"name":"lisi"},
    			function(data){
    		alert(data.name);
    	},"json"); */
    	
    	/* $.post( 
    	"/web10/TestA"	,
    	{"name":$("#ha").val()},
    	function(data){
    		alert(data.name)
    	},"json"
    	); */
    	
    	$.ajax({
    		url:"/com.edu360/TestA",
    		
    		type:"post",
    		success:function(data){
    			for(i in data){
    				//data[i]
    				$("#p").append("<tr>\n" +
    						"<td>"+data[i].id+"</td>\n" +
    						"<td>"+data[i].name+"</td>\n" +
    						"<td>"+data[i].price+"</td>\n" +
    						"<td>"+data[i].pnum+"</td>\n" +
    						"<td>"+data[i].category+"</td>\n" +
    						"<td>"+data[i].discription+"</td>\n" +
    						"</tr>");
    			}
    		},
    		error:function(data){
    			alert("服务器异常");
    		},
    		dataType:"json"
    	});
    	
    	
    	
    }

</script>

</html>