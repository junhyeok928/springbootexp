package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.vo.Emp;

@Controller
public class A10_EmpController {
	@Autowired
	private A20_EmpService service;
	// http://localhost:5080/empList
	@RequestMapping("/empList")
	public String empList(Emp sch, Model d) {
		// d.addAttribute("empList", service.getEmpList(sch));
		return "a10_empList";
	}
}
