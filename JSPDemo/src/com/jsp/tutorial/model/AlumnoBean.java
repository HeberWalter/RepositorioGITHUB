package com.jsp.tutorial.model;

public class AlumnoBean {
	private String nombre;
	private String apellidos;
	
	public AlumnoBean() {
		super();
	}

	public AlumnoBean(String nombre, String apellidos) {
		super();
		this.nombre = nombre;
		this.apellidos = apellidos;
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellidos() {
		return apellidos;
	}
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	
	
}
