package com.jsf.expert;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.validator.ValidatorException;

@ManagedBean
public class Associate {

	private String firstName;
	private String lastName;
	private String courseCode;

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

	public String getCourseCode() {
		return courseCode;
	}

	public void setCourseCode(String courseCode) {
		this.courseCode = courseCode;
	}

	public void validateCourseCode(FacesContext context, UIComponent component, Object value) throws ValidatorException {
		//value holds the text entered by user. 
		if (value == null) {
			return;
		}
		String data = value.toString();
		if (!data.startsWith("LUV")) {
			FacesMessage message = new FacesMessage("Course Code must start with LUV");
			throw new ValidatorException(message);
		}
		if (data.length() <= 3) {
			FacesMessage message = new FacesMessage("Please write your complete Course Code.");
			throw new ValidatorException(message);
		}
	}
}
