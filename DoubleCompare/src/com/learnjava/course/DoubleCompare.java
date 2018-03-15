package com.learnjava.course;

public class DoubleCompare {

	public static void main(String[] args) {
		String s_1="123.321";
		String s_2="567.765";
		
		
		Double num_1=Double.parseDouble(s_1);
		Double num_2=Double.parseDouble(s_2);
		
		System.out.println("number 1: " +num_1);
		System.out.println("nubmer 2: " +num_2);
		
		switch (num_1.compareTo(num_2)){
			case -1:
			System.out.println("number 1  is smaller than number 2");
			break;
			case 0:
			System.out.println("nubmer 1 is equals to number 2");
			break;
			case 1:
			System.out.println("number 1 is bigger than number 2");
			break;
		}
	}

}
