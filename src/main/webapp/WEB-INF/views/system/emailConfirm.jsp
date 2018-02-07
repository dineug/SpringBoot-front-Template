<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script src="/res/js/common/jquery-3.2.1.min.js"></script>
<script type="text/javascript">
	var check = '${response.check}'
	if(check == 'true') {
		alert('이메일 인증 성공')
		location.replace('/user')
	}else {
		alert('이메일 인증 실패')
		window.close()
	}
</script>
</head>
<body>
</body>
</html>