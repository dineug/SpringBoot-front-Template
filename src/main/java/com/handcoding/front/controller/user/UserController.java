package com.handcoding.front.controller.user;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * 시작페이지 controller
 * @author 이승환
 * @version 2018.02.07 v1.0
 */
@Controller
public class UserController {
	
	@GetMapping({"/user","/"})
	public String index() {
		return "user/index";
	}
	
}
