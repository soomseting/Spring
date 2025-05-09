package com.simple.ex04;import javax.print.Doc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Printer {
	
	/*
	 * Printer객체가 생성될 때 @Autowired에 의해서 적합한 bean객체가 자동으로 주입.
	 * @Autowired는 객체를 탐지할 때
	 * 타입 -> 이름 으로 찾게 됩니다.
	 * 
	 * 생성자, setter, 멤버변수에 적용할 수 있음.
	 * 
	 * @Resource
	 * @Inject
	 * 어노테이션 같은 역할을 함
	 */
	@Autowired //Autowired와 Qualifier는 둘이 짝이라 붙어다님.
	@Qualifier("doc1") //적합한 빈 이름으로 강제 연결 <- 굉장히 중요함★★★★★
	private Document document;
	
	// 기본생성자를 만들어야 Qualifier가 오류를 일으키지 않음.
	public Printer() {
		
	}
	
	//생성자
	public Printer(Document document) {
		this.document = document;
	}

	//getter/setter
	public Document getDocument() {
		return document;
	}

	public void setDocument(Document document) {
		this.document = document;
	}
	
	
}
