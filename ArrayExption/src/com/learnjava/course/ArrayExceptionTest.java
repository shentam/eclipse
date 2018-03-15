package com.learnjava.course;

import java.util.Arrays;

public class ArrayExceptionTest {

	public static void main(String[] args) {
		int [] array =new int[5];
		//声明一个长度为5的整形数组array
		
		Arrays.fill(array,8);
		//将该数组所有元素赋值为8
		
		for (int i=0; i<6;i++) {
			//用便利的方式，输出所有数组元素，注意此处的控制条件i<6
			
			System.out.println("array[" + i + " ]= "+array[i]);
			//下标将会增加到5，显然是超出了数组array的范围（0-4），程序将在第六次循环前抛出异常
		}
	}

}
