package com.learnjava.course;

public class MyAriException extends ArithmeticException {
	//�Զ����쳣�࣬����̳���ArithmeticException
	
	public MyAriException(){
		
	}
	
	//ʵ��Ĭ�ϵ��޲ι��췽��
	
	public MyAriException(String msg) {
		super(msg);
	}
	//ʵ�ֿ����Զ��������Ϣ�Ĺ��췽�������������Ϣ��Ϊ�������뼴��
	
}
