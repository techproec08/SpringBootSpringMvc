package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class Hello {

	@RequestMapping("/")
	public String hello() {
		return "index";
	}

	@RequestMapping("add")
	public ModelAndView add(@RequestParam("val1") String val1, @RequestParam("val2") String val2) {
		int val3 = Integer.parseInt(val1) + Integer.parseInt(val2);
		ModelAndView mv = new ModelAndView();
		mv.addObject("val1", val1);
		mv.addObject("val2", val2);
		mv.addObject("val3", val3);
		mv.setViewName("result");
		return mv;
	}

}
