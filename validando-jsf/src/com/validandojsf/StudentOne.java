package com.validandojsf;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class StudentOne {
	
	private String firstName;
	private String lastName;
	private String email;
	
	// construtor abaixo	
	public StudentOne() {
		
	}
	
	//criando getters e setters

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	
}
