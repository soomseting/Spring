package com.simple.board.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.simple.board.dao.BoardDAO;
import com.simple.board.dao.BoardMapper;
import com.simple.command.BoardVO;

@Service("aboard")
public class BoardServiceImpl implements BoardService{

//	@Autowired
//	@Qualifier("boardDAO")
//	private BoardDAO boardDAO;
	
	@Autowired
	private BoardMapper boardMapper;
	
	@Override
	public void regist(BoardVO vo) {
//		boardDAO.regist(vo);
		boardMapper.insertTwo(vo);
	}

	@Override
	public ArrayList<BoardVO> getList() {
		// TODO Auto-generated method stub
//		return boardDAO.getList();
		return boardMapper.selectThree();
	}

	@Override
	public void delete(String bno) {
//		boardDAO.delete(bno);
		boardMapper.deleteOne(bno);
		
	}

}
