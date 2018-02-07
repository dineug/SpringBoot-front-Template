package com.handcoding.front.controller.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.handcoding.front.component.ClientComponent;

/**
 * 회원가입 controller
 * @author 이승환
 * @version 2018.01.28 v1.0
 */
@Controller
@RequestMapping("/user")
public class UserSignUpController {
	
	@Autowired
	private ClientComponent client;
	
}
