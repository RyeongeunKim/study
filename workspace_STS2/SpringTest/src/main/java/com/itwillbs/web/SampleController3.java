package com.itwillbs.web;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.itwillbs.domain.ProductVO;

@Controller
public class SampleController3 {
	
	private static final Logger logger
	= LoggerFactory.getLogger(SampleController3.class);
	
	// view 페이지로 객체정보를 전달
	// http://localhost:8088/web/doC
	@RequestMapping("/doC")
	public String doC(Model model) {
		// Model객체 : 스프링MVC에서 기본제공 클래스,
		// 뷰에 데이터를 전달하는 컨테이너(상자) 역할 클래스
		
		logger.info("doC() 메서드 호출");
		logger.info("productDetail.jsp 페이지로 이동");
		
		//model.addAttribute("test", "12345");
		
		// 상품 객체 생성 -> view 페이지로 전달
		ProductVO vo = new ProductVO("컴퓨터",100);
		
		// Model 객체안에 정보를 저장
		// model.addAttribute("key", value);
		model.addAttribute("vo", vo);
		
		// model.addAttribute(value);
		// => key값이 없기 때문에 전달되는 타입의 클래스명
		// 글자만 소문자로 변경해서 key값으로 사용가능
		model.addAttribute(vo);
		
		return "productDetail";
	}
}
