package com.handcoding.front.api.system;

import java.io.IOException;

import com.handcoding.front.api.EndpointAPI;
import com.handcoding.front.domain.EmailConfirmVO;
import com.handcoding.front.domain.ResponseVO;

import retrofit2.Call;
import retrofit2.Response;

/**
 * 사용자 회원가입 시스템 API
 * @author 이승환
 * @version 2018.01.28 v1.0
 */
public class SystemSignUpAPI extends EndpointAPI<SystemSignUp> {

	public SystemSignUpAPI(String clientId, String clientSecret) {
		super(clientId, clientSecret);
	}

	@Override
	protected SystemSignUp create() {
		return retrofit.create(SystemSignUp.class);
	}
	
	/**
	 * 사용자 이메일인증
	 * @param emailConfirmVO
	 * @return
	 */
	public ResponseVO<Object> emailConfirm(EmailConfirmVO emailConfirmVO) {
		String accessToken = this.oauth();
		Call<ResponseVO<Object>> call = this.create().emailConfirm(accessToken, emailConfirmVO);
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
