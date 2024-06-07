package com.itbank.practice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.itbank.boardvo.BoardVO;
import com.itbank.service.BoardService;

@Controller
@RequestMapping("/board")
public class BoardController {
	
	@Autowired	//스프링 빈으로 등록된 것을 생성해줌
	private BoardService bs;
	
	@GetMapping
	public ModelAndView list() {
		
		ModelAndView mav = new ModelAndView();
		
		mav.addObject("ver", bs.getTest());
		mav.addObject("list", bs.getBoards());
		mav.setViewName("board/list");//보여지는 페이지(jsp)
		
		return mav;
	}
	
	@GetMapping("/update/{idx}")//idx(=계정 번호를 받는다.)
	public ModelAndView update(@PathVariable int idx) {//주소창의 idx를 받는다.
		
		ModelAndView mav = new ModelAndView();
		
		mav.addObject("row", bs.getBoardOne(idx));
		mav.setViewName("board/update");
		
		return mav;

	}
	
	@PostMapping("/update/{idx}")
	public String update(BoardVO input) {
		
		bs.update(input);
		
		return "redirect:/board";
	}
	
	@GetMapping("delete/{idx}")
	public String delete(BoardVO input) {
		
		bs.delete(input);
		
		return "redirect:/board";
	} 
}
