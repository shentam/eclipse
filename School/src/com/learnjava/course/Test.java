package com.learnjava.course;

public class Test {

	public static void main(String[] args) {
		Student student_1 =new Student("Andy","1981/07/30","Male");
		Student student_2=new Student("Alex","1982/07/26","Female");
		
		Teacher teacher_1= new Teacher("Chao","1949/08/24","Male",30);
		
		System.out.println("Student name: "+student_1.getName());
		System.out.println("Student Date of Birth: "+student_1.getDob());
		System.out.println("Student gender: "+student_1.getGender());
		
		System.out.println("Student name: "+student_2.getName());
		System.out.println("Student Date of Birth: "+student_2.getDob());	
		System.out.println("Studnet gender: " +student_2.getGender());
		
		System.out.println("Teacher name: "+teacher_1.getName());
		System.out.println("Teacher Date of Birth: "+teacher_1.getDob());	
		System.out.println("Teacher gender: " +teacher_1.getGender());
		System.out.println("Teacher's age of work is: "+teacher_1.getAgeOfWork());
	}

}
