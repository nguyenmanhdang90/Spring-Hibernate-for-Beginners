package com.luv2code.springdemo.mvc;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/hello")
public class HelloWorldController {

	@GetMapping("/showForm")
	public String showForm() {
		return "helloworld-form";
	}

	@GetMapping("/processForm")
	public String processForm() {
		return "helloworld1";
	}

	@GetMapping("/processFormV2")
	public String uppperCase(HttpServletRequest request, Model model) {
		String dude = request.getParameter("studentName");
		model.addAttribute("message", "yo! " + dude.toUpperCase());
		return "helloworld";
	}

	@GetMapping("/processFormV3")
	public String processFormVersion3(
			@RequestParam(value = "studentName", required = false, defaultValue = "Dang") String studentName,
			Model model) {
		model.addAttribute("message", "yo version 3! " + studentName.toUpperCase());
		return "helloworld";
	}

}
