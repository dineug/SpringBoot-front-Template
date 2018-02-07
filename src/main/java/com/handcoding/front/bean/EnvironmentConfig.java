package com.handcoding.front.bean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * application.properties
 * @author 이승환
 * @version 2018.01.28 v1.0
 */
@Component
public class EnvironmentConfig {
	
	@Value("${handcoding.api.clientId}")
	private String clientId;
	
	@Value("${handcoding.api.clientSecret}")
	private String clientSecret;

	public String getClientId() {
		return clientId;
	}
	public String getClientSecret() {
		return clientSecret;
	}
	
}
