package com.anhthao.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/students")
public class StudentController {
	
	@GetMapping()
	public String showForm() {
		return "student-form";
	}
	
	@PostMapping()
	public String showInfo(@RequestParam("name") String name,
			@RequestParam("gpa") String gpa,
			@RequestParam("major") String major,
			
			Model model) {
		model.addAttribute("name", name);
		model.addAttribute("gpa", gpa);
		model.addAttribute("major", major);

		return "student-info";
	}
}
