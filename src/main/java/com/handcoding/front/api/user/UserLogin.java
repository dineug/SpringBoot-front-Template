package com.handcoding.front.api.user;

import com.handcoding.front.domain.ResponseVO;
import com.handcoding.front.domain.in.InUserLoginVO;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Header;
import retrofit2.http.POST;
import retrofit2.http.Path;

/**
 * 기본사용자 로그인 API
 * @author 이승환
 * @version 2018.01.30 v1.0
 */
public interface UserLogin {
	
	/**
	 * 기본사용자 로그인
	 * @param accessToken
	 * @param id
	 * @param inUserLoginVO
	 * @return token
	 */
	@POST("/normal/v1.0/users/{id}/login")
	public Call<ResponseVO<String>> login(@Header("accessToken") String accessToken, @Path("id") String id, @Body InUserLoginVO inUserLoginVO);
	
}
