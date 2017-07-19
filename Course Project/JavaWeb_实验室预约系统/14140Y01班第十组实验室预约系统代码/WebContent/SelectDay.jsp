<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<%@include file="head.jsp" %>
<div id="one">
<br>
<br>
<br>
<br>
<center>
<form  action="ShowDayInfoServlet" method="post" name="apply" >
	 <br/>
<table>
<tr>
	<td colspan="3">选择你要选取的时间：</td>
	                <td>
						<select name="week" onChange="getDay()" >
              <option value="0" >请选择--</option>
            <option  value="1">周一</option>
            <option  value="2">周二</option>
            <option  value="3">周三</option>
            <option  value="4">周四</option>
            <option  value="5">周五</option>
            <option  value="6">周六</option>
            <option  value="7">周日</option> 
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