package com.example.clothstoredatabase.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

import com.example.clothstoredatabase.Entity.Login;
import com.example.clothstoredatabase.Service.LoginService;

@RestController
public class LoginController {

	@Autowired
	LoginService loginservice;

	@GetMapping("login")
	public Login login(@RequestHeader String email, @RequestHeader String password) {

		return loginservice.login(email, password);
	}
}
