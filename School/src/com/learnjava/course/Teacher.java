package com.learnjava.course;


public class Teacher extends Student{
	private int ageOfWork;
	
	public Teacher(String name, String dob, String gender, int ageOfWork) {
		super(name,dob,gender);
		//在这里使用super继承父类constructor
		this.ageOfWork=ageOfWork;
	}

	public int getAgeOfWork() {
		return ageOfWork;
	}

}
