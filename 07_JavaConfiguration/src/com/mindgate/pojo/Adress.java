package com.mindgate.pojo;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("adress")
@Scope("prototype")
public class Adress {
 private int  adressId;
 private String street;
 private String city;
 private String state;
 
 public Adress() {
	 System.out.println("default constructor of adress called");
}

public Adress(int adressId, String street, String city, String state) {
	super();
	this.adressId = adressId;
	this.street = street;
	this.city = city;
	this.state = state;
	System.err.println("overlaoded constructor of adress called");
}

public int getAdressId() {
	return adressId;
}

public void setAdressId(int adressId) {
	this.adressId = adressId;
	System.out.println(" set adress Id"+adressId);
}

public String getStreet() {
	return street;
}

public void setStreet(String street) {
	this.street = street;
	System.out.println(" set street"+street);
}

public String getCity() {
	return city;
}

public void setCity(String city) {
	this.city = city;
	System.out.println(" set city"+city);
}

public String getState() {
	return state;
}

public void setState(String state) {
	this.state = state;
	System.out.println("  set state"+state);
}

@Override
public String toString() {
	return "Adress [adressId=" + adressId + ", street=" + street + ", city=" + city + ", state=" + state + "]";
}
 

	
	
}
