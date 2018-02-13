// 전역 객체
var hc = {};
// url에서 domain 반환
hc.domain = function() {
    var url = location.href;
    url = url.substr( url.indexOf( "//" ) + 2 );
    var uri = url.substr( url.indexOf( "/" ) );
    var index = uri.indexOf( "/" );
    var lastIndex = uri.lastIndexOf( "/" );
    uri = uri.substr(1);
    if ( index !== lastIndex ) {
        uri = uri.substr(0, uri.indexOf("/"));
    }
    return uri === '' ? 'user' : uri;
};
// 이전 페이지 url
hc.refer = function() {
	return document.referrer;
};
// 정규식
hc.re = {
		// 공백문자열
		space : /\s/g
};

var StringBuffer = function() {
	this.buffer = new Array();
};
StringBuffer.prototype.append = function(str) {
	this.buffer[this.buffer.length] = str;
};
StringBuffer.prototype.toString = function() {
	return this.buffer.join("");
};