package com.handcoding.front.domain;

public class ApiVO {
	
	private String apiTypeCode;
	private String url;
	private String method;
	private String notes;
	private String scope;
	
	public String getApiTypeCode() {
		return apiTypeCode;
	}
	public void setApiTypeCode(String apiTypeCode) {
		this.apiTypeCode = apiTypeCode;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public String getMethod() {
		return method;
	}
	public void setMethod(String method) {
		this.method = method;
	}
	public String getNotes() {
		return notes;
	}
	public void setNotes(String notes) {
		this.notes = notes;
	}
	public String getScope() {
		return scope;
	}
	public void setScope(String scope) {
		this.scope = scope;
	}
	@Override
	public String toString() {
		return "ApiVO [apiTypeCode=" + apiTypeCode + ", url=" + url + ", method=" + method + ", notes=" + notes
				+ ", scope=" + scope + "]";
	}
}
