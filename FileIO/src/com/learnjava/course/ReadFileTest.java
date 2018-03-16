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
			FileInputStream file =new FileInputStream("C:/Users/潭/Desktop/learnjava.txt");
			//声明一个文件输入流file,并指明该文件在系统中的路径以方便定位
			BufferedInputStream f =new BufferedInputStream(new FileInputStream("C:/Users/潭/Desktop/learnjava.txt"));
			
			BufferedReader fi=new BufferedReader(new FileReader("C:/Users/潭/Desktop/learnjava.txt"));
			int data=0;
			//声明一个整型变量用于存放读取的数据
			
			while ((data=file.read())!=-1) {
				//在while循环中使用read()方法持续读取file，数据赋到data中
				//如果读取失败或者结束，则将返回-1，这个特殊的返回值可以作为读取结束的标识
				
				System.out.println(data);
				System.out.println((char)(data));
				//输出读取到数据,char转换数据为字符
				
			}
			int bd=0;
			while ((bd=f.read())!=-1) {
				//在while循环中使用read()方法持续读取file，数据赋到data中
				//如果读取失败或者结束，则将返回-1，这个特殊的返回值可以作为读取结束的标识
				
				System.out.println(bd);
				System.out.println((char)(bd));
				//输出读取到数据,char转换数据为字符
				
			}
			
			int br=0;
			while ((br=fi.read())!=-1) {
				//在while循环中使用read()方法持续读取file，数据赋到data中
				//如果读取失败或者结束，则将返回-1，这个特殊的返回值可以作为读取结束的标识
				
				System.out.println(br);
				System.out.println((char)(br));
				//输出读取到数据,char转换数据为字符
				
			}
			file.close();
			//文件读取结束之后一定要通过close()方法关闭这个流对象
			f.close();
			fi.close();
		}
		
		catch(FileNotFoundException e){
			//如果文件未找到，则捕获该异常
			e.printStackTrace();
		}catch(IOException e) {
			//如果输入输出时发生错误，则捕获该异常
			e.printStackTrace();
		}
		
	}

}
