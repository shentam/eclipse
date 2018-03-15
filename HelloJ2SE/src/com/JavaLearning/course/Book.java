package com.JavaLearning.course;

public class Book {
	private String name; //书名
	private String author; //作者
	private String ISBN; // 编码
	// Tips: ISBN是国际标准书号，每本书北面的条形码即为此物
	
	public Book(String name, String author, String ISBN) {
	// 利用构造方法初始化域
		this.name=name;
		this.author=author;
		this.ISBN=ISBN;
	
		//Q:你清楚this的用法吗？
	}
	
	public String getName() { //获得书名
		return name;
	}

	public String getAuthor() { //获得作者
		return author;
	}
	
	public String getISBN() { //获得编码
		return ISBN;
	}
}
