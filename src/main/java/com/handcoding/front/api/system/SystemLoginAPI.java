package com.handcoding.front.api.system;

import java.io.IOException;

import com.handcoding.front.api.EndpointAPI;
import com.handcoding.front.domain.ResponseVO;
import com.handcoding.front.domain.UserVO;

import retrofit2.Call;
import retrofit2.Response;

/**
 * 사용자 로그인 시스템 API
 * @author 이승환
 * @version 2018.01.30 v1.0
 */
public class SystemLoginAPI extends EndpointAPI<SystemLogin> {

	public SystemLoginAPI(String clientId, String clientSecret) {
		super(clientId, clientSecret);
	}

	@Override
	protected SystemLogin create() {
		return retrofit.create(SystemLogin.class);
	}
	
	/**
	 * 사용자 정보
	 * @param token
	 * @return
	 */
	public ResponseVO<UserVO> getUser(String token) {
		String accessToken = this.oauth();
		Call<ResponseVO<UserVO>> call = this.create().getUser(accessToken, token);
		try {
			Response<ResponseVO<UserVO>> resopnse = call.execute();
			return resopnse.body();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return new ResponseVO<>(false);
	}
	
}
