<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>选择类别</title>
</head>
<body>
<%@include file="head.jsp" %>
<div id="one">
<br>
<br>
<br>
<br>
<br>
<center>
 <strong>
                当前第 <code>13</code> 周（日期：2016-05-23 ~ 2016-05-29）
 </strong>
<form  action="ShowSortInfoServlet" method="post" name="apply" >
	 <br/>
<table>
<tr>
	<td colspan="3">选择你要预约的实验室所属院名：</td>
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
						 <button class="bz-button bz-button-primary" onclick="javascript:goSearch();">
                               <i class="iconfont icon-search"></i> <strong>查询</strong>
                        </button>
			     </td>
      </tr> 
      </table>
      </form>
      </center>
      </div>
      <%@include file="foot.jsp" %>
</body>
</html>