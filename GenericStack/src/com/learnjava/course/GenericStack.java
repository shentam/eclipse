package com.learnjava.course;

import java.util.LinkedList;

public class GenericStack <T> {
	//定义了一个参数类型为T的泛型类
	
	private LinkedList <T> stackContainer =new LinkedList<T>();
	//使用T类型的LinkedList（链表）作为栈的容器
	
	public void push (T t) {
		//自定义了一个入栈的方法，其中调用了addFirst()方法
		//addFirst()方法可以在栈的顶端加入元素
		
		stackContainer.addFirst(t);
		
	}
	public T pop() {
		//定义了一个出战的方法，其中调用了removeFirst()方法
		//removeFirst()方法可以将栈顶端的元素移除并取出作为返回值
		
		return stackContainer.removeFirst();
		
	}
	
	public boolean isEmpty() {
		//定义了一个判断是否为空栈的方法，调用了LinkedList本身的isEmpty()方法
		return stackContainer.isEmpty();
		
	}
}
