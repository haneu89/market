package com.marketimg.web.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.marketimg.web.domain.Member;

@Controller
public class IndexController {

	@Autowired
	private Member member;
	
	private static final Logger logger = LoggerFactory.getLogger(IndexController.class);

	@RequestMapping(value="/", method = RequestMethod.GET)
	public ModelAndView index(){
		ModelAndView mav = new ModelAndView();
		mav.setViewName("index");
		mav.addObject("member", member);
		
		return mav;
	}
	
	@RequestMapping(value="/", method = RequestMethod.POST)
	public ModelAndView login(@ModelAttribute("member")Member member2){
		ModelAndView mav = new ModelAndView();
		
		logger.info(member2.getUserId());
		logger.info(member2.getUserPassword());
		
		mav.setViewName("redirect:/");
		
		if(member2.getUserId().equals("test"))
			if(member2.getUserPassword().equals("1111"))
				mav.setViewName("mainPage");
		
		return mav;
	}
}
