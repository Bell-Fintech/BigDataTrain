//页面加载
$(function(){
	//输入文本框绑定失去焦点的事件
	$("#name").blur(function(){
		$.post(
		  "/WEB12/Register"	,
		  {"name":$("#name").val()},
		  function(data){
			  //将数据放在span
			  $("#msg").html(data);
		  }
		);
	});
	
	
	
	
	
	
	
	
})