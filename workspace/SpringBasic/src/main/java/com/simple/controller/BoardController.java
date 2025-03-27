package com.simple.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.simple.board.service.BoardService;
import com.simple.command.BoardVO;

@Controller
@RequestMapping("/board")
public class BoardController {

	@Autowired
	@Qualifier("aboard") // 빈이름 으로연결함
	private BoardService boardService;

	@RequestMapping("/boardList")
	public String boardList(Model model) {

		// select해서 결과를 model담아서 화면으로 가져감
		ArrayList<BoardVO> list = boardService.getList();
		model.addAttribute("list", list); //

		return "board/boardList";
	}

	@RequestMapping("/boardRegist")
	public String boardRegist() {

		return "board/boardRegist";
	}

	@RequestMapping("/boardResult")
	public String boardResult() {

		return "board/boardResult";
	}

	@RequestMapping(value="boardForm", method = RequestMethod.POST)
	public String boardForm(BoardVO vo) {

		
		boardService.regist(vo);
		
		return "redirect:/board/boardResult";
	}
	
	@RequestMapping("/boardDelete")
	public String boardDelete(@RequestParam("bno") String bno) {
		
		//삭제..
		return "redirect:/board/boardList";
	}
	

}
