package com.spring.demo.model;

public class Punto {

	private int x;
	private int y;
	
	public Punto(){}
	
	public Punto(int x, int y){
		this.x=x;
		this.y=y;			
	}
	
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	
	public void coordenada(){
		System.out.println("Punto : ("+getX()+","+getY()+")");
	}
		
}
