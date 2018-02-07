package com.handcoding.front.api.user;

import java.io.IOException;

import com.handcoding.front.api.EndpointAPI;
import com.handcoding.front.domain.ResponseVO;
import com.handcoding.front.domain.in.InUserLoginVO;

import retrofit2.Call;
import retrofit2.Response;

/**
 * 기본사용자 로그인 API
 * @author 이승환
 * @version 2018.01.30 v1.0
 */
public class UserLoginAPI extends EndpointAPI<UserLogin>{

	public UserLoginAPI(String clientId, String clientSecret) {
		super(clientId, clientSecret);
	}

	@Override
	protected UserLogin create() {
		return retrofit.create(UserLogin.class);
	}
	
	/**
	 * 기본사용자 로그인
	 * @param inUserLoginVO
	 * @return token
	 */
	public ResponseVO<String> login(InUserLoginVO inUserLoginVO) {
		String accessToken = this.oauth();
		Call<ResponseVO<String>> call = this.create().login(accessToken, inUserLoginVO.getId(), inUserLoginVO);
		try {
			Response<ResponseVO<String>> resopnse = call.execute();
			if(resopnse.isSuccessful()) {
				return resopnse.body();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		return null;
	}
	
}
