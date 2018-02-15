package com.handcoding.front.domain;

import java.io.Serializable;

/**
 * token 자동 주입 식별 객체
 * @author 이승환
 * @version 2018.02.15 v1.0
 */
public class TokenVO implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	private String Token;

	public TokenVO() {}
	public TokenVO(String token) {
		Token = token;
	}
	public String getToken() {
		return Token;
	}
	public void setToken(String token) {
		Token = token;
	}
	@Override
	public String toString() {
		return "TokenVO [Token=" + Token + "]";
	}
}
