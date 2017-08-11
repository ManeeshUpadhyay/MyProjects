package com.aartek.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;

import com.aartek.model.RegistrationDto;
import com.aartek.repository.RegisterRepository;

@Service
public class RegisterService {

	@Autowired
	private RegisterRepository registerRepository;

	public RegistrationDto checkRegisterUser(RegistrationDto register) {
		System.out.println("inside register service method");
		System.out.println("FName : " + register.getFirstName() + ", LName : " + register.getLastName());
		System.out.println("--------------------------------------------------------------------");
		registerRepository.saveUser(register);
		return register;

	}
}
