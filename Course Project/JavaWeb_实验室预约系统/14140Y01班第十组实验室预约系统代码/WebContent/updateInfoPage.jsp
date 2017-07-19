<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
     <%@ page import="java.sql.*" %>
          <%@ page import="nuc.sw.dao.ManagerDao" %>
    <%@ page import="nuc.sw.bean.manager" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>修改信息</title>
</head>
<body>
<%@include file="head.jsp" %>
<%
  //加载驱动
  request.setCharacterEncoding("utf-8");
   Class.forName("org.gjt.mm.mysql.Driver");
  //获取连接
  Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/erms","root","123456");
  //out.println(coon);
  //操作数据
  String sql="select username,password,dept,name,scount from manager where name=?";
  PreparedStatement ps=conn.prepareStatement(sql);//容器放SQL的东西
//out.println(ps); 
 ps.setString(1,request.getParameter("name"));
//out.println(request.getParameter("userName"));
  ResultSet rs=ps.executeQuery();//ResultSet里有东西
if(rs.next())
  {
  //用表格显示查看的数据
  %>
<div id="one">

   <jsp:useBean id="m"  class="nuc.sw.bean.manager"></jsp:useBean>
   <jsp:useBean id="mDao"  class="nuc.sw.dao.ManagerDao"></jsp:useBean>
   
               
               <% 
               String name=request.getParameter("name");
               m=mDao.findByUsername((String)session.getAttribute("name"));
             //用表格显示查看的数据
               %>
	              
	            
    <form name="formregist" method="post" action="UpdateInfoServlet" >
    <table width="500" height="300" border="1" align="center">
      <caption>用户注册</caption>
       <tr>
					<td colspan="3"> 本实验室管理员姓名：</td>
					<td><input name="username" type="text"  value=<%=rs.getString(1)%> readonly></td>
    	     </tr>
    	     <tr>
					<td colspan="3"> 管理员密码：</td>
					<td><input name="password" type="password"  value=<%=rs.getString(2)%>></td>
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
					<td><input name="name" type="text"  value=<%=rs.getString(4)%>></td>
			</tr>
        <tr>
			<td colspan="3">本实验室总人数：</td>
	        <td><input name="scount" type="text"  value=<%=rs.getString(5)%> ></td>
        </tr>
        <tr>
		<td><input name="Submit" type="submit" value="提交"></td>
		<td><input name="Reset" type="reset" value="重置"></td>
	</tr>  
    </table>
    </form>
    <%
  }

  //释放资源
  rs.close();
  ps.close();
  conn.close();
%>
  </div>
  <%@include file="foot.jsp" %>
</body>
</html>