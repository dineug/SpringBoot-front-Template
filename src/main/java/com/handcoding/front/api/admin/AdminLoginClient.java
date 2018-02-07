package com.handcoding.front.api.admin;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.handcoding.front.component.CommonComponent;
import com.handcoding.front.domain.ResponseVO;
import com.handcoding.front.domain.in.InUserLoginVO;

/**
 * 관리자 로그인 API
 * @author 이승환
 * @version 2018.02.02 v1.0
 */
@Component
public class AdminLoginClient {
	
	@Autowired
	private CommonComponent common;
	
	private AdminLoginAPI create() {
		return new AdminLoginAPI(common.getConfig().getClientId(), common.getConfig().getClientSecret());
	}
	
	/**
	 * 관리자 로그인
	 * @param inUserLoginVO
	 * @return token
	 */
	public ResponseVO<String> login(InUserLoginVO inUserLoginVO) {
		return create().login(inUserLoginVO);
	}
	
}
