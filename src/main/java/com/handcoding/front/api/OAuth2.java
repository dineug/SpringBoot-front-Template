package com.handcoding.front.api;

import com.handcoding.front.domain.OAuth2TokenVO;
import com.handcoding.front.domain.OAuth2VO;
import com.handcoding.front.domain.ResponseVO;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;

public interface OAuth2 {
	
	@POST("/system/oauth/token")
	public Call<ResponseVO<OAuth2TokenVO>> getOAuth(@Body OAuth2VO oAuth2VO);
	
}
