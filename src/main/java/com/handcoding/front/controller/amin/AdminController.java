package com.handcoding.front.controller.amin;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * 시작페이지 controller
 * @author 이승환
 * @version 2018.02.12 v1.0
 */
@Controller
public class AdminController {
	
	@GetMapping("/admin")
	public String index() {
		return "admin/index";
	}
	
}
