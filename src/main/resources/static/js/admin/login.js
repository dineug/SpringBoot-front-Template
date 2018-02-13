// onload
$(function(){
	var login = {
			id : '#inputID',
			pw : '#inputPassword',
			ms : '#loginMessage',
			btn : '#loginBtn'
	};
	// 엔터시 포커스 이동
	$(login.id).keyup(function(e){
		if(e.keyCode == 13) {
			$(this).val($(this).val().toLowerCase());
			$(login.pw).focus();
		}
	});
	// 엔터시 login 버튼 클릭
	$(login.pw).keyup(function(e){
		if(e.keyCode == 13) {
			$(login.btn).trigger('click');
		}
	});
	// 로그인 처리
	$(login.btn).click(function(){
		var reSpace = hc.re.space;
		var id = $(login.id).val().replace(reSpace,'');
		var pw = $(login.pw).val().replace(reSpace,'');
		if(id === ''){
			$(login.ms).css('color','red').html('아이디를 기입해주세요.');
			$(login.id).focus();
			return false;
		}else if(pw === ''){
			$(login.ms).css('color','red').html('비밀번호를 기입해주세요.');
			$(login.pw).focus();
			return false;
		}else {
			$.ajax({
				url: '/admin/p/login',
				type: 'post',
				data: {
					id: id,
					pw: pw
				},
				success :function(obj){
					if(obj.check) {
						location.href = '/admin';
					}else {
						$(login.ms).css('color','red').html('로그인 실패');
					}
				}
			});
		}
	});
});