package com.myapp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/msg")
public class EmployeeController {
	
	@GetMapping("/greeting")
	public String getMessage() {
		return "Welcome Vikas!!!!!";
	}

}
