package com.JavaLearning.course;

public class Test {

	public static void main(String[] args) {
		Book book =new Book("This is my 1st book","Peter","1234567890");
		//创建Book对象并设定其各自属性
		System.out.println("Book name: "+book.getName());
		//输出这本书的名字
		System.out.println("Book Author: "+ book.getAuthor());
		//输出这本书的作者
		System.out.println("ISBN: "+ book.getISBN());
		//输出这本书的编码
		
		Person person=new Person("Peter", "Pan",67,"Male");
		System.out.println("FirstName is: "+ person.getFirstName());
		System.out.println("SurName is: "+ person.getSurName());
		System.out.println("Age is: "+ person.getAge());
		System.out.println("Gender is: "+person.getGender());
	
		Dog dog=new Dog("Dave", "yello",7);
		System.out.println("Dog Name is: "+ dog.getName());
		System.out.println("Color is: "+ dog.getColor());
		System.out.println("Age is: "+ dog.getAge());
	}

}
