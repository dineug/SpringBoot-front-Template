package com.handcoding.front.controller.amin;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.handcoding.front.component.ClientComponent;
import com.handcoding.front.component.CommonComponent;
import com.handcoding.front.domain.ResponseVO;
import com.handcoding.front.domain.UserVO;
import com.handcoding.front.domain.in.InUserLoginVO;

@Controller
@RequestMapping("/admin")
public class AdminLoginController {
	
	@Autowired
	private ClientComponent client;
	
	@Autowired
	private CommonComponent common;
	
	/**
	 * 로그인 페이지
	 * @param session
	 * @return view
	 */
	@GetMapping("/p/login")
	public String loginPage(HttpSession session) {
		return common.getUtil().pageCheck(session, "admin", "admin/login");
	}
	
	/**
	 * 로그인 처리
	 * @param session
	 * @param inUserLoginVO
	 * @return
	 */
	@PostMapping("/p/login")
	@ResponseBody
	public ResponseVO<String> login(HttpSession session, InUserLoginVO inUserLoginVO) {
		ResponseVO<String> respVO = client.getAdminLoginClient().login(inUserLoginVO);
		if(respVO.isCheck()) {
			ResponseVO<UserVO> userVO = client.getSystemLoginClient().getUser(respVO.getResponse());
			session.setAttribute("admin", userVO.getResponse());
			session.setAttribute("adminToken", respVO.getResponse());
		}
		respVO.setResponse(null);
		return respVO;
	}
	
	/**
	 * 로그아웃 처리 및 페이지
	 * @param session
	 * @return view
	 */
	@GetMapping("/logout")
	public String logout(HttpSession session) {
		// 현재 user와 admin이 같이 쓰기때문에 개별로 지움
		session.removeAttribute("admin");
		session.removeAttribute("adminToken");
//		session.invalidate();
		return "admin/login";
	}
	
}
