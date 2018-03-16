package com.learnjava.course;

import java.io.File;
import java.io.FileOutputStream;
import java.lang.reflect.Constructor;

public class Test {

	public static void main(String[] args) {
		try {
			Constructor<File> constructor= File.class.getDeclaredConstructor(String.class);
			//获得File类的Constructor对象
			
			System.out.println("Create File Object with Reflection.");
			//使用反射创建File对象
			
			
			
			File file =constructor.newInstance("C:/Users/潭/Desktop/MyFile.txt");
			
			System.out.println("Use File Object to create MyFile.txt on desktop.");
			//指定了创建的路径为桌面，名称为“MyFile.txt”
			
			file.createNewFile();
			System.out.println("File is created ?" +file.exists());
		} catch(Exception e) {
			e.printStackTrace();
		}
				
	}

}
