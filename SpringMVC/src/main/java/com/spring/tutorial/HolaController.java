package com.spring.tutorial;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HolaController {
	@RequestMapping("irHola")
	public ModelAndView redireccion(){
		ModelAndView mv= new ModelAndView();
		//para indicar la pagina a devolver
		mv.setViewName("Hola");	
		return mv;
	}
}
