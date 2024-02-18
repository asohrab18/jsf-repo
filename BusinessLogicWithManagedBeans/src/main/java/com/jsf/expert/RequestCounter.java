package com.jsf.expert;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

@ManagedBean
@RequestScoped//This annotation is optional because Default Scope is request scope, if not specified. 
public class RequestCounter {

	private int dataValue = 0;

	public String increment() {
		dataValue++;
		return "request_counter";
	}

	public int getDataValue() {
		return dataValue;
	}

	public void setDataValue(int dataValue) {
		this.dataValue = dataValue;
	}

}
