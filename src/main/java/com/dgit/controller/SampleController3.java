package com.dgit.controller;

import java.util.ArrayList;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.dgit.domain.ProductVO;

@Controller
public class SampleController3 {
	private static final Logger logger = LoggerFactory.getLogger(SampleController3.class);

	
	@RequestMapping("productA")
	public String productA(Model model){
		logger.info("productA가 실행됩니다.");
		
		ProductVO vo = new ProductVO("Sample Product", 10000);
		model.addAttribute("vo", vo);
				
		return "productA";
	}
	
	@RequestMapping("productList")
	public String productList(Model model){
		logger.info("productList가 실행됩니다.");
		ArrayList<ProductVO> list = new ArrayList<>();
		
		list.add(new ProductVO("삼영라면", 800));
		list.add(new ProductVO("육개장", 900));
		list.add(new ProductVO("김치라면", 850));
		list.add(new ProductVO("진라면", 750));
		
		model.addAttribute("list", list);
		
		return "productList";
	}
	
	@RequestMapping("doF")
	public String redirectTest(){
		logger.info("doF가 실행됩니다.");	
		return "redirect:productA";
	}
	
	@RequestMapping("doG")
	public String forwardTest(){
		logger.info("doG가 실행됩니다.");	
		
		return "forward:productList";
	}
	
	@RequestMapping("doJson")
	public @ResponseBody ProductVO doJSon(){
		logger.info("doJson가 실행됩니다.");	
		
		ProductVO vo = new ProductVO("재진이", 1000);
				
		return vo;
	}
	
	
}
