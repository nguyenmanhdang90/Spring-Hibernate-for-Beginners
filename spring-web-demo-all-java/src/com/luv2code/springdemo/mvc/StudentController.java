package com.luv2code.springdemo.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/student")
public class StudentController {

	@GetMapping("/showForm")
	public String showForm(Model theModel) {
		Student theStudent = new Student();
		theModel.addAttribute("student", theStudent);
		return "student-form";
	}

	@GetMapping("/processForm")
	public String processForm(@ModelAttribute("student") Student theStudent) {
		System.out.println(theStudent.getFirstName());
		return "student-confirmation";
	}

}
