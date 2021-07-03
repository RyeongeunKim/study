package com.itwillbs.web;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class SampleController4 {
	
	private static final Logger logger
	= LoggerFactory.getLogger(SampleController3.class);
	
	//http://localhost:8088/web/doD
	//http://localhost:8088/web/doD?msg=testData
	@RequestMapping("/doD")
	//public String doD(@ModelAttribute("msg") String msg) {
	public String doD(RedirectAttributes rttr) {
		logger.info("doD() 호출");
		
		rttr.addFlashAttribute("msg", "1회성 데이터 전달하기!");
		
		//return "/doE"; doE.jsp 뷰페이지 연결
		return "redirect:/doE"; // 특정페이지로 이동(다른 메서드 호출)
		//return "forward:/doE";
	}
	
	//http://localhost:8088/web/doE
	@RequestMapping("/doE")
	public void doE(@ModelAttribute("msg") String msg) {
		logger.info("doE() 호출");
		logger.info("msg : " + msg);
		
	}

}