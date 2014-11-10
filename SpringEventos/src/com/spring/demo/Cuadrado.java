package com.spring.demo;

import java.util.List;

import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;

//con ApplicationEventPublisherAware le decimos a Spring que la clase puede publicar eventos
public class Cuadrado implements Shape,ApplicationEventPublisherAware{
	
	private List<Punto> puntos;
	private ApplicationEventPublisher publisher;

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
		
		EventoDibujar eventoDibujar = new EventoDibujar(this);
		publisher.publishEvent(eventoDibujar);//esto activa mi Listener personalizado
	}

	@Override
	public void setApplicationEventPublisher(ApplicationEventPublisher publisher) {
		// TODO Auto-generated method stub
		this.publisher = publisher;
	}
	
}
