package com.springboot.app;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
// import org.springframework.web.bind.annotation.RestController;

@Controller
public class WelcomeController {

	@GetMapping("/welcome")
	public String welcome() {
		return "home";
	}
}
