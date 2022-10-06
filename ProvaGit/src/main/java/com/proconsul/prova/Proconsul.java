package com.proconsul.prova;

public class Proconsul {

	private String lastName;
	private String firstName;
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	
	//---------------------------------------------------------//
	
	public Proconsul(String lastName, String firstName) {
		this.lastName = lastName;
		this.firstName = firstName;
	}
	
	
}
