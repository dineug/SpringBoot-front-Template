package com.handcoding.front.api.user;

import java.io.IOException;

import com.handcoding.front.api.EndpointAPI;
import com.handcoding.front.domain.ResponseVO;
import com.handcoding.front.domain.in.InUserSignUpVO;

import retrofit2.Call;
import retrofit2.Response;

/**
 * 기본사용자 회원가입 API
 * @author 이승환
 * @version 2018.01.28 v1.0
 */
public class UserSignUpAPI extends EndpointAPI<UserSignUp> {

	public UserSignUpAPI(String clientId, String clientSecret) {
		super(clientId, clientSecret);
	}

	@Override
	protected UserSignUp create() {
		return retrofit.create(UserSignUp.class);
	}
	
	/**
	 * 기본사용자 회원가입
	 * @param inUserSignUpVO
	 * @return
	 */
	public ResponseVO<Object> signUp(InUserSignUpVO inUserSignUpVO) {
		String accessToken = this.oauth();
		Call<ResponseVO<Object>> call = this.create().signUp(accessToken, inUserSignUpVO);
		try {
			Response<ResponseVO<Object>> resopnse = call.execute();
			if(resopnse.isSuccessful()) {
				return resopnse.body();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		return null;
	}
	
}
