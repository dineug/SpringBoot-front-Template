package com.handcoding.front.domain;

import java.util.Date;

public class EmailConfirmVO {
	
	private String emailKey;
	private String id;
	private String userTypeCode;
	private Date regDate;
	private Date expiredDate;
	
	public String getEmailKey() {
		return emailKey;
	}
	public void setEmailKey(String emailKey) {
		this.emailKey = emailKey;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getUserTypeCode() {
		return userTypeCode;
	}
	public void setUserTypeCode(String userTypeCode) {
		this.userTypeCode = userTypeCode;
	}
	public Date getRegDate() {
		return regDate;
	}
	public void setRegDate(Date regDate) {
		this.regDate = regDate;
	}
	public Date getExpiredDate() {
		return expiredDate;
	}
	public void setExpiredDate(Date expiredDate) {
		this.expiredDate = expiredDate;
	}
	@Override
	public String toString() {
		return "EmailConfirmVO [emailKey=" + emailKey + ", id=" + id + ", userTypeCode=" + userTypeCode + ", regDate="
				+ regDate + ", expiredDate=" + expiredDate + "]";
	}
}
