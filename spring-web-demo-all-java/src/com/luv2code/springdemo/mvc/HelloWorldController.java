package com.luv2code.springdemo.mvc;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloWorldController {

	@GetMapping("/showForm")
	public String showForm() {
		return "helloworld-form";
	}

	@GetMapping("/processForm")
	public String processForm() {
		return "helloworld";
	}

	@GetMapping("/processFormV2")
	public String uppperCase(HttpServletRequest request, Model model) {
		String dude = request.getParameter("studentName");
		model.addAttribute("message", "yo! " + dude.toUpperCase());
		return "helloworld";
	}

}
