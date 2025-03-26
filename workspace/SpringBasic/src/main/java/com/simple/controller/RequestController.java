package com.simple.controller;

import java.util.ArrayList;
import java.util.Arrays;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.simple.command.MemberVO;

@Controller
@RequestMapping("/request") // 모든 메서드 요청 경로 앞에 /request가 붙음
public class RequestController {

	// ex01화면요청
//	@RequestMapping("/ex01")
//	public String ex01() {
//		return "request/ex01";
//	}

	// void형으로 화면 연결 - 요청경로가 나가는 경로가 됩니다.
	@RequestMapping("/ex01")
	public void ex01() {

	}

	// basic01
	@RequestMapping(value = "/basic01", method = RequestMethod.GET) // get요청만 허용한다 post는 못들어옴
//	@RequestMapping(value = "/basic01", method = RequestMethod.POST)
//	@RequestMapping("/basic01") //get, post 둘 다 허용
//	@GetMapping("/basic01") //get요청만 허용함
//	@PostMapping("/basic01") //get요청만 허용함
	public void basic01() {
		System.out.println("basic01요청");
	}

	// 완전히 동일한 기능이 있으면, 요청을 {} 하나로 묶어서 사용할 수 있음.
	@RequestMapping({ "/basic02", "/basic03" }) // value값이 배열 타입이기 때문에 배열 값이 들어갈 수 있음
	public void basic02() {
		System.out.println("basic02~03 요청 실행됨");
	}

	//////////////////////////////////////////////////
	// ex02 화면요청
	@RequestMapping("/ex02")
	public String ex02() {
		return "request/ex02";
	}

//	@RequestMapping(value="/param", method=RequestMethod.POST)
//	public String param(HttpServletRequest request) {
//		String id = request.getParameter("id"); //단일값
//		String[] inter = request.getParameterValues("inter");
//		
//		System.out.println(id);
//		System.out.println(Arrays.toString(inter));
//		
//		return "request/ex02_success";
//	}

	// 2nd - @RequestParam어노테이션으로 단일값 받기
	// @RequestParam은 클라이언트에서 반드시 파라미터값을 넘겨야 합니다. 그렇지 않으면, 거절당함
	// defaultValue가 파라미터가 없을 때 기본값을 정의
//	@RequestMapping(value="/param", method=RequestMethod.POST)
//	public String param(@RequestParam("id") String id,
//						@RequestParam("pw") String pw,
//						@RequestParam("name") String name,
//						@RequestParam(value = "inter", required = false, defaultValue= "") ArrayList<String> inter) {
//		
//		System.out.println(id);
//		System.out.println(pw);
//		System.out.println(name);
//		System.out.println(inter.toString());
//		
//		return "request/ex02_success";
//	}

	// 3nd - 폼의 name값이 vo의 setter와 일치해야 함(멤버변수)
	@RequestMapping(value = "/param", method = RequestMethod.POST)
	public String param(MemberVO vo) {
		System.out.println(vo.toString());

		return "request/ex02_success";
	}

//	<form action="param" method="post">
//	id: <input type="text" name ="id"><br>
//	pw: <input type="password" name ="pw"><br>
//	name: <input type="text" name ="name"><br>
//	분야:
//	<input type="checkbox" name="inter" value="자바">
//	<input type="checkbox" name="inter" value="jsp">
//	<input type="checkbox" name="inter" value="spring"><br>
//	
//	<input type="submit" value="파라미터값 받기">
//</form>

	
	
	///////////////////////////////////////////
	//숙제 1
//	@RequestMapping("/req_quiz01")
//	public String req_quiz01() {
//		return "request/req_quiz01";
//	}
//
//	@RequestMapping(value="/login", method=RequestMethod.POST)
//	public String param(HttpServletRequest req) {
//		String id = req.getParameter("id");
//		String pw = req.getParameter("pw");
//		
//		if(id.equals("abc123") && pw.equals("xxx123")) {
//			return "/request/req_quiz01_ok";
//		}else {
//			return "/request/req_quiz01_no";
//		}
		
		/////////////////////////////
		//숙제 2
	@RequestMapping("/req_quiz01")
	public String quiz01() {
		return "request/req_quiz_01";
	}
	@RequestMapping(value="/login", method = RequestMethod.POST)
	public String login(@RequestParam("id") String id,
						@RequestParam("pw") String pw) {
		if(id.equals("abc123") && pw.equals("xxx123")) {
			return "request/req_quiz01_ok";
		}else {
			return "request/req_quiz01_no";
			}
		}
	}


