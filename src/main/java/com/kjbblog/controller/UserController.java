package com.kjbblog.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.kjbblog.service.UserService;

@Controller
public class UserController {
	@Autowired
	private UserService service;

	@RequestMapping("/user/loginView")
	public String login() {
		return "login";
	}
}
