package com.handcoding.front.api.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.handcoding.front.component.CommonComponent;
import com.handcoding.front.domain.ResponseVO;
import com.handcoding.front.domain.in.InUserSignUpVO;

/**
 * 기본사용자 회원가입 API
 * @author 이승환
 * @version 2018.01.28 v1.0
 */
@Component
public class UserSignUpClient {
	
	@Autowired
	private CommonComponent common;
	
	private UserSignUpAPI create() {
		return new UserSignUpAPI(common.getConfig().getClientId(), common.getConfig().getClientSecret());
	}
	
	/**
	 * 기본사용자 회원가입
	 * @param inUserSignUpVO
	 * @return
	 */
	public ResponseVO<Object> signUp(InUserSignUpVO inUserSignUpVO) {
		return create().signUp(inUserSignUpVO);
	}
	
}
