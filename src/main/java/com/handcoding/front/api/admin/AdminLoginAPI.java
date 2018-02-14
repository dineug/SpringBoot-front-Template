package com.handcoding.front.api.admin;

import java.io.IOException;

import com.handcoding.front.api.EndpointAPI;
import com.handcoding.front.domain.ResponseVO;
import com.handcoding.front.domain.in.InUserLoginVO;

import retrofit2.Call;
import retrofit2.Response;

/**
 * 관리자 로그인 API
 * @author 이승환
 * @version 2018.02.02 v1.0
 */
public class AdminLoginAPI extends EndpointAPI<AdminLogin>{

	public AdminLoginAPI(String clientId, String clientSecret) {
		super(clientId, clientSecret);
	}

	@Override
	protected AdminLogin create() {
		return retrofit.create(AdminLogin.class);
	}
	
	/**
	 * 관리자 로그인
	 * @param inUserLoginVO
	 * @return token
	 */
	public ResponseVO<String> login(InUserLoginVO inUserLoginVO) {
		String accessToken = this.oauth();
		Call<ResponseVO<String>> call = this.create().login(accessToken, inUserLoginVO.getId(), inUserLoginVO);
		try {
			Response<ResponseVO<String>> resopnse = call.execute();
			return resopnse.body();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return new ResponseVO<>(false);
	}
	
}
