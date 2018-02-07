package com.handcoding.front.domain.in;

import com.handcoding.front.domain.UserVO;

public class InUserSignUpVO extends UserVO {
	
	private static final long serialVersionUID = 1L;
	
	private String emailConfirmUrl;
	
	public String getEmailConfirmUrl() {
		return emailConfirmUrl;
	}
	public void setEmailConfirmUrl(String emailConfirmUrl) {
		this.emailConfirmUrl = emailConfirmUrl;
	}
	@Override
	public String toString() {
		return "InUserSignUpVO [emailConfirmUrl=" + emailConfirmUrl + "]";
	}
}
