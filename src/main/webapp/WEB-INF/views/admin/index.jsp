<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<jsp:include page="../common/headLink.jsp" />
	<!-- React -->
	<script src="/res/bundle.js"></script>
</head>
<body class="hold-transition skin-blue sidebar-mini">
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
	
<div class="modal fade" id="apiList" style="display: none;">
  <div class="modal-dialog modal-lg">
	<div class="modal-content">
	  <div class="modal-header">
		<button type="button" class="close" data-dismiss="modal" aria-label="Close">
		  <span aria-hidden="true">×</span></button>
		<h4 class="modal-title">API</h4>
	  </div>
	  <div class="modal-body"></div>
	  <div class="modal-footer">
		<button type="button" class="btn btn-default pull-left" data-dismiss="modal">Close</button>
	  </div>
	</div>
  </div>
</div>
	
</body>
</html>