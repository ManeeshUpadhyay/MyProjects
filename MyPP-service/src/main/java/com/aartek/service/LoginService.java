package com.aartek.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aartek.model.UserLoginDto;
import com.aartek.repository.LoginRepsoitory;

@Service
public class LoginService {

	@Autowired
	private LoginRepsoitory loginRepsoitory;

	public UserLoginDto validateUser(UserLoginDto user) {
		System.out.println("-----------------------------------------------");
		System.out.println("Inside LoginService class validateUser() Method ");
		System.out.println("EmailId : " + user.getEmailId() + ", Password : " + user.getPassword());
		System.out.println("-------------------------------------------------------");
		 //loginRepsoitory.validateUserRepo(emailId, password)(user);
		//loginRepsoitory.validateUser(user);
		return user;
	}

	public boolean checkUser(UserLoginDto user) {
		List<UserLoginDto> userlist = loginRepsoitory.userLoginDtos(user.getEmailId(), user.getPassword());
		if (userlist != null && !userlist.isEmpty()) {
			return true;
		} else {
			return false;
		}
	}
}
