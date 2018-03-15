package com.learnjava.course;

import java.util.HashMap;
import java.util.Scanner;


public class PhoneBookByMap {

	public static void main(String[] args) {
		HashMap <String,String> phonebook=new HashMap <String,String>();
		//创建一个HashMap对象，名称为phonebook，键值对的类型均为String
		
		Scanner scan = new Scanner(System.in);
		//创建扫描器用于获取用户的输入
		
		String keyword = new String();
		//创建一个名为keyword 的字符串用于存放用户输入的关键词
		
		phonebook= initPhoneBook(phonebook);
		//利用自写的initPhoneBook方法为电话簿装入数据，完成其初始化的步骤
		
		System.out.println("Please input  a name that you want to search: ");
		//提示用户输入待查询的姓名
		
		keyword =scan.nextLine();
		//将用户的输入信息装入字符串keyword中
		while (keyword.isEmpty()) {
			System.out.println("Please input a name! ");
			keyword =scan.nextLine();
		}
		
		//若用户有输入某个关键词，则按照该关键词在phonebook中查找其对应的号码
		System.out.println("The Result is :");
		System.out.println(queryPhone(phonebook,keyword));
		//这里调用了自写的queryPhone()方法
		scan.close();
		
	}
	
	private static HashMap<String, String> initPhoneBook(HashMap<String,String> phonebook){
		//该方法用于完成制定HashMap的初始化，为其装入一些号码数据，你也可以自定义这些数据
		//Q: 你还清楚形参和实参的区别吗？
		
		phonebook.put("Steve", "13012345678");
		phonebook.put("Bob", "028-80001234");
		phonebook.put("Peter","182222233333");
		//使用put()方法将姓名与电话号码相关联，存放在名为phonebook的HashMap中
		//put()方法中，第一个参数为关键词Key，第二个参数为其对应的值value
		
		
		return phonebook;
		//返回修改后的phonebook
		
	}
	
	private static String queryPhone(HashMap<String,String> phonebook, String keyword) {
		String result =new String();
		//创建存放结果的字符串result
		
		result=phonebook.get(keyword);
		//使用get()方法查询keyword所对应的电话号码，并赋给result;
		//put()方法中，参数为关键词key，返回值为其对应的值Value,未找到对应值时，返回值为null
		
		if(result ==null)
				return "Can not find this user.";
		//如果未找到该用户的电话号码，则将查询结果修改为“未找到该用户”
		
		return result;
		//返回查询结果
		
		
	}
	

}
