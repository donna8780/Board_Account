package com.itbank.practice;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller//요청을 받아 처리하고 어떤 jsp파일을 출력할지 결정하는 객체
public class HomeController {
	
	@GetMapping("/")		//getmapping:get으로 들어오는 요청을 처리하는 구문
	public String home() {	//()안의 url로 매칭되는 요청을 아래 메서드로 처리
		
		return "home";	//반환하는 문자열이 뷰네임(보여줄 페이지)이 된다.
		
	}
	

	
}
