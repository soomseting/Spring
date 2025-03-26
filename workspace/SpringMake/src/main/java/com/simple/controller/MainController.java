package com.simple.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.multiaction.MultiActionController;

//다양한 컨트롤러 상속
public class MainController extends MultiActionController {
	
	@Override
	protected ModelAndView handleRequestInternal(HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		
		String url = request.getRequestURI();
		String contextPath = request.getContextPath();
		String path = url.substring(contextPath.length());

		if(path.equals("/test/aaa")){
			//반환
			//
			ModelAndView mv = new ModelAndView();
			mv.addObject("data", "hello로 월드");
//			mv.setViewName("/WEB-INF/views/aaa.jsp");
			mv.setViewName("aaa");
			return mv; //디스패쳐서블릿으로 반환
		}else if(path.equals("test/bbb")) {
			
//			return new ModelAndView("/WEB-INF/views/bbb.jsp");
			return new ModelAndView("bbb");
		}
		//.......
		
		return super.handleRequestInternal(request, response);
	}
}
