package com.JavaLearning.course;

public class Test {

	public static void main(String[] args) {
		Book book =new Book("This is my 1st book","Peter","1234567890");
		//����Book�����趨���������
		System.out.println("Book name: "+book.getName());
		//����Ȿ�������
		System.out.println("Book Author: "+ book.getAuthor());
		//����Ȿ�������
		System.out.println("ISBN: "+ book.getISBN());
		//����Ȿ��ı���
		
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
