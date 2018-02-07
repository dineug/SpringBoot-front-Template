package com.handcoding.front.api.system;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.handcoding.front.component.CommonComponent;
import com.handcoding.front.domain.EmailConfirmVO;
import com.handcoding.front.domain.ResponseVO;

/**
 * 사용자 회원가입 시스템 API
 * @author 이승환
 * @version 2018.01.28 v1.0
 */
@Component
public class SystemSignUpClient {
	
	@Autowired
	private CommonComponent common;
	
	private SystemSignUpAPI create() {
		return new SystemSignUpAPI(common.getConfig().getClientId(), common.getConfig().getClientSecret());
	}
	
	/**
	 * 사용자 이메일인증
	 * @param emailConfirmVO
	 * @return
	 */
	public ResponseVO<Object> emailConfirm(EmailConfirmVO emailConfirmVO) {
		return create().emailConfirm(emailConfirmVO);
	}
	
}
