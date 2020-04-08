package jss.thymeleaf;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
	
	@Autowired
	private Student2 student;
	
	@RequestMapping(value = "/test", method = RequestMethod.GET)
	public String beanTest(Model model) {
		model.addAttribute("beanName", student.getName());

		return "beanTest";
	}

}
