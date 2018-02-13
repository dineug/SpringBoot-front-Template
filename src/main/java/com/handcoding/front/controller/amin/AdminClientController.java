package com.handcoding.front.controller.amin;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.handcoding.front.component.ClientComponent;
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
	public ResponseVO<List<OutOauthClientApiAuthVO>> clients(HttpSession session, SearchVO searchVO) {
		
		ResponseVO<List<OutOauthClientApiAuthVO>> respVO = client.getAdminClientClient().clientList(searchVO);
		
		return respVO;
	}
	
}
