package com.learnjava.course;
import java.util.Scanner;

public class LotteryTest {

	public static void main(String[] args) {
		
		Lottery l =new Lottery();
		Scanner scan=new Scanner(System.in);
		System.out.println("Please input the number of lottery group(s) that you want to generate : ");
		//����û��������Ҫ���ɵ��н��������
		
		String groupNum = scan.nextLine();
		//l.generateLottery(groupNum);
		l.output(groupNum);
	}

}
