package sideProjectGradle.admin;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AccountController {
	
	@RequestMapping("/hello")
	public String login() {
		return "hello";
	}	
}