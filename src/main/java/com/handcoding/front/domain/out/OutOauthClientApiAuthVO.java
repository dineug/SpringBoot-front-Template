package com.handcoding.front.domain.out;

import java.util.List;

import com.handcoding.front.domain.ApiVO;
import com.handcoding.front.domain.OauthClientDetailsVO;

public class OutOauthClientApiAuthVO extends OauthClientDetailsVO {
	
	private List<ApiVO> apiList;

	public List<ApiVO> getApiList() {
		return apiList;
	}
	public void setApiList(List<ApiVO> apiList) {
		this.apiList = apiList;
	}
	@Override
	public String toString() {
		return "OutOauthClientApiAuthVO [apiList=" + apiList + "]";
	}
	
}
