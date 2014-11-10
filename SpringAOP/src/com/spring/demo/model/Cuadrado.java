package com.spring.demo.model;

import java.util.List;

//con ApplicationEventPublisherAware le decimos a Spring que la clase puede publicar eventos
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
