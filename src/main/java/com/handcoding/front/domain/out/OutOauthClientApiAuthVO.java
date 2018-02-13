package com.handcoding.front.domain.out;

import java.util.List;

import com.handcoding.front.domain.ApiVO;
import com.handcoding.front.domain.OauthClientDetailsVO;

public class OutOauthClientApiAuthVO extends OauthClientDetailsVO {
	
	private List<ApiVO> apiVO;

	public List<ApiVO> getApiVO() {
		return apiVO;
	}
	public void setApiVO(List<ApiVO> apiVO) {
		this.apiVO = apiVO;
	}
	@Override
	public String toString() {
		return "OutOauthClientApiAuthVO [apiVO=" + apiVO + "]";
	}
}
