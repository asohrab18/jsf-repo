package com.jsf.expert;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class Candidate {

	private String firstName;
	private String lastName;
	private String gender;

	public Candidate() {
		firstName = "Marry";
		lastName = "Blossoms";
		gender = "Female";
	}

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

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

}
