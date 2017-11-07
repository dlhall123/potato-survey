package com.libertymutual.goforcode.hello_world_again.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import com.libertymutual.goforcode.hello_world_again.models.SurveyResults;

@Controller
public class HomeController {
	
	SurveyResults sr = new SurveyResults();

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
		sr.registerRussetVote();
		} else if (answer.equals("Sweet")){
			sr.registerSweetVote();
		} else if (answer.equals("Golden")) {
			sr.registerGoldenCount();
		}
		
		ModelAndView mv = new ModelAndView();
		mv.setViewName("results");
		mv.addObject("userResponse", answer);
		mv.addObject("results", sr);
		
		return mv;
		
	}

}
