package com.simple.board.dao;

import java.util.ArrayList;

import org.apache.ibatis.annotations.Mapper;

import com.simple.command.BoardVO;

@Mapper
public interface BoardMapper {

	int insertOne(String name);
	int insertTwo(BoardVO vo);
	
	BoardVO selectOne(int bno);
	ArrayList<BoardVO> selectThree();
	
	int updateOne(BoardVO vo);
	
	int deleteOne(String bno);
}
