package com.handcoding.front.component;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.handcoding.front.bean.EnvironmentConfig;
import com.handcoding.front.bean.UtilBean;

/**
 * 공통 컴포넌트
 * @author 이승환
 * @version 2018.01.28 v1.0
 */
@Component
public class CommonComponent {
	
	@Autowired
	private EnvironmentConfig config;

	@Autowired
	private UtilBean util;
	
	public EnvironmentConfig getConfig() {
		return config;
	}
	public UtilBean getUtil() {
		return util;
	}
	
}
