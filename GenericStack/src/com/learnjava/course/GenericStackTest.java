package com.learnjava.course;

public class GenericStackTest {

	public static void main(String[] args) {
		GenericStack<String> stack =new GenericStack<String>();
		//���Ǵ���GenericStack������������String���ͣ��������ջ����ֻ�ܴ���ַ���Ԫ��
		//������һ��GenericStack��������Ϊstack
		
		System.out.println("Now add some words into stack.");
		
		stack.push("Learn java");
		System.out.println("word -'Learn java' added.");
		stack.push("Learning");
		System.out.println("word - 'Learning' added.");
		//�������Ԫ�ص�ջ����ȥ
		//Q:�����ĸ�����ջ����
		
		System.out.println("Now pop words from stack.");
		while(!stack.isEmpty()) {
			//ֻҪջ��Ϊ�գ���ȡ�����е�Ԫ�ز���ӡ����
			
			String s = (String)stack.pop();
			//����Ϊȷ����һ��ִ�е���ȷ���õ���ǿ������ת��
			
			System.out.println("word - "+"'"+s+"'" +" has been taken out.");
			
		}

	}

}
