<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>全校实验室信息</title>
</head>
<body>
   <%@include file="head.jsp" %>
<div id="one">
<br>
<br>
<br>
<br>
<br>
    <form name="formregist" method="post" action="RegisterServlet" >
    <table width="500" height="300" border="1" align="center" >
              <caption>添加实验室信息</caption>
             <tr>
					<td colspan="3"> 本实验室管理员姓名：</td>
					<td><input name="username" type="text" value=""></td>
    	     </tr>
    	     <tr>
					<td colspan="3"> 管理员密码：</td>
					<td><input name="password" type="password"  value=""></td>
      		</tr>
     	   <tr>
                	<td colspan="3">实验室所属院名：</td>
	                <td>
						<select name="dept" >
									  <option  value="机电工程学院">机电工程学院</option>
           							  <option  value="机械与动力工程学院">机械与动力工程学院</option>
       								  <option  value="材料科学与工程学院">材料科学与工程学院</option>
       									<option  value="化工与环境学院">化工与环境学院</option>
         							    <option  value="信息与通讯工程学院">信息与通讯工程学院</option>
           							  <option  value="仪器与电子学院">仪器与电子学院</option>
           							  <option  value="计算机与控制工程学院">计算机与控制工程学院</option>
           							  <option  value="理学院">理学院</option>
        						     <option  value="经济与管理学院">经济与管理学院</option>
       							      <option  value="人文社会科学学院">人文社会科学学院</option>
        						      <option  value="体育学院">体育学院</option>
        						       <option  value="艺术学院">艺术学院</option>
        						      <option  value="软件学院">软件学院</option>
						</select>
					</td>
			</tr>
			<tr>
					<td colspan="3">实验室名称：</td>
					<td><input name="name" type="text"  value=""></td>
			</tr>
        <tr>
			<td colspan="3">本实验室总人数：</td>
	        <td><input name="scount" type="text" value=""></td>
        </tr>
		 <tr>
		    <td colspan="2"><input name="Submit" type="submit" value="提交"></td>
		    <td colspan="2"><input name="Reset" type="reset" value="重置"></td>
	    </tr>  
		</table>		
	</form>
	</div>
	<%@include file="foot.jsp" %>
</body>
</html>