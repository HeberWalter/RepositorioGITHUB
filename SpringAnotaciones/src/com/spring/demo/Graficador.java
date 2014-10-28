package com.spring.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



public class Graficador {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AbstractApplicationContext contexto = new ClassPathXmlApplicationContext("spring.xml");
		contexto.registerShutdownHook(); //para que destruya todo al acabar el main()
		
/*		Shape shape1=(Triangulo)contexto.getBean("triangulo");
		shape1.dibujar();		
		
		Shape shape2=(Cuadrado)contexto.getBean("cuadrado");
		shape2.dibujar();	*/	
		
		System.out.println("Imprimiendo centro del circulo:");
		Shape shape3=(Circulo)contexto.getBean("circulo");
		shape3.dibujar();	
	}

}
