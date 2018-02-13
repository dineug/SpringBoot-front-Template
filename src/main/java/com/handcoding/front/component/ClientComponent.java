package com.handcoding.front.component;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.handcoding.front.api.admin.AdminClientClient;
import com.handcoding.front.api.admin.AdminLoginClient;
import com.handcoding.front.api.system.SystemLoginClient;
import com.handcoding.front.api.system.SystemSignUpClient;
import com.handcoding.front.api.user.UserLoginClient;
import com.handcoding.front.api.user.UserSignUpClient;

/**
 * API client component
 * @author 이승환
 * @version 2018.01.28 v1.0
 */
@Component
public class ClientComponent {
	
	// user
	@Autowired
	private UserSignUpClient userSignUpClient;
	@Autowired
	private UserLoginClient userLoginClient;
	
	// system
	@Autowired
	private SystemSignUpClient systemSignUpClient;
	@Autowired
	private SystemLoginClient systemLoginClient;
	
	// admin
	@Autowired
	private AdminLoginClient adminLoginClient;
	@Autowired
	private AdminClientClient adminClientClient;
	
	
	public UserSignUpClient getUserSignUpClient() {
		return userSignUpClient;
	}
	public UserLoginClient getUserLoginClient() {
		return userLoginClient;
	}
	public SystemSignUpClient getSystemSignUpClient() {
		return systemSignUpClient;
	}
	public SystemLoginClient getSystemLoginClient() {
		return systemLoginClient;
	}
	public AdminLoginClient getAdminLoginClient() {
		return adminLoginClient;
	}
	public AdminClientClient getAdminClientClient() {
		return adminClientClient;
	}
	
}
