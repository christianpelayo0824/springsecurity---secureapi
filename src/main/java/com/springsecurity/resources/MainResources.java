package com.springsecurity.resources;

import org.springframework.stereotype.Controller;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MainResources {

	public ModelAndView getResources() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("/index");
		return mv;
	}
}
