<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
</head>
<body>
<form action="${pageContext.request.contextPath}/SpotActionCity"  method="post">
  <table align="center" border="1"> 
    <caption>城市查询信息</caption>
     <tr>
		   <td>所属城市</td>
		   <td><select name="spotCity" >
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
    <td><input type="submit" value="查找"></td>
  </tr>
</table>
</form>
</body>
</html>