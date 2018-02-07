package com.handcoding.front.domain;

/**
 * OAuth2.0 getToken VO
 * @author 이승환
 * @version 2018.02.02 v1.0
 */
public class OAuth2VO {
	
	private String client_id;
	private String client_secret;
	
	public OAuth2VO(String client_id, String client_secret) {
		this.client_id = client_id;
		this.client_secret = client_secret;
	}
	public String getClient_id() {
		return client_id;
	}
	public void setClient_id(String client_id) {
		this.client_id = client_id;
	}
	public String getClient_secret() {
		return client_secret;
	}
	public void setClient_secret(String client_secret) {
		this.client_secret = client_secret;
	}
}
