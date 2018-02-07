package com.handcoding.front.api.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.handcoding.front.component.CommonComponent;
import com.handcoding.front.domain.ResponseVO;
import com.handcoding.front.domain.in.InUserLoginVO;

/**
 * 기본사용자 로그인 API
 * @author 이승환
 * @version 2018.01.30 v1.0
 */
@Component
public class UserLoginClient {
	
	@Autowired
	private CommonComponent common;
	
	private UserLoginAPI create() {
		return new UserLoginAPI(common.getConfig().getClientId(), common.getConfig().getClientSecret());
	}
	
	/**
	 * 기본사용자 로그인
	 * @param inUserLoginVO
	 * @return token
	 */
	public ResponseVO<String> login(InUserLoginVO inUserLoginVO) {
		return create().login(inUserLoginVO);
	}
	
}
