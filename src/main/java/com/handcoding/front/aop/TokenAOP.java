package com.handcoding.front.aop;

import java.util.Arrays;

import javax.servlet.http.HttpServletRequest;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import com.handcoding.front.domain.TokenVO;

/**
 * token 주입
 * @author 이승환
 * @version 2018.02.15 v1.0
 */
@Component
@Aspect
public class TokenAOP {
	
	private static final Logger logger = LoggerFactory.getLogger(TokenAOP.class);
	
	@Around("execution(* com..*Controller.*(.., @com.handcoding.front.annotation.AdminToken (*) ,..))")
	public Object adminToken(final ProceedingJoinPoint j) throws Throwable {
		logger.info("===========================================\t@AdminToken 시작\t=====================================");
		HttpServletRequest req = ((ServletRequestAttributes) RequestContextHolder.getRequestAttributes()).getRequest();
		TokenVO tokenVO = (TokenVO) req.getSession().getAttribute("adminToken");
		Object[] args = Arrays.stream(j.getArgs()).map(data -> { if(data instanceof TokenVO) {data = tokenVO;} return data; }).toArray();
		return j.proceed(args);
	}
	
	@Around("execution(* com..*Controller.*(.., @com.handcoding.front.annotation.UserToken (*) ,..))")
	public Object userToken(final ProceedingJoinPoint j) throws Throwable {
		logger.info("===========================================\t@UserToken 시작\t=====================================");
		HttpServletRequest req = ((ServletRequestAttributes) RequestContextHolder.getRequestAttributes()).getRequest();
		TokenVO tokenVO = (TokenVO) req.getSession().getAttribute("userToken");
		Object[] args = Arrays.stream(j.getArgs()).map(data -> { if(data instanceof TokenVO) {data = tokenVO;} return data; }).toArray();
		return j.proceed(args);
	}
	
}
