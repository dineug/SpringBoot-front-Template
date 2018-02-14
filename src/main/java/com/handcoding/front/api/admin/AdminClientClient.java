package com.handcoding.front.api.admin;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.handcoding.front.component.CommonComponent;
import com.handcoding.front.domain.ApiClientAuthVO;
import com.handcoding.front.domain.ResponseVO;
import com.handcoding.front.domain.SearchVO;
import com.handcoding.front.domain.out.OutOauthClientApiAuthVO;

/**
 * client API
 * @author 이승환
 * @version 2018.02.13 v1.0
 */
@Component
public class AdminClientClient {
	
	@Autowired
	private CommonComponent common;
	
	private AdminClientAPI create() {
		return new AdminClientAPI(common.getConfig().getClientId(), common.getConfig().getClientSecret());
	}
	
	/**
	 * client List 개별 API 리스트 정보 조회
	 * @param searchVO
	 * @return
	 */
	public ResponseVO<List<OutOauthClientApiAuthVO>> clientList(SearchVO searchVO) {
		return create().clientList(searchVO);
	}
	
	/**
	 * client API scope 변경
	 * @param apiClientAuthVO
	 * @return
	 */
	public ResponseVO<Object> clientApiUpdate(ApiClientAuthVO apiClientAuthVO) {
		return create().clientApiUpdate(apiClientAuthVO);
	}
	
}
