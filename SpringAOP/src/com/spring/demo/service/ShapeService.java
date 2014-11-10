package com.spring.demo.service;

import com.spring.demo.model.Cuadrado;
import com.spring.demo.model.Triangulo;

public class ShapeService {
	private Cuadrado cuadrado;
	private Triangulo triangulo;
	
	public Cuadrado getCuadrado() {
		return cuadrado;
	}
	public void setCuadrado(Cuadrado cuadrado) {
		this.cuadrado = cuadrado;
	}
	public Triangulo getTriangulo() {
		return triangulo;
	}
	public void setTriangulo(Triangulo triangulo) {
		this.triangulo = triangulo;
	}
	
	
}
