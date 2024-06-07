package com.itbank.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.itbank.boardvo.BoardVO;
import com.itbank.dao.BoardDAO;

@Service
public class BoardService {

	@Autowired//객체 생성
	private BoardDAO dao;

	public String getTest() {

		return dao.test();
	}

	public List<BoardVO> getBoards() {
		return dao.selectAll();
	}

	public BoardVO getBoardOne(int idx) {
		
		return dao.selectOne(idx);
	}


	public int update(BoardVO input) {
		return dao.update(input);	
	}

	public int delete(BoardVO input) {
		return dao.delete(input);
		
	}


}
