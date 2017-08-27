<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<HTML>
<HEAD id=Head1>
<TITLE>无标题页</TITLE>
<META http-equiv=Content-Type content="text/html; charset=utf-8">
<STYLE type=text/css>
* {
	FONT-SIZE: 12px;
	COLOR: white
}

#logo {
	COLOR: white
}

#logo A {
	COLOR: white
}

FORM {
	MARGIN: 0px
}
</STYLE>
<SCRIPT src="Top.files/Clock.js" type=text/javascript></SCRIPT>
<META content="MSHTML 6.00.2900.5848" name=GENERATOR>
</HEAD>
<BODY
	style="BACKGROUND-IMAGE: url(../images/bg.gif); MARGIN: 0px; BACKGROUND-REPEAT: repeat-x">
	<form id="form1">
		<DIV id=logo
			style="BACKGROUND-IMAGE: url(../images/logo.png); BACKGROUND-REPEAT: no-repeat">
			<DIV
				style="PADDING-RIGHT: 50px; BACKGROUND-POSITION: right 50%; DISPLAY: block; PADDING-LEFT: 0px; BACKGROUND-IMAGE: url(../images/bg_banner_menu.gif); PADDING-BOTTOM: 0px; PADDING-TOP: 3px; BACKGROUND-REPEAT: no-repeat; HEIGHT: 30px; TEXT-ALIGN: right">

				<A id=HyperLink2 href="../introduce.html" target="mainFrame">&nbsp;返&nbsp;&nbsp;回&nbsp;&nbsp;首&nbsp;&nbsp;页&nbsp;&nbsp;&nbsp;</A>
				<IMG src="Top.files/menu_seprator.gif" align=absMiddle>
				 <A id=HyperLink3
					href="../login.jsp">&nbsp;&nbsp;&nbsp;退&nbsp;&nbsp;出&nbsp;&nbsp;系&nbsp;&nbsp;统&nbsp;</A>
			</DIV>
			<DIV style="DISPLAY: block; HEIGHT: 54px"></DIV>
			<DIV
				style="BACKGROUND-IMAGE: url(../images/bg_nav.gif); BACKGROUND-REPEAT: repeat-x; HEIGHT: 30px">
				<TABLE cellSpacing=0 cellPadding=0 width="100%">
					<TBODY>
						<TR>
							<TD>
								<DIV>
									<IMG src="Top.files/nav_pre.gif" align=absMiddle> 欢迎 <SPAN
										id=lblBra>中北大学</SPAN> <SPAN id=lblDep>软件学院</SPAN> [ ${user.name } ] 光临
								</DIV></TD>
							<TD align=right width="70%"><SPAN
								style="PADDING-RIGHT: 50px"> <IMG
									src="Top.files/menu_seprator.gif" align=absMiddle> <SPAN
									id=clock></SPAN>
							</SPAN></TD>
						</TR>
					</TBODY>
				</TABLE>
			</DIV>
		</DIV>
		<SCRIPT type=text/javascript>
			var clock = new Clock();
			clock.display(document.getElementById("clock"));
		</SCRIPT>
	</form>
</BODY>
</HTML>
