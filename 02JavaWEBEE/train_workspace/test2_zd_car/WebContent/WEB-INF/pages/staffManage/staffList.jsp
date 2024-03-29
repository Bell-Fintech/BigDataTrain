<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<%@ page language="java" pageEncoding="UTF-8"
	contentType="text/html; charset=UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<%@ taglib prefix="pg" uri="http://jsptags.com/tags/navigation/pager"%>

<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>修配连汽配市场</title>
<link href="${ctx}/css/index.css" rel="stylesheet" type="text/css" />
<!--状态下拉-->
<script type="text/plain" id="html_soformitem"><input type="hidden" name="${name}" value="${value}" class="hide" /></script>
<script type="text/plain" id="html_smiitem"><div class="smiitem"{{if elementId}} id="${elementId}"{{else}} data-value="${value}"  data-target="${target}"{{/if}}><div class="smiitxt">${value}</div><div class="smiic"><span class="yy-icon yy-sic"></span></div></div></script>
</head>
<!--[if lt IE 9]><style type="text/css">body{margin:0; padding:0}</style>  <script type="text/javascript">(function(){window.onload=function(){var imgs=document.getElementsByTagName("img");for(var i=0;i<imgs.length;i++){var data_src=imgs[i].getAttribute("data-src");if(data_src)imgs[i].setAttribute("src",data_src);}}})()</script><![endif]-->
</script>
<!--新增用户-->
<script type="text/javascript" src="${ctx}/js/jquery-1.7.1.min.js"></script>
<script type="text/javascript"
	src="${ctx}/js/jBox/jquery.jBox-2.3.min.js" type="text/javascript"></script>
<script type="text/javascript"
	src="${ctx}/js/jBox/i18n/jquery.jBox-zh-CN.min.js"
	type="text/javascript"></script>
<link rel="stylesheet" type="text/css"
	href="${ctx}/js/jBox/Skins-maitian/${themeName}/jbox.css" />
</head>
<script type="text/javascript">
	function addStaff() {
		$.jBox("iframe:${ctx}/staffManage/toAddStaffManage.shtml", {
			title : "",
			width : 1020,
			height : 700,
			buttons : { '关闭': true}
		});
	}

	function editStaff(id) {
		$.jBox("iframe:${ctx}/staffManagementAction.do?method=toEditStaff&id="
				+ id, {
			title : "",
			width : 1020,
			height : 700,
			buttons : { /*'关闭': true*/}
		});
	}
</script>


<body>

	<div class="bg_color1 border_end ">
		<!--背景色-->
		<div class="pagebody11 wid">
			<div class="pagebody11_top">
				<!--输入用户名-->
				<form id="searchStaffForm" name="searchStaffForm"
					action="${ctx}/staffManage/staffList.shtml" method="post">
					<ul>
						<li class="name">输入员工姓名</li>
						<li><input type="text" name="username" id="username"
							class="cha1" value="${page.t.username}" /></li>
						<li><input class="button" type="submit" name="button"
							id="button" value="查找" style="cursor: pointer;" /></li>
						<li onclick="addStaff();"><input class="button2"
							type="button" name="button" id="button" value="新增用户"
							style="cursor: pointer;" /></li>
					</ul>
				</form>
			</div>
			<!--输入用户名-->
			<div class="pagebody11_table">
				<table width="1000" border="0" class=" bg_color5 dsfd">
					<tr>
						<td width="45">序号</td>
						<td width="80">员工姓名</td>
						<td width="100">用户名</td>
						<td width="100">手机号</td>
						<td width="120">IM号码</td>
						<td width="100">QQ号码</td>
						<td width="80">负责人</td>
						<td width="80">管理级别</td>
						<td width="60">状态</td>
						<td width="100">创建时间</td>
						<td width="80">操作</td>
					</tr>
				</table>
				<div class="pagebody11_bg" style="height: 500px">
					<table width="1000" border="0" class="dsfd yuan">
						<c:forEach var="staff" items="${page.list}" varStatus="status">
							<tr>
								<td width="45">${status.index+1}</td>
								<td width="80">${staff.username}</td>
								<td width="100">${staff.loginName}</td>
								<td width="100">${staff.phone}</td>
								<td width="120">${staff.im}</td>
								<td width="100">${staff.qq}</td>
								<td width="80">${staff.leader}</td>
								<td width="80"><c:if test="${staff.level==2}">普通员工</c:if>
									<c:if test="${staff.level==1}">管理员</c:if></td>
								<td width="60"><c:if test="${staff.status==0}">在职</c:if>
									<c:if test="${staff.status==1}">
										<span style="color: red">离职</span>
									</c:if></td>
								<td width="100"><fmt:formatDate value="${staff.createTime}"
										pattern="yyyy-MM-dd" /></td>
								<td width="80" onclick="editStaff('${staff.id}');"
									style="cursor: pointer;">编辑<img
									src="${ctx}/images/icon019.png"></td>
							</tr>
						</c:forEach>
					</table>
					<div class="pageTab">
						<!--翻页按钮-->
						<ul class="page">
							<pg:pager url="${ctx}/staffManage/staffList.shtml"
								items="${page.totalRows}" export="currentPageNumber=pageNumber">
								<pg:param name="username" value="${page.t.username}" />
								<pg:pages>
									<c:choose>
										<c:when test="${currentPageNumber eq pageNumber }">
											<a href="#"
												style="background: #C30D23 none repeat scroll 0% 0%; color: #ffffff;">${pageNumber }</a>
										</c:when>
										<c:otherwise>
											<a href="${pageUrl }">${pageNumber }</a>
										</c:otherwise>
									</c:choose>
								</pg:pages>
							</pg:pager>
						</ul>
						<div class="clear"></div>
					</div>
					<!--翻页按钮-->
				</div>
			</div>

		</div>
	</div>
	<!--背景色-->
	<div class="bg_color2">
		<!--end底部-->
		<div class="footer wid">Copyright © 2014-2024 www.xiupeilian.com
			All Rights Reserved. 修配连 版权所有</div>
		<!--end尾部-->
	</div>
</body>
</html>
