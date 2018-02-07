package com.handcoding.front.domain.in;

import java.util.concurrent.TimeUnit;

import com.handcoding.front.domain.UserVO;

public class InUserLoginVO extends UserVO {

	private static final long serialVersionUID = 1L;
	
	private int timeout;
	private TimeUnit timeUnit;

	public int getTimeout() {
		return timeout;
	}
	public void setTimeout(int timeout) {
		this.timeout = timeout;
	}
	public TimeUnit getTimeUnit() {
		return timeUnit;
	}
	public void setTimeUnit(TimeUnit timeUnit) {
		this.timeUnit = timeUnit;
	}
	@Override
	public String toString() {
		return "InUserLoginVO [timeout=" + timeout + ", timeUnit=" + timeUnit + "]";
	}
	
}
