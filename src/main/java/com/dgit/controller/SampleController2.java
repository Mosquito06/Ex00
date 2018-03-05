package com.dgit.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SampleController2 {
	private static final Logger logger = LoggerFactory.getLogger(SampleController2.class);
	
	@RequestMapping("doC")
	public String doC(Model model){
		logger.info("doC가 실행됩니다.");
		
		// Spring에서는 Model 클래스가 매개변수로 넘어와 JSP의 requset 매개변수 역할을 수행함
		model.addAttribute("msg", "result글자입니다.");
		model.addAttribute("test", "test");
		
		return "result";
	}
	
	@RequestMapping("doD")
	public String doD(String msg, Model model){ // 스프링에서는 get 방식의 parameter가 넘어올 때, String으로 받으면 됨
		logger.info("doD가 실행됩니다.");
		logger.info("msg=" + msg);
		
		model.addAttribute("test", msg);
		
		
		return "result2"; // return명은 jsp 파일명(100% 동일해야함)
	}
	
	@RequestMapping("doE")
	public String doE(@ModelAttribute("msg") String msg){ // 반드시 parameter를 실어서 보내야 함
		logger.info("doE가 실행됩니다.");
		
		return "result2";
	}
	
	@RequestMapping("doE2")
	public String doE2(@ModelAttribute("msg") int msg){ // JSP에서 하던 것 처럼 굳이 타입 변환없이 매개변수를 받을 수 있음
		logger.info("doE2가 실행됩니다.");
		
		return "result2";
	}
}
