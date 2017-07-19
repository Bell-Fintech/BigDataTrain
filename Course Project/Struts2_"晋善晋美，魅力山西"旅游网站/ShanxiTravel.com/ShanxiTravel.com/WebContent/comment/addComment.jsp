<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>添加评论信息</title>
</head>
<body>
<form action="addCommentAction"  method="post" >
<table align="center" border="1">
  <tr>
    <td>ID:</td>
    <td><input type="text" name="id" > </td>
  <tr>
   <tr>
		   <td>景点名称:</td>
		   <td>
		   <select name="mainspotId" >
		         <option value="请选择">请选择</option>
	            <option value="1">1</option>
	            <option value="2">2</option>
                <option value="3">3</option>
                <option value="4">4</option>
                <option value="5">5</option>
                <option value="6">6</option>
                <option value="7">7</option>
                <option value="8">8</option>
                <option value="9">9</option>
	            <option value="10">10</option>
                <option value="11">11</option>
                <option value="12">12</option>
                </select></td>
		</tr>
  <tr>
    <td>评论内容:</td>
    <td><input type="text" name="content"></td>
  </tr>
    <tr>
     <td><input type="submit" value="评论"></td>
  </tr>
  </table>
</form>
</body>
</html>