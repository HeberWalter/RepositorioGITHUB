package com.spring.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.demo.model.Cuadrado;
import com.spring.demo.model.Shape;
import com.spring.demo.model.Triangulo;
import com.spring.demo.service.ShapeService;



public class Graficador {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AbstractApplicationContext contexto = new ClassPathXmlApplicationContext("spring.xml");
		contexto.registerShutdownHook(); //para que destruya todo al acabar el main()
		
		//casteando de forma automatica con 2do parametro
		/*ShapeService shapeService=contexto.getBean("shapeService",ShapeService.class);
		shapeService.getCuadrado().dibujar();
		*/
		Shape shape=contexto.getBean("triangulo",Shape.class);
		shape.dibujar();
		
/*		Cuadrado cuadrado=contexto.getBean("cuadrado",Cuadrado.class);
		cuadrado.dibujar();*/
		
/*		Triangulo triangulo=contexto.getBean("triangulo",Triangulo.class);
		triangulo.dibujar();*/
	}

}
