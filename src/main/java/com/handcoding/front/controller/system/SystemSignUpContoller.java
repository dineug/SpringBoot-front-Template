package com.handcoding.front.controller.system;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.handcoding.front.component.ClientComponent;
import com.handcoding.front.domain.EmailConfirmVO;
import com.handcoding.front.domain.ResponseVO;

/**
 * 회원가입 controller
 * @author 이승환
 * @version 2018.01.28 v1.0
 */
@Controller
@RequestMapping("/system")
public class SystemSignUpContoller {
	
	@Autowired
	private ClientComponent client;
	
	/**
	 * 이메일 인증처리
	 * @param model
	 * @param emailConfirmVO
	 * @return
	 */
	@GetMapping("/p/emailConfirm")
	public String emailConfirm(Model model, EmailConfirmVO emailConfirmVO) {
		ResponseVO<Object> responseVO = null;
		responseVO = client.getSystemSignUpClient().emailConfirm(emailConfirmVO);
		model.addAttribute("response", responseVO);
		return "system/emailConfirm";
	}
	
}
