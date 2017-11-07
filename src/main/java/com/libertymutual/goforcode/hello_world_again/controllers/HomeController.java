package com.libertymutual.goforcode.hello_world_again.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {
	
	private int russetCount;
	private int goldenCount;
	private int sweetCount;

	@RequestMapping("/")
	public String defaultPage() {
		return "potato";
	}

	@RequestMapping("/twice-baked")
	public ModelAndView twiceBaked() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("spuds");
		mv.addObject("variety", "Au Gratin");
		mv.addObject("temperature", 425);

		return mv;
	}
	
	@RequestMapping("/survey")
	public ModelAndView survey(String answer) {
		
		
		if(answer.equals("Russet")) {
		russetCount += 1;
		} else if (answer.equals("Sweet")){
			sweetCount += 1;
		} else if (answer.equals("Golden")) {
			goldenCount += 1;
		}
		
	
		ModelAndView mv = new ModelAndView();
		mv.setViewName("results");
		mv.addObject("userResponse", answer);
		mv.addObject("russet", russetCount);
		mv.addObject("sweet", sweetCount);
		mv.addObject("golden", goldenCount);
		
		return mv;
		
	}

}
