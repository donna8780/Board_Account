package com.itbank.dao;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.itbank.boardvo.BoardVO;

public interface BoardDAO {

	@Select("select banner from v$version")
	public String test();

	@Select("select * from board_view order by idx desc")
	public List<BoardVO> selectAll();

	@Select("select * from board_view where idx = #{idx}")
	public BoardVO selectOne(int idx);

	@Update("update board set title = #{title}, contents = #{contents} where idx = #{idx}")
	public int update(BoardVO input);
	
	@Delete("delete from board where idx = #{idx}")
	public int delete(BoardVO input);

	

	
}
