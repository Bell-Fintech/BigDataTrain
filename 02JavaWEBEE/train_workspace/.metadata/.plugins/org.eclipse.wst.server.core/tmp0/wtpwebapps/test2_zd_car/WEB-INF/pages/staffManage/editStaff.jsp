<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<%@ page language="java" pageEncoding="UTF-8" contentType="text/html; charset=UTF-8"%>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>修配连汽配市场</title>
<link href="${ctx}/css/index.css" rel="stylesheet" type="text/css" />
<link href="${ctx}/css/style.css" rel="stylesheet" type="text/css" />


</head>
<body style="background: rgba(255,255,255,1);">
<div class="wid mar5">
	<div class="pagebody"><h3>汽配商用户管理</h3></div>
    <div class="pagebody12">
   	    <h>编辑用户内容</h>
        <form action="${ctx}/staffManagementAction.do?method=saveStaff" method="post" onsubmit="return postform();">
        <ul>
            <table width="90" class="fl pagebody12_left">
              <tr class="border_end">
                <td width="90" height="50" align="left" valign="middle">企业编号</td>
              </tr>
              <tr class="border_end">
                <td width="90" height="50" align="left" valign="middle">汽配商名称</td>
              </tr>
              <tr class="border_end">
                <td width="90" height="50" align="left" valign="middle">地址</td>
              </tr>
              <tr class="border_end">
                <td width="90" height="50" align="left" valign="middle">省</td>
              </tr>
              <tr class="border_end">
                <td width="90" height="50" align="left" valign="middle">市</td>
              </tr>
              <tr>
                <td width="90" height="50" align="left" valign="middle">区/县</td>
              </tr>
              <tr>
                <td width="90" height="50" align="left" valign="middle">手机号</td>
              </tr>
               <tr>
                <td width="90" height="50" align="left" valign="middle">IM号码</td>
              </tr>
              <tr>
                <td width="90" height="50" align="left" valign="middle">QQ号码</td>
              </tr>
               <tr>
                <td width="90" height="50" align="left" valign="middle">负责人</td>
              </tr> 
              <c:if test="${user.manageLevel==2}">
              <tr>
                <td width="90" height="50" align="left" valign="middle">状态</td>
              </tr>
              </c:if>
              <tr>
                <td width="90" height="50" align="left" valign="middle">&nbsp;</td>
              </tr>
            </table>
            <table width="290" class="fl pagebody12_right">
              <tr class="border_end">
                <td width="290" height="50">${salebusiness.companycode}</td>
              </tr>
              <tr class="border_end">
                <td width="290" height="50">${salebusiness.companyname}</td>
              </tr>
              <tr class="border_end">
                <td width="290" height="50">${salebusiness.address}</td>
              </tr>
              <tr class="border_end">
                <td width="290" height="50">北京</td>
              </tr>
              <tr class="border_end">
                <td width="290" height="50">北京</td>
              </tr>
              <tr>
                <td width="290" height="50">朝阳区 </td>
              </tr>
              <tr>
                <td width="290" height="50">
                <input type="hidden" name="id" id="id"  value="${user.id}"/>
                <input type="text" name="telnum" id="sj" class="text" value="${user.telnum}" /></td>
              </tr>
              <tr>
                <td width="290" height="50">
                <input type="text" name="im" id="im" class="text"  value="${user.im}"/></td>
              </tr>
               <tr>
                <td width="290" height="50">
                <input type="text" name="qq" id="qq" class="text"  value="${user.qq}"/></td>
              </tr>
              <tr>
                <td width="290" height="50">
                <input type="text" name="leader" id="textfield3" class="text" value="${user.leader}" /></td>
              </tr>
              <c:if test="${user.manageLevel==2
              
              
              
              
              }">
              <tr>
              
              <c:if test="${user.userStatus==1}">
                <td width="290" height="50">
                    <li>在职<input type="radio" name="userStatus" id="radio" value="1"  checked/><label for="radio"></label></li>
                    <li>离职<input type="radio" name="userStatus" id="radio1" value="2" /><label for="radio"></label></li>
                </td>
                </c:if>
                    <c:if test="${user.userStatus==2}">
                <td width="290" height="50">
                    <li>在职<input type="radio" name="userStatus" id="radio" value="1"  /><label for="radio"></label></li>
                    <li>离职<input type="radio" name="userStatus" id="radio1" value="2" checked/><label for="radio"></label></li>
                </td>
                </c:if>
              </tr>
              </c:if>
              <tr>
                <td width="290" height="50"><input class="baocun" type="submit" name="button" id="button" value="保&nbsp;&nbsp;存" /></td>
              </tr>
            </table>
			<div class="clear"></div>
        </ul>
        </form>
    </div>
    <div class="clear"></div>
</div>
<script type="text/javascript" src="js/jquery.js"></script>
<script>
    function dyfrom_mobile(mobile) {
        var length = mobile.length;
        return length == 11 && /^(13|14|15|17|18)[0-9]{9}$/.test(mobile);
    }
    function dyfrom_qq(qq){
        return reQQ=/^[1-9]\d{4,9}$/.test(qq);
    }
    function postform(){
        mobile=$("#sj").val();
        qq=$("#qq").val();
        if(!dyfrom_mobile(mobile)){
            alert('手机填写不正确！');
            return false;
        }
        if(!dyfrom_qq(qq)){
           alert("请输入正确的QQ号");
           return false;
        }
        return true;
    }
</script>
</body>
</html>

