package com.learnjava.course;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class WrirteFileTest {

	public static void main(String[] args) {
		try {
			String path= "C:/Users/̶/Desktop/learnjava.txt";
			//��һ��������ǰ����һ���ַ������ڴ�Ŵ�д����ļ�·��
			
			String content="learnjava";
			//����һ���ַ�����Ŵ�д�������
			
			FileOutputStream file =new FileOutputStream(path);
			//����һ���ļ���������󣬲�ָ��·��
			
			file.write(content.getBytes());
			//ͨ��write()����������д�뵽�ļ���
			//getByte()�����ǽ��ַ���ת��Ϊ����������
			
			file.close();
			//�ǵùر��ļ�
			System.out.println("File created successfully");
			//��ʾ�û������ɹ�
		}
		catch(FileNotFoundException e) {
			e.printStackTrace();
		}
		catch (IOException e) {
			e.printStackTrace();
		}
	
	}

}
