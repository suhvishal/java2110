package com.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {

	@GetMapping("/")
	public String home() {
		System.out.println("saying hello....");
		return "index";		//viewname 
	}
	
	@GetMapping(path = "/hello")
	@ResponseBody
	public String sayHello() {
		return "this is text response from server";
	}
}
