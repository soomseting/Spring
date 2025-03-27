package com.simple.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.simple.command.MemberVO;
import com.simple.command.QuizVO;

@Controller
@RequestMapping("/quiz")
public class QuizController {

	
	@RequestMapping("/quiz01")
	public String quiz01() {
		return "/quiz/quiz01";
	}

	
	
	
	@RequestMapping("/join")
	public ModelAndView quiz01_ok(Model model, QuizVO vo) {
		
		ModelAndView mv = new ModelAndView();
		mv.addObject("id",vo.getId());
		mv.addObject("pw",vo.getPw());
		mv.addObject("name",vo.getName());
		mv.addObject("email",vo.getEmail());
		mv.setViewName("quiz/quiz01_ok");
		
		return mv;
	}
	
	@RequestMapping("/quiz02")
	public String quiz02() {
		return "/quiz/quiz02";
	}
	
//	@RequestMapping(value="/join", method=RequsetMethod.POST)
//	public String join(QuizVO vo, Model model) {
//		
//		model.addAttribute("quizVO", vo);
//		
//		return "quiz/quiz01_ok";
//	}
	
	@RequestMapping("/result")
	public String result() {
		return "quiz/result";
	}
		
	@RequestMapping(value="/birthForm", method = RequestMethod.POST)
	public String birthForm(@RequestParam("year") String year,
							@RequestParam("month") String month,
							@RequestParam("day") String day,
							@RequestParam("msg") String msg,
							RedirectAttributes ra) {
	
	String myMsg = year + "-" + month + "-" + day + " " + msg;
	ra.addAttribute("msg",myMsg);
		
		return "redirect:/quiz/result";
	}
	
	
	
}
