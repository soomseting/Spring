package com.simple.command;

import java.util.ArrayList;

public class QuizVO {

	private String id;
	private String pw;
	private String name;
	private String email;

	public QuizVO() {
		// TODO Auto-generated constructor stub
	}

	
	public QuizVO(String id, String pw, String name, String email) {
		this.id = id;
		this.pw = pw;
		this.name = name;
		this.email = email;
	}
	
	@Override
	public String toString() {
		return "QuizMemberVO [id=" + id + ", pw=" + pw + ", name=" + name + ", email=" + email + "]";
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPw() {
		return pw;
	}

	public void setPw(String pw) {
		this.pw = pw;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	
}
