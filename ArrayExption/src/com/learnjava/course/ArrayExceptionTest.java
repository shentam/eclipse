package com.learnjava.course;

import java.util.Arrays;

public class ArrayExceptionTest {

	public static void main(String[] args) {
		int [] array =new int[5];
		//����һ������Ϊ5����������array
		
		Arrays.fill(array,8);
		//������������Ԫ�ظ�ֵΪ8
		
		for (int i=0; i<6;i++) {
			//�ñ����ķ�ʽ�������������Ԫ�أ�ע��˴��Ŀ�������i<6
			
			System.out.println("array[" + i + " ]= "+array[i]);
			//�±꽫�����ӵ�5����Ȼ�ǳ���������array�ķ�Χ��0-4���������ڵ�����ѭ��ǰ�׳��쳣
		}
	}

}
