<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>添加景点信息</title>
</head>
<body>
<form action="addSpotAction"  method="post"   enctype="multipart/form-data">
<table align="center" border="1">
  <tr>
    <td>ID:</td>
    <td><input type="text" name="spotId" > </td>
  <tr>
  <tr>
    <td>景点名称:</td>
    <td><input type="text" name="spotName"> </td>
  <tr>
   <tr>
		   <td>所属城市</td>
		   <td>
		   <select name="spotCity" >
		         <option value="请选择">请选择</option>
	            <option value="大同">大同</option>
	            <option value="朔州">朔州</option>
                <option value="忻州">忻州</option>
                <option value="吕梁">吕梁</option>
                <option value="太原">太原</option>
                <option value="榆次">榆次</option>
                <option value="阳泉">阳泉</option>
                <option value="临汾">临汾</option>
                <option value="长治">长治</option>
	            <option value="运城">运城</option>
                <option value="晋城">晋城</option>
                <option value="晋中">晋中</option>
                </select></td>
		</tr>
	<tr>
		   <td>所属分类</td>
		  <td><input type="checkbox" name="spotType" value="山" checked>山&nbsp;
		         <input type="checkbox" name="spotType" value="水" >水&nbsp;
		         <input type="checkbox" name="spotType" value="冰" >冰
		   </td>
		</tr>
  <tr>
    <td>门票价:</td>
    <td><input type="text" name="spotPrice"></td>
  </tr>
  <tr>
    <td>主要简介:</td>
    <td><textarea name="spotEditorial" rows="3" cols="30"></textarea></td>
  </tr>
   <tr>
    <td>线路图:</td>
    <td><input type="text"  name="spotRoute" ></td>
  </tr>
    <tr>
       <th>图片标识:</th>
       <td><input type="text" name="imageID"></td>
     </tr>
   <tr>
       <th>选择图片:</th>
       <td><input type="file" name="upload"></td>
     </tr>
     <tr>
     <td><input type="submit" value="添加"></td>
  </tr>
  </table>
</form>
</body>
</html>