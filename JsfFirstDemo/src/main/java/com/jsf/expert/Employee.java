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
	private String gender;
	private List<String> genderOptions;
	private String[] favoriteLanguages;

	public Employee() {
		countryOptions = Arrays.asList("Australia", "Brazil", "China", "Denmark", "France", "Germany", "India", "Japan",
				"Malaysia", "Netherlands");
		genderOptions = Arrays.asList("Male", "Female", "Others");

	}

	public List<String> getCountryOptions() {
		return countryOptions;
	}

	public List<String> getGenderOptions() {
		return genderOptions;
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

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String[] getFavoriteLanguages() {
		return favoriteLanguages;
	}

	public void setFavoriteLanguages(String[] favoriteLanguages) {
		this.favoriteLanguages = favoriteLanguages;
	}

}
