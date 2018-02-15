package com.handcoding.front.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import com.handcoding.front.component.ClientComponent;
import com.handcoding.front.domain.TokenVO;

/**
 * 도메인별 로그인 체크
 * @author 이승환
 * @version 2018.02.13 v1.0
 */
@Component
public class LoginInterceptor implements HandlerInterceptor {

	private static final Logger logger = LoggerFactory.getLogger(LoginInterceptor.class);
	
	@Autowired
	private ClientComponent client;
	
	@Override
	public void afterCompletion(HttpServletRequest req, HttpServletResponse resp, Object handler, Exception arg3)
			throws Exception {
	}

	@Override
	public void postHandle(HttpServletRequest req, HttpServletResponse resp, Object handler, ModelAndView arg3)
			throws Exception {
	}

	@Override
	public boolean preHandle(HttpServletRequest req, HttpServletResponse resp, Object handler) throws Exception {
		logger.info("========================================\t인터셉터 시작 \t=============================================");
		String uri = req.getRequestURI();
		String domain = uri.substring(1);
		if(domain.indexOf("/") != -1) {
			domain = domain.substring(0, domain.indexOf("/"));
		}
		boolean userCheck = req.getSession().getAttribute("userToken") == null;
		boolean adminCheck = req.getSession().getAttribute("adminToken") == null;
		boolean check = true;
		TokenVO tokenVO = null;
		if(domain.equals("user")) {
			if(userCheck) {
				resp.sendRedirect("/user/p/login");
				check = false;
			}else {
				// REST API token 시간 갱신
				tokenVO = (TokenVO) req.getSession().getAttribute("userToken");
				client.getSystemLoginClient().getUser(tokenVO.getToken());
			}
		}else if(domain.equals("admin")) {
			if(adminCheck) {
				resp.sendRedirect("/admin/p/login");
				check = false;
			}else {
				tokenVO = (TokenVO) req.getSession().getAttribute("adminToken");
				client.getSystemLoginClient().getUser(tokenVO.getToken());
			}
		}else {
			resp.sendRedirect("/user/p/login");
			check = false;
		}
		return check;
	}

}