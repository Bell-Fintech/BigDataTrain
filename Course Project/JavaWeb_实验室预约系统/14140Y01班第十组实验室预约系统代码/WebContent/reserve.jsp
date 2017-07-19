<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
 <%@ page import="java.sql.*" %> 
 <%@ page import="nuc.sw.dbc.DBUtil" %> 

<%

String path = request.getContextPath();

String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";

%>




<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">

<HTML>

  <HEAD>

  <TITLE> 个人预约实验 </TITLE>

 <META NAME="Generator" CONTENT="EditPlus">

  <META NAME="Author" CONTENT="">

  <META NAME="Keywords" CONTENT="">

  <META NAME="Description" CONTENT="">

  <script language="JavaScript" type="text/javascript">

            var name=[

                      ["国防基础科研实验室"],  
                      ["先进制造技术实验室","深孔加工技术研究中心","机械基础实验教学中心","校数控实习基地","机械工程实验教学中心","动力工程实验教学中心"],  
                      ["镁基材料深加工技术","集成精密成形技术研究中心","铸造新工艺技术研究中心","高分子复合材料研究中心"],  
                      ["国家级化工综合示范实验教学中心","超重力化工过程山西省重点实验室","地下目标毁伤技术国防重点学科实验室"],
                      ["国家级电工电子实验教学示范中心","信息探测与处理山西省重点实验室"],
                      ["很纠结吧"],
                      ["国家级虚拟仿真实验教学中心","计算机实验教学中心省级示范实验室","施耐德电气联合实验室"],
                      ["大型计算中心"],
                      ["信息化综合实验室","商务模拟实验室","会计学实验室"],
                      ["人文研究中心"],
                      ["运动解剖实验室","运动生理实验室","运动生物力学实验室"],
                      ["合唱艺术教学研究中心","管乐艺术教学研究中心"],
                      ["安卓实验室","java实验室","PHP实验室","美工实验室","电商物流实训基地"]
                        
                      
                      
            ];  
            var day=[

                      ["周一","周二","周三","周四","周五","周六","周日"],  
                      ["周一","周二","周三","周四","周五","周六","周日"],  
                      ["周一","周二","周三","周四","周五","周六","周日"],  
                      ["周一","周二","周三","周四","周五","周六","周日"],  
                      ["周一","周二","周三","周四","周五","周六","周日"],  
                      ["周一","周二","周三","周四","周五","周六","周日"],  
                      ["周一","周二","周三","周四","周五","周六","周日"],  
                      ["周一","周二","周三","周四","周五","周六","周日"],  
                      
                        
                      
                      
            ]; 
            function getName(){

                //获得学院下拉框的对象

                var sltDept=document.form1.dept;

                //获得名称下拉框的对象

                var sltName=document.form1.name;         

                //得到对应学院的名称数组

                var deptName=name[sltDept.selectedIndex - 1];

        

                //清空名称下拉框，仅留提示选项

                sltName.length=1;

        

                //将名称数组中的值填充到名称下拉框中

                for(var i=0;i<deptName.length;i++){

                    sltName[i+1]=new Option(deptName[i],deptName[i]);

                }

            }

            function getDay(){

                //获得学院下拉框的对象

                var sltWeek=document.form1.week;

                //获得名称下拉框的对象

                var sltDay=document.form1.day;         

                //得到对应学院的名称数组

                var weekName=day[sltWeek.selectedIndex - 1];

        

                //清空名称下拉框，仅留提示选项

                sltDay.length=1;

        

                //将名称数组中的值填充到名称下拉框中

                for(var i=0;i<weekName.length;i++){

                    sltDay[i+1]=new Option(weekName[i],weekName[i]);

                }

            }
        </script>
    
</head>
<body>
<form name="form1" method="post" action="bookServlet">
 
  用户名：<input name="username" type="text" ><br><br>

  密&nbsp;码：<input name="password" type="password" ><br><br>

         预约:<select name="dept" onChange="getName()" >
              <option value="0" >请选择--</option>
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
      
        <SELECT name="name" >
         <OPTION value="0">请选择实验室 --</OPTION>
        </SELECT><br><br>
      	时间段:<select name="week" onChange="getDay()" >
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
      
        <SELECT name="day" >
         <OPTION value="0">请选择星期 --</OPTION>
        </SELECT>
        <select name="time" >
              <option value="0" >请选择--</option>
            <option  value="8:00-10:00">8:00-10:00</option>
            <option  value="10:00-12:00">10:00-12:00</option>
            <option  value="14:00-16:00">14:00-16:00</option>
            <option  value="16:00-18:00">16:00-18:00</option>
            <option  value="20:00-22:00">20:00-22:00</option>
      </select><br><br>
     预约人数:<input   name="book" type="text"><br><br>
     <input name="Submit"type="submit">提交&nbsp;<br>
    
    
     <a href="check.jsp">已预约</a><br>
      <input name="Reset"type="reset">重置
     	
   
   </form>
</body>
</html>