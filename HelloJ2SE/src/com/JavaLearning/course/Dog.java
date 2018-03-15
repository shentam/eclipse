package com.JavaLearning.course;

public class Dog {
	private String name;
	private String color;
	private int age;
	
	public Dog(String name,String color, int age) {
		this.name=name;
		this.color=color;
		this.age=age;
	}
	
	public String getName() {
		return name;
	}
	public String getColor() {
		return color;
	}
	public int getAge() {
		return age;
	}
}
