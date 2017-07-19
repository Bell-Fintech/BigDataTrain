<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>按周查询</title>
</head>
<body>
<%@include file="head.jsp" %>
<div id="one">
<br>
<br>
<br>
<br>
<br>
<br>
<center>
<form  action="ShowWeekInfoServlet" method="post" name="apply" >
	 <br/>
<table>
<tr>
	<td colspan="3">选择你要选取的时间：</td>
	                <td>
					<select name="week" onChange="getDay()" >
              <option value="0" >请选择--</option>
            <option  value="13">第13周</option>
            <option  value="14">第14周</option>
            <option  value="15">第15周</option>
            <option  value="16">第16周</option>
            <option  value="17">第17周</option>
            <option  value="18">第18周</option>
            <option  value="19">第19周</option>
            <option  value="20">第20周</option>  
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