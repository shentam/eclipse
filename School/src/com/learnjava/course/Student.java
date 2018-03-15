package com.learnjava.course;

public class Student {
	private String name;
	private String dob;
	private String gender;
	

	public Student(String name, String dob, String gender) {
		this.name=name;
		this.dob=dob;
		this.gender=gender;
	}
	
	public String getName() {
		return name;
	}
	
	public String getDob() {
		return dob;
	}
	
	public String getGender(){
		return gender;
	}
}
