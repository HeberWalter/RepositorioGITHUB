package com.spring.demo;

import java.util.List;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class Cuadrado implements Shape{
	
	private List<Punto> puntos;

	public List<Punto> getPuntos() {
		return puntos;
	}

	public void setPuntos(List<Punto> puntos) {
		this.puntos = puntos;
	}
	
	public void dibujar(){
		for (Punto punto:puntos){
			System.out.println("Punto: ("+punto.getX()+","+punto.getY()+")");
		}
	}
	
}
