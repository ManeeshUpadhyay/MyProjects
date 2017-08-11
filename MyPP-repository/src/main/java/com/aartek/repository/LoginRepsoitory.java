package com.aartek.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.aartek.model.UserLoginDto;

@Repository
public class LoginRepsoitory {

	@Autowired
	private HibernateTemplate hibernateTemplate;

	public UserLoginDto validateUser(UserLoginDto user) {
		System.out.println("Inside the LoginRepository class validateUser() method");
		hibernateTemplate.save(user);
		System.out.println("EmailId : " + user.getEmailId() + ", Password : " + user.getPassword());
		return user;
	}

	
	@SuppressWarnings("unchecked")
	public List<UserLoginDto> userLoginDtos(String emailId, String password) {
		if (emailId != null && password != null) {
			List<UserLoginDto> list = hibernateTemplate.find("from UserLoginDto where emailId=? and password=?",
					emailId, password);
			return list;
		} else {
			return null;
		}

	}

}