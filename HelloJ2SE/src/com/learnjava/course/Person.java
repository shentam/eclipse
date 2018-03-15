package com.learnjava.course;

public class Person {
	private String firstName;
	private String surName;
	private int age;
	private String gender;
	
	public Person(String firstName, String surName,int age, String gender){
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
	public String getFullName() {
		return (getFirstName() +" " +getSurName());
	}
	public String getGender() {
		return gender;
	}
	public int getAge() {
		return age;
	}
	public String output() {
		String res ="This person's name is: "+getFullName()+"\n"+"Age is:" +getAge()+"\n"+"Gender is: "+getGender();
		return res;
	}
}
