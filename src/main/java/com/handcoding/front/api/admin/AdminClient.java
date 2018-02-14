package com.handcoding.front.api.admin;

import java.util.List;
import java.util.Map;

import com.handcoding.front.domain.ApiClientAuthVO;
import com.handcoding.front.domain.ResponseVO;
import com.handcoding.front.domain.out.OutOauthClientApiAuthVO;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.PUT;
import retrofit2.http.QueryMap;

/**
 * client API
 * @author 이승환
 * @version 2018.02.13 v1.0
 */
public interface AdminClient {
	
	/**
	 * client List 개별 API 리스트 정보 조회
	 * @param accessToken
	 * @param map
	 * @return
	 */
	@GET("/admin/v1.0/clients")
	public Call<ResponseVO<List<OutOauthClientApiAuthVO>>> clientList(@Header("accessToken") String accessToken, @QueryMap Map<String, Object> map);
	
	/**
	 * client API scope 변경
	 * @param accessToken
	 * @param apiClientAuthVO
	 * @return
	 */
	@PUT("/admin/v1.0/clients/api")
	public Call<ResponseVO<Object>> clientApiUpdate(@Header("accessToken") String accessToken, @Body ApiClientAuthVO apiClientAuthVO);
	
}
