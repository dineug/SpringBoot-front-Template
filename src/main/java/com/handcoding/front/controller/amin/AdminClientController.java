package com.handcoding.front.controller.amin;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.handcoding.front.component.ClientComponent;
import com.handcoding.front.domain.ApiClientAuthVO;
import com.handcoding.front.domain.ResponseVO;
import com.handcoding.front.domain.SearchVO;
import com.handcoding.front.domain.out.OutOauthClientApiAuthVO;

@Controller
@RequestMapping("/admin")
public class AdminClientController {

	@Autowired
	private ClientComponent client;
	
	/**
	 * client 리스트 처리
	 * @param session
	 * @param searchVO
	 * @return
	 */
	@PostMapping("/clients")
	@ResponseBody
	public ResponseVO<List<OutOauthClientApiAuthVO>> clients(SearchVO searchVO) {
		return client.getAdminClientClient().clientList(searchVO);
	}
	
	/**
	 * client API scope 변경 처리
	 * @param apiClientAuthVO
	 * @return
	 */
	@PutMapping("/clients/api")
	@ResponseBody
	public ResponseVO<Object> clientsApiUpdate(ApiClientAuthVO apiClientAuthVO) {
		return client.getAdminClientClient().clientApiUpdate(apiClientAuthVO);
	}
	
}
