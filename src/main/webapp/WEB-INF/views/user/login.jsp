<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<jsp:include page="../common/headLink.jsp" />
	<link rel="stylesheet" href="/res/css/login.css">
</head>
<body class="hold-transition skin-blue sidebar-mini">
	<section class="input_login_wrap">
		<div></div>
	</section>
	<div class="wrapper" style="overflow-y: hidden;">
		<jsp:include page="../common/header.jsp" />
		<jsp:include page="./sidebar.jsp" />
		<jsp:include page="../common/control_sidebar.jsp" />


		<!-- Content Wrapper. Contains page content -->
		<div class="content-wrapper">
			<!-- Content Header (Page header) -->
			<section class="content-header">
				<h1>
					Page Header <small>Optional description</small>
				</h1>
			</section>

			<!-- Main content -->
			<section class="content container-fluid">

				<div id="root"></div>
				

				<!--------------------------
		        | Your Page Content Here |
		        -------------------------->

			</section>
			<!-- /.content -->
		</div>
		<!-- /.content-wrapper -->


		<jsp:include page="../common/footer.jsp" />
	</div>
</body>
</html>