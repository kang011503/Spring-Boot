package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/")
public class HomePageController {
	
	@RequestMapping("/homepage")
	public ModelAndView homepage(ModelAndView modelAndView) {
		modelAndView.setViewName("homepage");
		return modelAndView;
	}

}
