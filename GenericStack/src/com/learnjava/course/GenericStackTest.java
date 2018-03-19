package com.learnjava.course;

public class GenericStackTest {

	public static void main(String[] args) {
		GenericStack<String> stack =new GenericStack<String>();
		//我们创建GenericStack对象是填入了String类型，表明这个栈里面只能存放字符串元素
		//声明了一个GenericStack对象，名字为stack
		
		System.out.println("Now add some words into stack.");
		
		stack.push("Learn java");
		System.out.println("word -'Learn java' added.");
		stack.push("Learning");
		System.out.println("word - 'Learning' added.");
		//添加两个元素到栈里面去
		//Q:现在哪个词在栈顶？
		
		System.out.println("Now pop words from stack.");
		while(!stack.isEmpty()) {
			//只要栈不为空，就取出其中的元素并打印出来
			
			String s = (String)stack.pop();
			//这里为确保下一步执行的正确，用到了强制类型转换
			
			System.out.println("word - "+"'"+s+"'" +" has been taken out.");
			
		}

	}

}
