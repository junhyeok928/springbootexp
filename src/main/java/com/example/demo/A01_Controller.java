package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
@Controller
public class A01_Controller {
	// http://localhost:5080/start
	@GetMapping("/start")
	public String start() {
		return "a01_start";
	}
}
