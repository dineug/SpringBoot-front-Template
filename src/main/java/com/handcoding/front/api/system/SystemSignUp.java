package com.handcoding.front.api.system;

import com.handcoding.front.domain.EmailConfirmVO;
import com.handcoding.front.domain.ResponseVO;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Header;
import retrofit2.http.PUT;

/**
 * 사용자 회원가입 시스템 API
 * @author 이승환
 * @version 2018.01.28 v1.0
 */
public interface SystemSignUp {
	
	/**
	 * 사용자 이메일인증
	 * @param accessToken
	 * @param emailConfirmVO
	 * @return
	 */
	@PUT("/system/v1.0/users/emailconfirm")
	public Call<ResponseVO<Object>> emailConfirm(@Header("accessToken") String accessToken, @Body EmailConfirmVO emailConfirmVO);
	
}
