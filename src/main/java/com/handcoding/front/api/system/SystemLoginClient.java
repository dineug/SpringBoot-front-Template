package com.handcoding.front.api.system;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.handcoding.front.component.CommonComponent;
import com.handcoding.front.domain.ResponseVO;
import com.handcoding.front.domain.UserVO;

/**
 * 사용자 로그인 시스템 API
 * @author 이승환
 * @version 2018.01.30 v1.0
 */
@Component
public class SystemLoginClient {
	
	@Autowired
	private CommonComponent common;
	
	private SystemLoginAPI create() {
		return new SystemLoginAPI(common.getConfig().getClientId(), common.getConfig().getClientSecret());
	}
	
	/**
	 * 사용자 정보
	 * @param token
	 * @return
	 */
	public ResponseVO<UserVO> getUser(String token) {
		return create().getUser(token);
	}
	
}
