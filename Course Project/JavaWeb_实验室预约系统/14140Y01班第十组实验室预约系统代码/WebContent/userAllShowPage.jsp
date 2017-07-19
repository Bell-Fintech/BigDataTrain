<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@ page import="java.sql.*" %>
 <%@page import="nuc.sw.servlet.ShowInfoServlet" %>
  <%@ page   import="java.util.*" %>
  <%@ page import="nuc.sw.bean.manager" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>显示个人信息</title>
<style>
#main{
 width:880px;
 height:440px;
}
#left{
width:440px;
height:440px;
float:left;
}
#right{
width:440px;
height:440px;
float:right;
}
</style>
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
   <jsp:useBean id="m"  class="nuc.sw.bean.manager"></jsp:useBean>
   <jsp:useBean id="mDao"  class="nuc.sw.dao.ManagerDao"></jsp:useBean>
    <% 
    List<manager> mlist=new ArrayList<manager>();
    mlist=mDao.findAll();
    //mlist=mDao.findAll(request.getParameter("dept"));
	//用表格显示查看的数据
	 %>
 <table border="1" width="800" height="300" align="center">
   <tr>
     <td>本实验室管理员姓名</td>
     <td>管理员密码</td>
     <td>实验室所属院名</td>
     <td>实验室名称</td>
     <td>本实验室总人数</td>
      <td>查询成功</td>
   </tr>
   <% 
   //System.out.println(mlist.size());
   for(int i=0;i<mlist.size();i++){
	 m=mlist.get(i);
	 %>
      <tr>
     <td><%=m.getUsername()%></td>
     <td><%=m.getPassword()%></td>
     <td><%=m.getDept()%></td>
     <td><%=m.getName()%></td>
     <td><%=m.getScount()%></td>
     <td><a href="updateInfoPage.jsp?name=<%=m.getName()%>">修改</a></td>
   </tr>
      <%
      }
    %>
      </table>
      </div>
      <%@include file="foot.jsp" %>
      </body>
</html>