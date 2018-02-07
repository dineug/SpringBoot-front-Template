package com.handcoding.front.api.system;

import com.handcoding.front.domain.ResponseVO;
import com.handcoding.front.domain.UserVO;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Header;

/**
 * 사용자 로그인 시스템 API
 * @author 이승환
 * @version 2018.01.30 v1.0
 */
public interface SystemLogin {
	
	/**
	 * 사용자 정보
	 * @param accessToken
	 * @param token
	 * @return
	 */
	@GET("/system/v1.0/users/token")
	public Call<ResponseVO<UserVO>> getUser(@Header("accessToken") String accessToken, @Header("token") String token);
	
}
