package com.handcoding.front;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import com.handcoding.front.filter.AccessLogFilter;

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
	
}
