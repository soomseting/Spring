package com.simple.board.dao;

import java.util.ArrayList;

import com.simple.command.BoardVO;
import com.simple.command.ScoreVO;

public interface BoardDAO {
	void regist(BoardVO vo); // insert
	ArrayList<BoardVO> getList(); // select
	void delete(String bno); //delete
}
