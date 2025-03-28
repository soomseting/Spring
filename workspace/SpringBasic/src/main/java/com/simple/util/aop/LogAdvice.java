package com.simple.util.aop;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect //AOP설정이야~~
@Component //컴포넌트 스캔이 읽어서 빈으로 생성
public class LogAdvice {

	//메서드 이전에 동작
	@Before("execution(* com.simple.score.service.ScoreServiceImpl*.*(..))")
	public void beforeLog() {
		System.out.println("메서드 동작 전에 실행됨");
	}
	//메서드 이후에 동작
	@After("execution(* com.simple.score.service.ScoreServiceImpl*.*(..))")
	public void AfterLog() {
		System.out.println("메서드 동작 후에 실행됨!!");
	}
	
	//에러발생 시에 동작
	@AfterThrowing(pointcut =  "execution(* com.simple.score.service.ScoreServiceImpl*.*(..))", throwing = "e")
	public void errorLog(Exception e) {
		System.out.println("에러 발생시에 동작함: " + e);
	}
	
	
}
