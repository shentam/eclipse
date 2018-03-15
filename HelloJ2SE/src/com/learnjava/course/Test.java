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
		Person person= new Person(book.getAuthor(),"Young",38,"Male");
		Dog dog=new Dog("Ola","yellow",3,book.getAuthor());
		System.out.println(person.output());
		System.out.println(dog.display());
	}

}
