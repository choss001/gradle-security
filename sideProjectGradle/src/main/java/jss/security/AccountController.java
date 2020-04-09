package jss.security;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class AccountController {
	
	
	@RequestMapping("/hello")
	public String login() {
		return "index";
	}	

}