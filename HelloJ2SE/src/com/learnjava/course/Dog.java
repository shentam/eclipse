package com.learnjava.course;

public class Dog {
	private String name;
	private String color;
	private int age;
	private String master;
	
	public Dog(String name,String color,int age, String master) {
		this.name=name;
		this.color=color;
		this.age=age;
		this.master=master;
	}
	
	public String getMaster() {
		return master;
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
	public String display() {
		String res="The "+getAge()+" years old "+getColor()+" dog " + getName()+" is belongs to "+ getMaster();
		return res;
	}

}
