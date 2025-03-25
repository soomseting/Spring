package com.simple.ex05;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.simple.ex02.Hotel;

public class MainClass {
	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext ctx = 
				new AnnotationConfigApplicationContext(JavaConfig.class); //javaconfig 파일 읽어서 bean 생성을 일으킴
		Hotel hotel = ctx.getBean(Hotel.class);
		hotel.getChef().cooking();
	}
}
