package com.learnjava.course;

import java.util.Arrays;

public class ExceptionTest {

	public static void main(String[] args) {
		int [] array=new int[5];
		//����һ������Ϊ5������
		
		Arrays.fill(array, 5);
		//�������е�����Ԫ�ظ�ֵΪ5
		
		for(int i=4; i>-1;i--) {
			//ʹ��forѭ����������������飬iÿ�εݼ�
			if(i==0) {
				//���i������0����ʹ�ô��쳣��Ϣ�Ĺ��췽���׳��쳣
				
				throw new MyAriException("There is an exception occured.");
				
			}
			System.out.println("array["+i+"]/ "+i+" = "+array[i]/i);
			//���iû�г���0��������˽��
			
		}

	}

}
