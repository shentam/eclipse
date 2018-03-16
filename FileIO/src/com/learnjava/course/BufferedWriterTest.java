package com.learnjava.course;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.FileNotFoundException;
import java.io.FileWriter;

public class BufferedWriterTest {

	public static void main(String[] args) {
		String path= "C:/Users/̶/Desktop/bfFile.txt";
		String content="My First Buffered File";
		try {
			FileWriter fw =new FileWriter(path);
			BufferedWriter result= new BufferedWriter(fw);
			result.write(content);
			result.flush();
			result.close();
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		}catch(IOException e) {
			e.printStackTrace();
		}
		System.out.println("File bfBW.txt has been written successfully! ");
	}

}
