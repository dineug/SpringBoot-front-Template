package com.handcoding.front.controller.amin;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/admin")
public class AdminLoginController {
	
	@GetMapping("/p/login")
	public String index() {
		return "admin/login";
	}
	
}
