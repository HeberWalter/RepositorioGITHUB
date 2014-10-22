package com.spring.demo;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.FileSystemResource;


public class Graficador {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Colocas el spring.xml al mismo nivel que el source y ejecutas
		BeanFactory factory=new XmlBeanFactory(new FileSystemResource("spring.xml"));
		Punto puntoA=(Punto)factory.getBean("puntoA");
		puntoA.coordenada();
		*/		
		//ApplicationContext tiene mas cosas que el BeanFactory
		ApplicationContext contexto = new ClassPathXmlApplicationContext("spring.xml");
		
		System.out.println("Imprimiendo puntos de triangulo");
		Triangulo triangulo=(Triangulo)contexto.getBean("trianguloHijo");
		triangulo.dibujar();
		
		System.out.println("Imprimiendo puntos de cuadrado");
		Cuadrado cuadrado=(Cuadrado)contexto.getBean("cuadradoHijo");
		cuadrado.dibujar();

	}

}
