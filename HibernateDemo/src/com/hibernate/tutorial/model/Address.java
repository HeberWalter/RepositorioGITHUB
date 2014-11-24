package com.hibernate.tutorial.model;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable //cuando se instancie una clase que referencia a Address, la tabla generada se le agregara 
//todos los campos de Address
public class Address {

	@Column(name="STREET_NAME")
	private String street;
	@Column(name="CITY_NAME")
	private String city;
	@Column(name="STATE_NAME")
	private String state;
	@Column(name="PINCODE_NAME")
	private String pinCode;
		
	public Address() {
		super();
	}
	
	public Address(String street, String city, String state, String pinCode) {
		super();
		this.street = street;
		this.city = city;
		this.state = state;
		this.pinCode = pinCode;
	}

	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getPinCode() {
		return pinCode;
	}
	public void setPinCode(String pinCode) {
		this.pinCode = pinCode;
	}	
	
}
