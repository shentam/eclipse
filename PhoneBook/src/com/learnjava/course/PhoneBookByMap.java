package com.learnjava.course;

import java.util.HashMap;
import java.util.Scanner;


public class PhoneBookByMap {

	public static void main(String[] args) {
		HashMap <String,String> phonebook=new HashMap <String,String>();
		//����һ��HashMap��������Ϊphonebook����ֵ�Ե����;�ΪString
		
		Scanner scan = new Scanner(System.in);
		//����ɨ�������ڻ�ȡ�û�������
		
		String keyword = new String();
		//����һ����Ϊkeyword ���ַ������ڴ���û�����Ĺؼ���
		
		phonebook= initPhoneBook(phonebook);
		//������д��initPhoneBook����Ϊ�绰��װ�����ݣ�������ʼ���Ĳ���
		
		System.out.println("Please input  a name that you want to search: ");
		//��ʾ�û��������ѯ������
		
		keyword =scan.nextLine();
		//���û���������Ϣװ���ַ���keyword��
		while (keyword.isEmpty()) {
			System.out.println("Please input a name! ");
			keyword =scan.nextLine();
		}
		
		//���û�������ĳ���ؼ��ʣ����ոùؼ�����phonebook�в������Ӧ�ĺ���
		System.out.println("The Result is :");
		System.out.println(queryPhone(phonebook,keyword));
		//�����������д��queryPhone()����
		scan.close();
		
	}
	
	private static HashMap<String, String> initPhoneBook(HashMap<String,String> phonebook){
		//�÷�����������ƶ�HashMap�ĳ�ʼ����Ϊ��װ��һЩ�������ݣ���Ҳ�����Զ�����Щ����
		//Q: �㻹����βκ�ʵ�ε�������
		
		phonebook.put("Steve", "13012345678");
		phonebook.put("Bob", "028-80001234");
		phonebook.put("Peter","182222233333");
		//ʹ��put()������������绰������������������Ϊphonebook��HashMap��
		//put()�����У���һ������Ϊ�ؼ���Key���ڶ�������Ϊ���Ӧ��ֵvalue
		
		
		return phonebook;
		//�����޸ĺ��phonebook
		
	}
	
	private static String queryPhone(HashMap<String,String> phonebook, String keyword) {
		String result =new String();
		//������Ž�����ַ���result
		
		result=phonebook.get(keyword);
		//ʹ��get()������ѯkeyword����Ӧ�ĵ绰���룬������result;
		//put()�����У�����Ϊ�ؼ���key������ֵΪ���Ӧ��ֵValue,δ�ҵ���Ӧֵʱ������ֵΪnull
		
		if(result ==null)
				return "Can not find this user.";
		//���δ�ҵ����û��ĵ绰���룬�򽫲�ѯ����޸�Ϊ��δ�ҵ����û���
		
		return result;
		//���ز�ѯ���
		
		
	}
	

}
