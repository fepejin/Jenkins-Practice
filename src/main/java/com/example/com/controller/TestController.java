package com.example.com.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
	
	//http://localhost/test01
	@GetMapping(value="test01")
	public String m1() {
		
		return "테스트ㅡㅡ"; 
	}

}
