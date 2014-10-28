package com.spring.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Required;

public class Circulo implements Shape{

	private Punto centro;

	public Punto getCentro() {
		return centro;
	}
	
	@Required //es un BeanPostProcessor validando internamente
	@Autowired
	@Qualifier("aliasCentro") //pista,cuando no quieres cambiar el nombre de ningun bean en spring.xml, pero el autowired no funcionaria
	public void setCentro(Punto centro) {
		this.centro = centro;
	}

	@Override
	public void dibujar() {
		// TODO Auto-generated method stub
		centro.coordenada();
	}
	
}
