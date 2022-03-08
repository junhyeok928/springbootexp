package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.demo.vo.Person;
@Controller
public class A02_Controller {
	// http://localhost:5080/start
	@GetMapping("/start2")
	public String start2() {
		return "a02_second";
	}
	@GetMapping("/exp01")
	public String exp01(Model d) {
		d.addAttribute("great", "안녕하세요");
		return "a03_model";
	}
	@GetMapping("/exp02")
	public String exp02(Model d) {
		d.addAttribute("p", new Person("홍길동", 25, "서울 강남"));
		return "a04_model";
	}
}
