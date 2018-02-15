package com.handcoding.front.controller.amin;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.handcoding.front.annotation.AdminUser;
import com.handcoding.front.domain.UserVO;

/**
 * 시작페이지 controller
 * @author 이승환
 * @version 2018.02.12 v1.0
 */
@Controller
public class AdminController {
	
	@GetMapping("/admin")
	public String index(@AdminUser UserVO userVO, Model model) {
		model.addAttribute("user", userVO);
		return "admin/index";
	}
	
}
