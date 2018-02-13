package com.handcoding.front;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import com.handcoding.front.filter.AccessLogFilter;
import com.handcoding.front.interceptor.LoginInterceptor;

@SpringBootApplication
public class FrontApplication extends WebMvcConfigurerAdapter {

	public static void main(String[] args) {
		SpringApplication.run(FrontApplication.class, args);
	}
	
	/**
	 * AccessLog filter 설정
	 * @return
	 */
	@Bean
	public FilterRegistrationBean accessLogFilterBean() {
		FilterRegistrationBean registrationBean = new FilterRegistrationBean(new AccessLogFilter());
		return registrationBean;
	}
	
	@Autowired
	private LoginInterceptor loginInterceptor;
	
	/**
	 * 로그인체크 인터셉터 설정
	 */
	@Override
	public void addInterceptors(InterceptorRegistry registry) {
		registry.addInterceptor(loginInterceptor).addPathPatterns("/**")
												.excludePathPatterns("/user/p/**")
												.excludePathPatterns("/admin/p/**")
												.excludePathPatterns("/robots.txt")
												.excludePathPatterns("/res/**");
	}
	
}
