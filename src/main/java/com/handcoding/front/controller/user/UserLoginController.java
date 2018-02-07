package com.handcoding.front.controller.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.handcoding.front.component.ClientComponent;

@Controller
@RequestMapping("/user")
public class UserLoginController {
	
	@Autowired
	private ClientComponent client;
	
}
