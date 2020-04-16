package jss.thymeleaf;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ThymeleafController{

//	@RequestMapping("/")
//	public String index(Model model) {
//		model.addAttribute("message", "HELLO!����");
//		return "index";
//	}
	@RequestMapping(value = "/{typNo}")
	public ModelAndView index(@PathVariable("typNo") String typNo) {
		ModelAndView mav = new ModelAndView();
		
		mav.setViewName("index" );
		mav.addObject("message", "�������� �׽�Ʈ �Դϴ�.");
		return mav; 
	}
}