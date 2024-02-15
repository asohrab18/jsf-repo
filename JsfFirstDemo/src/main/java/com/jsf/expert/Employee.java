package com.jsf.expert;

import java.util.Arrays;
import java.util.List;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class Employee {

	private String firstName;
	private String lastName;
	private String country;
	private List<String> countryOptions;

	public Employee() {
		countryOptions = Arrays.asList("Australia", "Brazil", "China", "Denmark", "France", "Germany", "India", "Japan",
				"Malaysia", "Netherlands");
	}

	public List<String> getCountryOptions() {
		return countryOptions;
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

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

}
