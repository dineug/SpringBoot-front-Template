package com.handcoding.front.domain.in;

import com.handcoding.front.domain.CodeVO;

public class InCodeUpdateVO extends CodeVO{
	
	private String newCode;
	private String newParentCode;
	
	public String getNewCode() {
		return newCode;
	}
	public void setNewCode(String newCode) {
		this.newCode = newCode;
	}
	public String getNewParentCode() {
		return newParentCode;
	}
	public void setNewParentCode(String newParentCode) {
		this.newParentCode = newParentCode;
	}
	@Override
	public String toString() {
		return "InCodeUpdateVO [newCode=" + newCode + ", newParentCode=" + newParentCode + "]";
	}
}
