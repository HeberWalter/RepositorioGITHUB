package com.hibernate.tutorial.model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.Table;

//SI QUIERES NO CAMBIAS NINGUN NOMBRE
@Entity
@Table (name="USER_DETAILS")
public class UserDetails {
	
	//LAS ANOTACIONES PUEDEN IR EN CADA PROPIEDAD O EN EL GETTER
	//VER GETTERS
	private int userId;	
	private String userName;
	//hibernate crea una tabla por cada coleccion, la 1ra columna es el ID del usuario
	//HashSet no soporta index a diferencia de ArrayList(en caso quieras que tenga ID la tabla dependiente)
	private Set<Address> ListOfAdressees = new HashSet();
	
	public UserDetails(){}
	
	public UserDetails(int userId,String userName){
		this.userId=userId;
		this.userName=userName;
	}
	
	@Id
	@Column(name="USER_ID")
	@GeneratedValue(strategy=GenerationType.AUTO)
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	@Column (name="USER_NAME")
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	@ElementCollection
	@JoinTable(name="USER_ADDRESS",
	//para personalizar la tabla y la columna que los relaciona
	joinColumns=@JoinColumn(name="USER_ID")) 
	public Set<Address> getListOfAdressees() {
		return ListOfAdressees;
	}

	public void setListOfAdressees(Set<Address> listOfAdressees) {
		ListOfAdressees = listOfAdressees;
	}
	
}
