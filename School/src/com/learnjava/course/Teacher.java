package com.learnjava.course;


public class Teacher extends Student{
	private int ageOfWork;
	
	public Teacher(String name, String dob, String gender, int ageOfWork) {
		super(name,dob,gender);
		//������ʹ��super�̳и���constructor
		this.ageOfWork=ageOfWork;
	}

	public int getAgeOfWork() {
		return ageOfWork;
	}

}
