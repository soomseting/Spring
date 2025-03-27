package com.simple.board.service;

import java.util.ArrayList;

import com.simple.command.BoardVO;

public interface BoardService {
	void regist(BoardVO vo); //insert
	ArrayList<BoardVO> getList(); //select
	void delete(String bno); //delete
}
