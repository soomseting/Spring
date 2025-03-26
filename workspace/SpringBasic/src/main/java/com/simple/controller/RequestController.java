package com.simple.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/request") //모든 메서드 요청 경로 앞에 /request가 붙음
public class RequestController {

	//ex01화면요청
//	@RequestMapping("/ex01")
//	public String ex01() {
//		return "request/ex01";
//	}
	
	//void형으로 화면 연결 - 요청경로가 나가는 경로가 됩니다.
	@RequestMapping("/ex01")
	public void ex01() {
		
	}
	
	//basic01
	@RequestMapping(value = "/basic01", method = RequestMethod.GET) //get요청만 허용한다 post는 못들어옴
//	@RequestMapping(value = "/basic01", method = RequestMethod.POST)
//	@RequestMapping("/basic01") //get, post 둘 다 허용
//	@GetMapping("/basic01") //get요청만 허용함
//	@PostMapping("/basic01") //get요청만 허용함
	public void basic01() {
		System.out.println("basic01요청");
	}
	
	//완전히 동일한 기능이 있으면, 요청을 {} 하나로 묶어서 사용할 수 있음.
	@RequestMapping({"/basic02", "/basic03"}) //value값이 배열 타입이기 때문에 배열 값이 들어갈 수 있음
	public void basic02() {
		System.out.println("basic02~03 요청 실행됨");
	}
	
	//////////////////////////////////////////////////
	//ex02 화면요청
	@RequestMapping("/ex02")
	public String ex02() {
		return "request/ex02";
	}
}
