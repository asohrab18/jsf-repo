package com.jsf.expert;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;

@ManagedBean
@ApplicationScoped
public class StudentsDetailsUtil {

	private List<Student> students;

	public StudentsDetailsUtil() {
		loadSampleData();
	}

	public void loadSampleData() {
		students = new ArrayList<>();
		
		students.add(new Student("Sohrab", "Alam", "sohrab.alam86@gmail.com"));
		students.add(new Student("John", "Doe", "john@luv2code.com"));
		students.add(new Student("Ajay", "Chauhan", "ajay@yahoo.com"));
	}

	public List<Student> getStudents() {
		return students;
	}
}
