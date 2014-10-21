package com.spring.demo;

import java.util.List;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class Cuadrado implements ApplicationContextAware,BeanNameAware {
	
	private List<Punto> puntos;
	private ApplicationContext contexto=null;

	public List<Punto> getPuntos() {
		return puntos;
	}

	public void setPuntos(List<Punto> puntos) {
		this.puntos = puntos;
	}
	
	public void dibujar(){
		/*for(int i=0;i<=puntos.size();i++){
			System.out.println("Punto: ("+puntos.get(i).getX()+","+puntos.get(i).getY()+")");
		}*/
		for (Punto punto:puntos){
			System.out.println("Punto: ("+punto.getX()+","+punto.getY()+")");
		}
	}

	@Override
	public void setApplicationContext(ApplicationContext contexto)
			throws BeansException {
		this.contexto=contexto;		
	}

	@Override
	public void setBeanName(String beanName) {
		//como spring crea todos los objetos definidos en spring.xml, el mensaje saldra
		//por todos los cuadrados que existan
		System.out.println("El nombre del bean es: "+beanName);		
	}

}
