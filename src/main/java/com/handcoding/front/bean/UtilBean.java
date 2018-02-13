package com.handcoding.front.bean;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Component;

/**
 * 유틸 빈
 * @author 이승환
 * @version 2018.02.13 v1.0
 */
@Component
public class UtilBean {
	
	/**
	 * 로그인시 접근 불가능 페이지 체크
	 * @param session
	 * @param domain
	 * @param view
	 * @return
	 */
	public String pageCheck(HttpSession session, String domain, String view) {
		boolean check = session.getAttribute(domain) != null;
		String redirect = "redirect:/"+domain;
		return check ? redirect : view;
	}
	
}
