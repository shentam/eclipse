package com.learnjava.course;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import java.io.BufferedInputStream;
import java.io.BufferedReader;

public class ReadFileTest {

	public static void main(String[] args) {
		try {
			FileInputStream file =new FileInputStream("C:/Users/̶/Desktop/learnjava.txt");
			//����һ���ļ�������file,��ָ�����ļ���ϵͳ�е�·���Է��㶨λ
			BufferedInputStream f =new BufferedInputStream(new FileInputStream("C:/Users/̶/Desktop/learnjava.txt"));
			
			BufferedReader fi=new BufferedReader(new FileReader("C:/Users/̶/Desktop/learnjava.txt"));
			int data=0;
			//����һ�����ͱ������ڴ�Ŷ�ȡ������
			
			while ((data=file.read())!=-1) {
				//��whileѭ����ʹ��read()����������ȡfile�����ݸ���data��
				//�����ȡʧ�ܻ��߽������򽫷���-1���������ķ���ֵ������Ϊ��ȡ�����ı�ʶ
				
				System.out.println(data);
				System.out.println((char)(data));
				//�����ȡ������,charת������Ϊ�ַ�
				
			}
			int bd=0;
			while ((bd=f.read())!=-1) {
				//��whileѭ����ʹ��read()����������ȡfile�����ݸ���data��
				//�����ȡʧ�ܻ��߽������򽫷���-1���������ķ���ֵ������Ϊ��ȡ�����ı�ʶ
				
				System.out.println(bd);
				System.out.println((char)(bd));
				//�����ȡ������,charת������Ϊ�ַ�
				
			}
			
			int br=0;
			while ((br=fi.read())!=-1) {
				//��whileѭ����ʹ��read()����������ȡfile�����ݸ���data��
				//�����ȡʧ�ܻ��߽������򽫷���-1���������ķ���ֵ������Ϊ��ȡ�����ı�ʶ
				
				System.out.println(br);
				System.out.println((char)(br));
				//�����ȡ������,charת������Ϊ�ַ�
				
			}
			file.close();
			//�ļ���ȡ����֮��һ��Ҫͨ��close()�����ر����������
			f.close();
			fi.close();
		}
		
		catch(FileNotFoundException e){
			//����ļ�δ�ҵ����򲶻���쳣
			e.printStackTrace();
		}catch(IOException e) {
			//����������ʱ���������򲶻���쳣
			e.printStackTrace();
		}
		
	}

}
