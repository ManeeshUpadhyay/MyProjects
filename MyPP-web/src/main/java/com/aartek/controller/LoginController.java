package com.aartek.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.aartek.model.UserLoginDto;
import com.aartek.service.LoginService;
import com.aartek.validator.LoginValidator;

@Controller
public class LoginController {

	@Autowired
	private LoginService loginService;
	@Autowired
	private LoginValidator loginValidator;

	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String showLogin(Map<String, Object> map) {
		System.out.println("----------------------------------------");
		System.out.println("Inside Controller showLogin() Method");
		map.put("UserLoginDto", new UserLoginDto());
		return "login";

	}

	@RequestMapping(value = "/saveLogin", method = RequestMethod.POST)
	public String checkLogin(@ModelAttribute("UserLoginDto") UserLoginDto user, BindingResult result,
			ModelMap modelMap) {
		// map.put("UserLoginDto", new UserLoginDto());
		// System.out.println("Email Id : " + user.getEmailId() + ", Password : " +
		// user.getPassword());
		/*
		 * if (loginService.checkUser(user)) { return "showLoginDetail";
		 * 
		 * } else { //return "redirect:/login.do"; return "invalidUser"; }
		 */

		// Validations for check null values
		if (user != null) {
			loginValidator.validate(user, result);
			if (result.hasErrors()) {

				return "login";
			}

		}
		return "showLoginDetail";
		/*
		 * if (loginService.checkUser(user)) { return "showLoginDetail"; } else { return
		 * "redirect:/login.do"; }
		 */

	}

}
