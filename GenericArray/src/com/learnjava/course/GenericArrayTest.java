package com.learnjava.course;

public class GenericArrayTest {

	public static void main(String[] args) {
		GenericArray <String> arrayTest = new GenericArray<String>();
		
		for(int i=0;i<3;i++) {
			arrayTest.put(i, Integer.toString(i));
			System.out.println("word - " +Integer.toString(i)+ " has been added into array["+i+"]");
		}
		for(int i=0;i<arrayTest.size();i++) {
			System.out.println("The value in index ["+i+"] of array is :"+arrayTest.get(i));
		}
	}

}
