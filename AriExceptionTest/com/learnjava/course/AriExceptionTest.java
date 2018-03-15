package com.learnjava.course;

public class AriExceptionTest {

	public static void main(String[] args) {
		System.out.println("Example 1: -1.0/0= "+(-1.0/0));
		//演示负浮点数除0
		System.out.println("Example 2: +1.0/0= "+(+1.0/0));
		//演示正浮点数除0
		System.out.println("Example 3: -1/0= "+(-1/0));
		//演示负整数除0
		System.out.println("Example 4: 1/0= "+(1/0));
		//演示正整数除0
	}

}
