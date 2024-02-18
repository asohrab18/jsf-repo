package com.jsf.expert;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean
@SessionScoped
public class SessionCounter {

	private int dataValue = 0;

	public String increment() {
		dataValue++;
		return "session_counter";
	}

	public int getDataValue() {
		return dataValue;
	}

	public void setDataValue(int dataValue) {
		this.dataValue = dataValue;
	}

}
