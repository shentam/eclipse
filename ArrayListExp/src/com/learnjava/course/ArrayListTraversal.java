package com.learnjava.course;
import java.util.ArrayList;
import java.util.List;

public class ArrayListTraversal {
	

	public static void main(String[] args) {
		List<Integer> list =new ArrayList<Integer>();
		//����list

		for(int i=0;i<10;i++) {
			list.add(i);
			//ʹ��add()����,ͨ��forѭ����list������10��Ԫ�أ�ÿ��Ԫ�ؼ���ǰѭ���Ĵ���ֵ
		}
		
		System.out.println("Items in the list: ");
		System.out.println(list);
		//����б���ȫ��Ԫ��
		
		System.out.println("Item in the list with odd index: ");
		for (int i =1;i<list.size(); i+=2) {
			//����б������Ϊ������Ԫ�أ� ע��i+=2���÷�
			
			System.out.print(list.get(i)+" " );
		}
	}

}
