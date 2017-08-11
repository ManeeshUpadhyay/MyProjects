package com.aartek.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.aartek.model.RegistrationDto;
import com.aartek.service.RegisterService;

@Controller
public class RegisterController {

	@Autowired
	private RegisterService registerService;

	@RequestMapping(value = "/registration", method = RequestMethod.GET)
	public String showRegistrationDetail(Map<String, Object> map) {

		System.out.println("inside registration contrllor");
		map.put("RegistrationDto", new RegistrationDto());

		return "registration";
	}

	@RequestMapping(value = "/saveRegistration", method = RequestMethod.POST)
	public String checkRegistration(@ModelAttribute("RegistrationDto") RegistrationDto register) {
		System.out.println("FName : " + register.getFirstName() + ", LName : " + register.getLastName());
		registerService.checkRegisterUser(register);
		return "showRegistration";

	}

}
