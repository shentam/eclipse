package com.learnjava.course;

import java.util.LinkedList;

public class GenericStack <T> {
	//������һ����������ΪT�ķ�����
	
	private LinkedList <T> stackContainer =new LinkedList<T>();
	//ʹ��T���͵�LinkedList��������Ϊջ������
	
	public void push (T t) {
		//�Զ�����һ����ջ�ķ��������е�����addFirst()����
		//addFirst()����������ջ�Ķ��˼���Ԫ��
		
		stackContainer.addFirst(t);
		
	}
	public T pop() {
		//������һ����ս�ķ��������е�����removeFirst()����
		//removeFirst()�������Խ�ջ���˵�Ԫ���Ƴ���ȡ����Ϊ����ֵ
		
		return stackContainer.removeFirst();
		
	}
	
	public boolean isEmpty() {
		//������һ���ж��Ƿ�Ϊ��ջ�ķ�����������LinkedList�����isEmpty()����
		return stackContainer.isEmpty();
		
	}
}
