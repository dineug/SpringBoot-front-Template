var hc = {};
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
}

var StringBuffer = function() {
	this.buffer = new Array();
};
StringBuffer.prototype.append = function(str) {
	this.buffer[this.buffer.length] = str;
};
StringBuffer.prototype.toString = function() {
	return this.buffer.join("");
};