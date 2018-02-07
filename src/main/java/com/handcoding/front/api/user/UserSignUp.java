package com.handcoding.front.api.user;

import com.handcoding.front.domain.ResponseVO;
import com.handcoding.front.domain.in.InUserSignUpVO;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Header;
import retrofit2.http.POST;

/**
 * 기본사용자 회원가입 API
 * @author 이승환
 * @version 2018.01.28 v1.0
 */
public interface UserSignUp {
	
	/**
	 * 기본사용자 회원가입
	 * @param accessToken
	 * @param inUserSignUpVO
	 * @return
	 */
	@POST("/normal/v1.0/users")
	public Call<ResponseVO<Object>> signUp(@Header("accessToken") String accessToken, @Body InUserSignUpVO inUserSignUpVO);
	
}
