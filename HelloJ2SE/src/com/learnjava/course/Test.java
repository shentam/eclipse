package com.learnjava.course;

public class Test {

	public static void main(String[] args) {
		Book book =new Book("This is my 1st book","Peter","1234567890");
		//����Book�����趨���������
		System.out.println("Book name: "+book.getName());
		//����Ȿ�������
		System.out.println("Book Author: "+book.getAuthor());
		//����Ȿ�������
		System.out.println("ISBN: "+book.getISBN());
		//����Ȿ��ı���
		Person person= new Person(book.getAuthor(),"Young",38,"Male");
		Dog dog=new Dog("Ola","yellow",3,book.getAuthor());
		System.out.println(person.output());
		System.out.println(dog.display());
	}

}
