<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
</head>
<body>
<form action="${pageContext.request.contextPath}/UserActionType"  method="post">
  <table align="center" border="1"> 
    <caption>山水类查询信息</caption>
	<tr>
                	<td colspan="3">用户类型：</td>
	                <td>
						<select name="type" >
									  <option  value="普通用户">普通用户</option>
           							  <option  value="管理员">管理员</option>
						</select>
					</td>
			</tr>
  <tr>
    <td><input type="submit" value="查找"></td>
  </tr>
</table>
</form>
</body>
</html>