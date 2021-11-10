package com.learn.spring18ndemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class FirstController {

	@RequestMapping(method=RequestMethod.GET, value={"/","/display"})
	public String display() {
		return "display";
	}
	
	@RequestMapping(method= RequestMethod.GET, value="/login")
	public ModelAndView validateUser(@RequestParam("userName") String userName) {
		ModelAndView mv = new ModelAndView("success");
		mv.addObject("userName",userName);
		return mv;
	}
}
