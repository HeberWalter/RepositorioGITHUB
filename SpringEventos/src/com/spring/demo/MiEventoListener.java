package com.spring.demo;

import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

//para definir como spring bean
//spring usa ApplicationListener para todo tipo de evento
@Component
public class MiEventoListener implements ApplicationListener{

	@Override
	public void onApplicationEvent(ApplicationEvent event) {
		// TODO Auto-generated method stub
		System.out.println("Mensaje:");
		System.out.println(event.toString());//esto activa mi evento personalizado
	}

}
