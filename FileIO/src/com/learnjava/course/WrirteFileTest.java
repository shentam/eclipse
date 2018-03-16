package com.learnjava.course;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class WrirteFileTest {

	public static void main(String[] args) {
		try {
			String path= "C:/Users/潭/Desktop/learnjava.txt";
			//这一次我们提前声明一个字符串用于存放代写入的文件路径
			
			String content="learnjava";
			//声明一个字符串存放待写入的内容
			
			FileOutputStream file =new FileOutputStream(path);
			//声明一个文件输出流对象，并指定路径
			
			file.write(content.getBytes());
			//通过write()方法将数据写入到文件中
			//getByte()方法是将字符串转化为二进制序列
			
			file.close();
			//记得关闭文件
			System.out.println("File created successfully");
			//提示用户创建成功
		}
		catch(FileNotFoundException e) {
			e.printStackTrace();
		}
		catch (IOException e) {
			e.printStackTrace();
		}
	
	}

}
