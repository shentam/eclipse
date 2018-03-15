package com.learnjava.course;
import java.util.Scanner;

public class ChangeCase {

	public static void main(String[] args) {
		String a = new String();
		String b = new String();
		String c = new String();
		String d = new String();
		
		Scanner scan =new Scanner(System.in);
		
		System.out.println("Please input a sentence includes upcase and lowcase: ");
		
		a = scan.nextLine();
		
		Scanner decider =new Scanner (System.in);
		System.out.println("Please select upper or lower case version byt typein U for uppercase or L for lowercase or E for exit:");
		d =(decider.nextLine()).toUpperCase();
		b = a.toLowerCase();
		
		c= a.toUpperCase();
		System.out.println("String a is : "+a);
		for(int i=0;i>=0;i++) {
			if (d.equals("U")) {
				System.out.println("the uppercase version of your input is : " +c);
				d="";
			}
			else if (d.equals("L")) {
				System.out.println("The lowercase version of your input is : " +b);
				d="";
			}
			else if(d.equals("E")) {
				break;
			}
			else {
				System.out.println("Please input either U or L or E :");
				d =(decider.nextLine()).toUpperCase();
			}
		}
		
	
		
		

	}

}
