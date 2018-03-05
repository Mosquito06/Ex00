package com.dgit.controller;

import java.lang.reflect.Method;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class CalculatorController {
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	@RequestMapping(value="cal", method = RequestMethod.GET)
	public String calGet(){
		logger.info("cal Get");
		
		return "calForm";
	}
	
	@RequestMapping(value="cal", method = RequestMethod.POST)
	public String calPost(@ModelAttribute("num1") double num1, @ModelAttribute("num2") double num2){
		logger.info("cal Post");

		return "calResult";
	}
	
}
