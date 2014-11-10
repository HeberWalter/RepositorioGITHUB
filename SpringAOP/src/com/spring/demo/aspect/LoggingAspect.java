package com.spring.demo.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

import com.spring.demo.model.Cuadrado;

@Aspect
public class LoggingAspect {
	
	//@Before("execution(public * com.spring.demo.*.get*(..))")
	//@Before("execution(public * get*(..))")
	//@Before("execution(public * get*())")
	//@Before("allGetters() && allModelMethods()")
	//@Before("allGetters()")
	@Before("allModelMethods()")
	public void loggingAdvice(JoinPoint joinPoint){
		//conociendo el metodo
		System.out.println("Aviso: Aspecto invocado, metodo: "+joinPoint.toString());
		//conociendo el objeto que invoco al metodo
		System.out.println("Aviso: Aspecto invocado, objeto: "+joinPoint.getTarget());
	}
	
/*	@Before("allTriangleMethods()")
	public void secondAdvice(){
		System.out.println("Aviso: Segundo llamado de aspecto");
	}*/
	
	//si algo se repite hay que resumirlo
	@Pointcut("execution(public * get*())")
	public void allGetters(){}
	
	//@Pointcut("within(com.spring.demo.model.triangulo)")
	//@Pointcut("within(com.spring...*)") //mas general, aplica a varios paquetes
	@Pointcut("within(com.spring.demo.model.*)") //aplica a las clases del paquete
	public void allModelMethods(){}
	
/*	@Before("args(string)")
	public void stringArgumentMethods(){
		System.out.println("Un metodo que tiene como parametro un string");
	}
	
	@Before("args(name)")
	public void ArgumentMethods(String name){
		System.out.println("Un metodo que tiene como unico parametro: "+name);
	}*/
}
