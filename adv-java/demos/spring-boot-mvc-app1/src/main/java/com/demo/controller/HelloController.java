package com.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {

	@GetMapping("/")
	public String sayHello() {
		System.out.println("saying hello....");
		return "index";
	}
}
