package com.hibernate.tutorial.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.hibernate.tutorial.model.Address;
import com.hibernate.tutorial.model.UserDetails;

public class HibernateTest {
	
	public static void main(String[] args) {
		UserDetails user = new UserDetails(1,"Heber");
		//UserDetails user2 = new UserDetails(2,"Walter");
		
		Address addr1= new Address("STREET 1","CITY 1","STATE 1","PINCODE 1");
		Address addr2= new Address("STREET 2","CITY 2","STATE 2","PINCODE 2");
		
		user.getListOfAdressees().add(addr1);
		user.getListOfAdressees().add(addr2);
		
		SessionFactory sessionFactory =new Configuration().configure().buildSessionFactory();
		
		//grabando el objeto
		Session session=sessionFactory.openSession();
		session.beginTransaction();
		session.save(user);
		session.getTransaction().commit();
		
		//recuperando el objeto guardado
		user = null;
		session = sessionFactory.openSession();
		session.beginTransaction();
		user = (UserDetails)session.get(UserDetails.class,1);
		
		System.out.println("Imprimiendo nombres:");
		System.out.println(user.getUserName());
		
	}
}
