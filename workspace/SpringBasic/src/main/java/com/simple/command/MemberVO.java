package com.simple.command;

import java.util.ArrayList;

public class MemberVO { // DTO랑 똑같은 거임

	private String id;
	private String pw;
	private String name;
	private ArrayList<String> inter;
	private String nick;
	private String birth;
	private String email;

	@Override
	public String toString() {
		return "MemberVO [getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}

	public MemberVO() {

	}

	public MemberVO(String id, String pw, String name, ArrayList<String> inter, String nick, String birth,
			String email) {
		super();
		this.id = id;
		this.pw = pw;
		this.name = name;
		this.inter = inter;
		this.nick = nick;
		this.birth = birth;
		this.email = email;
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

	public ArrayList<String> getInter() {
		return inter;
	}

	public void setInter(ArrayList<String> inter) {
		this.inter = inter;
	}

	public String getNick() {
		return nick;
	}

	public void setNick(String nick) {
		this.nick = nick;
	}

	public String getBirth() {
		return birth;
	}

	public void setBirth(String birth) {
		this.birth = birth;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

}
