package com.learnjavs.course;

public class EnumPractice {

	public static void main(String[] args) {
		for(Week week:Week.values()) {
			System.out.println("The order of  "+week+" is "+week.ordinal());
			//使用ordinal()方法查看枚举元素的顺序
			
			System.out.println("Compare to Monday : "+week.compareTo(Week.MONDAY));
			//使用compareTo()方法来将当前枚举元素与Week.MONDAY比较
			
			System.out.println("Equal to MONDAY ? "+week.equals(Week.MONDAY));
			//使用equals()方法来将当前枚举元素与Week.MONDAY比较
			
			System.out.println("Equal to MONDAY by == ? "+ (week==Week.MONDAY));
			//用比较运算符==来将当前枚举元素与Week.MONDAY比较
			//在这里你也应该可以看到，可以直接使用==来比较两个枚举
			
			System.out.println("Name : "+week.name());
			//使用name()方法获得枚举元素的名称
			
			System.out.println("Abbreviation : "+week.getAbbr());
			//使用自定义的getAbbr()方法输出星期的缩写
			
			System.out.println("\n-----------------------------------\n");
			//在每次循环快要结束时，打印一条分割线先用于区分
			
		}

	}

}
