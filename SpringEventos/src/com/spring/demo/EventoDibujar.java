package com.spring.demo;

import org.springframework.context.ApplicationEvent;

public class EventoDibujar extends ApplicationEvent{

	public EventoDibujar(Object source) {
		super(source);
		// TODO Auto-generated constructor stub
	}
	
	public String toString(){
		return "Ha ocurrido mi evento personalizado";
	}

}
