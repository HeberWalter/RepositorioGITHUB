package com.spring.demo;

public class Triangulo {

	private Punto puntoA;
	private Punto puntoB;
	private Punto puntoC;
	
/*	public Triangulo(Punto puntoA, Punto puntoB, Punto puntoC) {
		super();
		this.puntoA = puntoA;
		this.puntoB = puntoB;
		this.puntoC = puntoC;
	}*/
	
	public Punto getPuntoA() {
		return puntoA;
	}
	public void setPuntoA(Punto puntoA) {
		this.puntoA = puntoA;
	}
	public Punto getPuntoB() {
		return puntoB;
	}
	public void setPuntoB(Punto puntoB) {
		this.puntoB = puntoB;
	}
	public Punto getPuntoC() {
		return puntoC;
	}
	public void setPuntoC(Punto puntoC) {
		this.puntoC = puntoC;
	}
	
	public void dibujar(){
		System.out.println("Punto A : ("+puntoA.getX()+","+puntoA.getY()+")");
		System.out.println("Punto B : ("+puntoB.getX()+","+puntoB.getY()+")");
		System.out.println("Punto C : ("+puntoC.getX()+","+puntoC.getY()+")");
	}
	
}
