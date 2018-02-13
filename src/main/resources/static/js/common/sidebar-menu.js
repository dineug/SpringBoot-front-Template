// onload
$(function(){
	// 사이드바 메뉴 active 이벤트
	$('.sidebar-menu > li:not(.header)').click(function(e){
		e.preventDefault();
		$('.sidebar-menu > li:not(.header)').removeClass('active');
		$(this).addClass('active');
	});
});