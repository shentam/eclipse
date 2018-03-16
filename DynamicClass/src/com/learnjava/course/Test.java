package com.learnjava.course;

import java.io.File;
import java.io.FileOutputStream;
import java.lang.reflect.Constructor;

public class Test {

	public static void main(String[] args) {
		try {
			Constructor<File> constructor= File.class.getDeclaredConstructor(String.class);
			//���File���Constructor����
			
			System.out.println("Create File Object with Reflection.");
			//ʹ�÷��䴴��File����
			
			
			
			File file =constructor.newInstance("C:/Users/̶/Desktop/MyFile.txt");
			
			System.out.println("Use File Object to create MyFile.txt on desktop.");
			//ָ���˴�����·��Ϊ���棬����Ϊ��MyFile.txt��
			
			file.createNewFile();
			System.out.println("File is created ?" +file.exists());
		} catch(Exception e) {
			e.printStackTrace();
		}
				
	}

}
