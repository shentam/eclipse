package com.learnjava.course;

public class Test {

	public static void main(String[] args) {
		Book book =new Book("This is my 1st book","Peter","1234567890");
		//创建Book对象并设定其各个属性
		System.out.println("Book name: "+book.getName());
		//输出这本书的名字
		System.out.println("Book Author: "+book.getAuthor());
		//输出这本书的作者
		System.out.println("ISBN: "+book.getISBN());
		//输出这本书的编码
		Person person= new Person();//empty new object which use empty constructor
		person.setFirstName("Peter");
		person.setSurName("Young");
		person.setAge(38);
		person.setGender("Male");// use set method to instant object
		
		Person author =new Person("Xiaoming","Wang",29,"Female");
		//instant object by parameter
	
		
		Dog dog=new Dog("Ola","yellow",3,book.getAuthor());
		//normal instance
		
		
		Dog eva= Dog.newTestInstance();
		// static factory method
		
		Dog harry =new Dog();
		
		harry.setAge(2);
		harry.setColor("white");
		harry.setName("harry");
		harry.setMaster("Andy");
		
		System.out.println(person.output());
		System.out.println(author.output());
		System.out.println(dog.display());
		System.out.println(eva.display());
		System.out.println(harry.display());
	}

}
