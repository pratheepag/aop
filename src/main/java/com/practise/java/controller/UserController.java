package com.practise.java.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
	@GetMapping("/getUser")
	public String getUser() throws Exception {
		throw new Exception("Exception in User Controller");
	//	return "Tiger";
	}
}
