<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>添加景点信息</title>
</head>
<body>
<form action="addUserAction"  method="post">
<table border="1"  align="center">
              <caption>注册用户信息</caption>
             <tr>
					<td colspan="3"> 用户姓名：</td>
					<td><input name="username" type="text" value=""></td>
    	     </tr>
    	     <tr>
					<td colspan="3"> 用户密码：</td>
					<td><input name="password" type="password"  value=""></td>
      		</tr>
      		<tr>
					<td colspan="3"> 确认密码：</td>
					<td><input name="surepass" type="password"  value=""></td>
      		</tr>
     	   <tr>
                	<td colspan="3">用户类型：</td>
	                <td>
						<select name="type" >
									  <option  value="普通用户" onClick="">普通用户</option>
           							  <option  value="管理员">管理员</option>
						</select>
					</td>
			</tr>
			<tr>
					<td colspan="3">联系方式：</td>
					<td><input name="phone" type="text"  value=""></td>
			</tr>
        <tr>
			<td colspan="3">邮箱：</td>
	        <td><input name="email" type="text" value=""></td>
        </tr>
		 <tr>
		    <td colspan="2"><input  type="submit" value="注册"></td>
		    <td colspan="2"><input  type="reset" value="重置"></td>
	    </tr>  
		</table>		
</form>
</body>
</html>