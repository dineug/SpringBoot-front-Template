package com.handcoding.front.domain;

import java.io.Serializable;
import java.util.Date;

public class UserVO extends CommonVO implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	private String id;
	private String pw;
	private String name;
	private String email;
	private String userTypeCode;
	private String statusCode;
	private Date regDate;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPw() {
		return pw;
	}
	public void setPw(String pw) {
		this.pw = pw;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getUserTypeCode() {
		return userTypeCode;
	}
	public void setUserTypeCode(String userTypeCode) {
		this.userTypeCode = userTypeCode;
	}
	public String getStatusCode() {
		return statusCode;
	}
	public void setStatusCode(String statusCode) {
		this.statusCode = statusCode;
	}
	public Date getRegDate() {
		return regDate;
	}
	public void setRegDate(Date regDate) {
		this.regDate = regDate;
	}
	@Override
	public String toString() {
		return "UserVO [id=" + id + ", name=" + name + ", email=" + email + ", userTypeCode="
				+ userTypeCode + ", statusCode=" + statusCode + ", regDate=" + regDate + "]";
	}
}
