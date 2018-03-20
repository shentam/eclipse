package com.learnjava.course;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class MySwingWindow extends JFrame {
	//�˴�ͨ���̳�JFrame����ʹ�����Լ���MySwingWindow���д����һЩ���Ժͷ���
	private JLabel myLabel;
	private JTextField myTextField;
	private JButton myButton;
	
	public MySwingWindow() {
		//�ڴ���Ĺ��췽�������ô���ĸ�������
		
		super();
		//ʹ��super()�����ø���ĳɷ֣���this�����õ�ǰ����
		
		this.setSize(400,300);
		//���ô����С
		
		this.getContentPane().setLayout(null);
		//���شδ����contentPane���������䲼��
		//��䲻̫���Ļ�Ҳ���õ��ģ���д��
		
		this.setTitle("My First Swing Window");
		//���ô���ı���
		this.add(getJLabel(),null);
		this.add(getJTextField(), null);
		this.add(getJButton(), null);
		//���Զ����JFrame���췽����ʹ��add()��������ӿؼ�
		//add()�������Խ�ָ�������ӵ��������ĸ���λ����
		//��һ������Ϊ����ӵ������������齨�������ǵķ���ֵ
		//�ڶ�������Ϊ�����齨�Ĳ������ƵĶ������ǲ������ƣ�������null
	}
	
	private JLabel getJLabel() {
		//�˴�����ֵ����ΪJLabel
		
		if(myLabel == null) {
			myLabel =new JLabel();
			//ʵ����myLabel����
			
			myLabel.setBounds(5,10,250,30);
			//ʹ��setBounds()�������óߴ�
			//�ĸ������ֱ���x,y,width,height
			//�����˺��������λ�ã��Լ���ǩ����Ŀ�͸�
			
			myLabel.setText("Hello! Welcome to learnjava.com");
			//ʹ��setText()��������Ҫ��ʾ���ı�
		}
		return myLabel;
		//���ش�����ʵ��
	}
	
	private JTextField getJTextField() {
		//�˴�����ֵΪJTextField
		
		if (myTextField == null) {
			//��������ж���Ϊ�˷�ֹ����
			
			myTextField = new JTextField();
			//ʵ����myTextField����
			
			myTextField.setBounds(5,45,200,30);
			//��������λ�úͳߴ�
			
			myTextField.setText("learn java");
			//�趨��Ҫ��ʾ���ַ���
		}
		return myTextField;
		//�������ʵ��
	}
	
	private JButton getJButton() {
		//�˴��ķ���ֵ����ΪJButton
		
		if(myButton == null){
			
			myButton = new JButton();
			//ʵ����myButton ����
			myButton.setBounds(5,80,100,40);
			//��������λ�úͳߴ�
			myButton.setText("Click me!");
			//�趨��Ҫ��ʾ���ַ���
			myButton.addActionListener(new ActionListener() {
				//Ϊ�����һ���¼��������Ӷ�ʹ�����ť������Ӧ�û��ĵ������
				//ActionListener�����ڽ��ܲ���ʱ����������ӿ�
				//���ڴ������ʱ�����Ȥ�������ʵ�ִ˽ӿڣ���ʹ�ø��ഴ���Ķ�
				//��ʹ�������addActionListener����������ע��
				//�ڷ��������¼�ʱ�����øö����actionPerformed ����
				
				public void actionPerformed(ActionEvent e) {
					//�÷������ڷ�������ʱ�����ã�����Ҫ��������Ϳ���д��������
					//������������Ҫ����������Ǹı�֮ǰ�����ռ������������ɫ�ͱ���ɫ
					
					myLabel.setForeground(Color.RED);
					//���ô������ǰ��ɫ
					
					myTextField.setBackground(Color.BLUE);
					//���ô�����ı���ɫ
					
				}
				
			});
		}
		return myButton;
		//�������ʵ��
		
	}
	
	
	public static void main(String[] args) {
		MySwingWindow window = new MySwingWindow();
		//����һ���������window
		
		window.setVisible(true);
		//������������ǿɼ���		

	}

}
