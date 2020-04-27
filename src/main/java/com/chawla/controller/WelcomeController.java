package com.chawla.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.chawla.model.Employee;

@Controller
public class WelcomeController {

	private String message = "Hello World";

	@RequestMapping("/")
	public String welcome(Map<String, Object> model) {
		model.put("message", this.message);
		return "welcome";
	}

	@PostMapping("/save")
	public String saveEmployee(Employee employee, ModelMap modelMap) {
		modelMap.put("firstName", employee.getFirstName());
		modelMap.put("lastName", employee.getLastName());
		return "viewDetails";
	}

}