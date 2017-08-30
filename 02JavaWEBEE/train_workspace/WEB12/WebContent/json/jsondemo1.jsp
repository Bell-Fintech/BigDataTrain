<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src="../js/jquery-1.8.3.min.js"></script>
</head>
<script type="text/javascript">
//想描述user对象里面的属性  json 数据格式一   ：  简单的对象实体
var user_1 = {"id":1,"name":"zhangsan","age":18} ;//代表一个对象   json
//alert(user.name);
//描述的是list 集合数据   数组
var list_2 = [{"id":1,"name":"zhangsan","age":18},{"id":2,"name":"zhangsi","age":17}];
//alert(list_2[1].name)
/* for(i in list_2){
	alert(list_2[i].name);
} */
/* $.each(list_2,function(i,n){
	alert(n.name);
	
}); */
//3 map

var map = {"name":"lisi",
		   "age":19,
		   "user":{"id":1,"name":"zhangsan","age":18},
		    "list":[{"id":1,"name":"lisan","age":19},{"id":1,"name":"lier","age":21}]
		}

//alert(map.list[1].name);

var str = '{"id":1,"name":"zhangsan","age":18}' ;
//将json格式的  字符串  转换成json对象  js里面的一个方法
   var json = eval("("+str+")");//转换成json对象

//alert(json.name)

var str1 = '[{"id":1,"name":"zhangsan","age":18},{"id":2,"name":"zhangsi","age":17}]';
alert(str1[0].name);

</script>
<body>

</body>
</html>