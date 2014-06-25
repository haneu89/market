package com.marketimg.web.domain;

import org.springframework.stereotype.Controller;

import com.dogspawteam.common.domain.BaseDomain;

@Controller
public class Member extends BaseDomain{
	String	userId;
	String	userPassword;
	String	phone;
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getUserPassword() {
		return userPassword;
	}
	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	
}
