<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<jsp:include page="../common/headLink.jsp" />
	<link rel="stylesheet" href="/res/css/login.css">
	<script src="/res/js/admin/login.js"></script>
</head>
<body class="hold-transition skin-blue sidebar-mini">
	<section class="input_login_wrap">
          <!-- Horizontal Form -->
          <div class="box box-info">
            <div class="box-header with-border">
              <h3 class="box-title">관리자 로그인</h3>
            </div>
            <!-- /.box-header -->
            <!-- form start -->
            <form class="form-horizontal">
              <div class="box-body">
                <div class="form-group">
                  <label for="inputID" class="col-sm-2 control-label">ID</label>

                  <div class="col-sm-10">
                    <input type="text" class="form-control" id="inputID" placeholder="ID">
                  </div>
                </div>
                <div class="form-group">
                  <label for="inputPassword" class="col-sm-2 control-label">Password</label>

                  <div class="col-sm-10">
                    <input type="password" class="form-control" id="inputPassword" placeholder="Password">
                  </div>
                </div>
                <div class="form-group">
                  <div class="col-sm-offset-2 col-sm-10" id="loginMessage"></div>
                </div>
              </div>
              <!-- /.box-body -->
              <div class="box-footer">
                <button type="button" class="btn btn-info pull-right" id="loginBtn">로그인</button>
              </div>
              <!-- /.box-footer -->
            </form>
          </div>
	</section>
	<div class="wrapper" style="overflow-y: hidden;">
		<jsp:include page="../common/header.jsp" />
		<jsp:include page="./sidebar.jsp" />
		<jsp:include page="../common/control_sidebar.jsp" />


		<!-- Content Wrapper. Contains page content -->
		<div class="content-wrapper">
			<!-- Content Header (Page header) -->
			<section class="content-header"></section>

			<!-- Main content -->
			<section class="content container-fluid"></section>
			<!-- /.content -->
		</div>
		<!-- /.content-wrapper -->


		<jsp:include page="../common/footer.jsp" />
	</div>
</body>
</html>