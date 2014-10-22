package com.spring.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



public class Graficador {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AbstractApplicationContext contexto = new ClassPathXmlApplicationContext("spring.xml");
		contexto.registerShutdownHook(); //para que destruya todo al acabar el main()
		Triangulo triangulo=(Triangulo)contexto.getBean("triangulo");
		triangulo.dibujar();
		
		Cuadrado cuadrado=(Cuadrado)contexto.getBean("cuadrado");
		cuadrado.dibujar();
		
		System.out.println("hola gente como estan!!!");
		
	}

}
