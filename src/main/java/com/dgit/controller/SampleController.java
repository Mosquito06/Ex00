package com.dgit.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SampleController {
	
	@RequestMapping("doA")
	public void doA(){
		System.out.println("doA가 실행되었습니다.");
	}
}
