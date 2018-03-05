package com.dgit.controller;


import java.util.ArrayList;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.support.GenericXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.dgit.domain.BMICalculator;
import com.dgit.domain.MyInfo;

@Controller
public class MyInfoController {
	private static final Logger logger = LoggerFactory.getLogger(MyInfoController.class);
	
	@Autowired
	BMICalculator bmiCalculator;
	
	@RequestMapping(value="myInfo", method= RequestMethod.GET)
	public String myInfoGet(){
		logger.info("myInfo Get");
		
		
		return "myInfoForm";
	}
	
	/*@RequestMapping(value="myInfo", method= RequestMethod.POST)
	public String myInfoPost(String name, double height, double weight, String[] hobbys, Model model){
		logger.info("myInfo Post");
		
		
		// 스프링 MVC 구조로 생성했기때문에 Spring을 실행할 시에 별도로 root-context를 실행하며 Bean 객체를 생성하기 때문에 
		// 아래 코드를 쓸 필요는 없음
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext("classpath:applicationCtx.xml");
		MyInfo myinfo = ctx.getBean(MyInfo.class);
		
		myinfo.setName(name);
		
		ArrayList<String> hobby = new ArrayList<>();
		for(String s : hobbys){
			hobby.add(s);
		}		
		myinfo.setHobbys(hobby);
		myinfo.setHeight(height);
		myinfo.setWeight(weight);
				
		model.addAttribute("myInfo", myinfo);
		
		return "myInfoResult";
	}*/
	
	@RequestMapping(value="myInfo", method= RequestMethod.POST)
	public String myInfoPost(MyInfo myInfo, Model model){
		logger.info("myInfo Post");
		
		myInfo.setBmiCalculator(bmiCalculator);
		model.addAttribute("myInfo", myInfo);
		
		return "myInfoResult";
	}
	
	
}
