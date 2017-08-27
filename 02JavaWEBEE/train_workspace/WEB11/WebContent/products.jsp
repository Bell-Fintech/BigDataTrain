<%@ page language="Java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	<%@taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c"%>
	
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<link rel="shortcut icon" href="favicon.ico">
<link href="css/bootstrap.min14ed.css?v=3.3.6" rel="stylesheet">
<link href="css/font-awesome.min93e3.css?v=4.4.0" rel="stylesheet">
<link href="css/plugins/iCheck/custom.css" rel="stylesheet">
<link href="css/animate.min.css" rel="stylesheet">
<link href="css/style.min862f.css?v=4.1.0" rel="stylesheet">
</head>
<script src="js/jquery.min.js?v=2.1.4"></script>
	<script src="js/bootstrap.min.js?v=3.3.6"></script>
	<script src="js/plugins/peity/jquery.peity.min.js"></script>
	<script src="js/content.min.js?v=1.0.0"></script>
	<script src="js/plugins/iCheck/icheck.min.js"></script>
	<script src="js/demo/peity-demo.min.js"></script>
	<script>
		$(document).ready(function() {
			$(".i-checks").iCheck({
				checkboxClass : "icheckbox_square-green",
				radioClass : "iradio_square-green",
			})
		});
	</script>

<body class="gray-bg">
	<div class="wrapper wrapper-content animated fadeInRight">

		<div class="row">
			<div class="col-sm-12">
				<div class="ibox float-e-margins">
					<div class="ibox-title">
						<h5>商品列表展示</h5>
						<div class="ibox-tools">
							<a class="collapse-link"> <i class="fa fa-chevron-up"></i>
							</a> <a class="close-link"> <i class="fa fa-times"></i>
							</a>
						</div>
					</div>
					<div class="ibox-content">
						<div class="row">

							<div class="col-sm-7">
							<form action="/com.edu360/Sercher?md=sercher" method="post">
								<div class="input-group">
									<input type="text" placeholder="请输入商品名" name="sercher" class="form-control">
									<span class="input-group-btn">
										<button type="submit" class="btn btn-primary">搜索</button>
									</span>
								</div>
								</form>
							</div>
						</div>


						<table class="table table-bordered" id="prodctId">
							
								<tr>
									<th></th>
									<th>商品名称</th>
									<th>商品价格</th>
									<th>商品类目</th>
									<th>商品数量</th>
									<th>商品描述</th>
									<th>编辑</th>
								</tr>
							
							
							<form action="GetAllP" method="post">
							 <c:forEach var="list"  items="${plist }">
							 <tr>
							 <td><input type="checkbox"  name="n" value="${list.id }">
							<%--  <input type="hidden" name="id" value="${list.id }"> --%>
							 </td>
							 <td>${list.name }</td>
							 <td>${list.price }</td>
							 <td>${list.category }</td>
							 <td>${list.pnum }</td>
							 <td>${list.description }</td>
							 <td><a href="DeletServlet?id=${list.id }">删除</a>|<a href="ShowEdit?id=${list.id }">修改</a></td>
							 </tr>
							 </c:forEach>
							 <button type="submit" class="btn btn-primary">删除多个</button>
							</form>
							
						</table>

					</div>
				</div>
			</div>

		</div>
	</div>
	

</body>


<!-- Mirrored from www.zi-han.net/theme/hplus/table_basic.html by HTTrack Website Copier/3.x [XR&CO'2014], Wed, 20 Jan 2016 14:20:01 GMT -->
</html>
