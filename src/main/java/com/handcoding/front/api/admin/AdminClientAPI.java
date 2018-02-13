package com.handcoding.front.api.admin;

import java.util.List;
import java.util.Map;

import com.handcoding.front.api.EndpointAPI;
import com.handcoding.front.domain.ResponseVO;
import com.handcoding.front.domain.SearchVO;
import com.handcoding.front.domain.out.OutOauthClientApiAuthVO;

import retrofit2.Call;
import retrofit2.Response;

/**
 * client API
 * @author 이승환
 * @version 2018.02.13 v1.0
 */
public class AdminClientAPI extends EndpointAPI<AdminClient>{

	public AdminClientAPI(String clientId, String clientSecret) {
		super(clientId, clientSecret);
	}

	@Override
	protected AdminClient create() {
		return retrofit.create(AdminClient.class);
	}
	
	/**
	 * client List 개별 API 리스트 정보 조회
	 * @param searchVO
	 * @return
	 */
	public ResponseVO<List<OutOauthClientApiAuthVO>> clientList(SearchVO searchVO) {
		String accessToken = this.oauth();
		try {
			Map<String, Object> map = objUtil.convertObjectToMap(searchVO);
			Call<ResponseVO<List<OutOauthClientApiAuthVO>>> call = this.create().clientList(accessToken, map);
			Response<ResponseVO<List<OutOauthClientApiAuthVO>>> resopnse = call.execute();
			if(resopnse.isSuccessful()) {
				return resopnse.body();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	
}
