package com.JavaLearning.course;

public class Person {
	private String firstName;
	private String surName;
	private int age;
	private String gender;
	
	public Person(String firstName, String surName, int age, String gender) {
		this.firstName=firstName;
		this.surName=surName;
		this.age=age;
		this.gender=gender;
	}
	
	public String getFirstName() {
		return firstName;
	}
	
	public String getSurName() {
		return surName;
	}
	
	public int getAge() {
		return age;
	}
	
	public String getGender() {
		return gender;
	}
}
