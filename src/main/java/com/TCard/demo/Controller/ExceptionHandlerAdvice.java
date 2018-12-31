package com.TCard.demo.Controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.ModelAndView;

@ControllerAdvice
public class ExceptionHandlerAdvice {//全局应用
	@ExceptionHandler(value = Exception.class)
	public ModelAndView exception(Exception ex,WebRequest request){
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("errorSomething","somerror");
		modelAndView.setViewName("error");
		return modelAndView;
	}
	//如果我們要讓所有的@RequestMapping擁有此鍵值
	@ModelAttribute
	public void addAttribute(Model md){
		md.addAttribute("message","哪里出错啦~");
	}	
}