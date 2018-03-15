package com.learnjava.course;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Lottery {
	public List<String> getHeadNumber(){
		List<String>  list=new ArrayList<String>();
		//创建彩票的前半段号码集合
		String lotteryNumber="";
		for (int i=1; i<60;i++) {
			//这个循环是为了初始化彩票的前半段号码集合
			
			if(i<10) {
				list.add("0"+i+" ");
				//在集合中添加0~9的号码，因为是个位数，为了显示上更加人性化，所以需要在十位的地方添加“0”
				
			}else {
				list.add(""+i+" ");
				//相机和添加大于9的号码，即添加双位数
			}
		}
		
		int roundIndex =0;
		//创建并初始化随机数
		
		List<String> lotteryList=new ArrayList<String>();
		//保存前段号码的List集合
		
		for(int j=0;j<6;j++) {
			int amount =list.size();//获取前半段号码的个数
			Random r= new Random();//创建并实例化Random的对象
			roundIndex=r.nextInt(amount);//获取一个0到amount-1的随机数；
			lotteryNumber= list.get(roundIndex);//获取彩票数字，即摇号的号码
			lotteryList.add(lotteryNumber);//将彩票号码添加lotteryList中
			list.remove(roundIndex);//移除刚刚产生的号码
			
		}
		Collections.sort(lotteryList);
		//对前半段号码进行排序，排序的目的是为了让结果更具可读性
		return lotteryList;
		//返回前半段号码
				
	}
	
	
	
	
	public List<String> getBonus(){
		List <String> list = new ArrayList<String>();
		//创建后半段号码集合，也就是最后1个球的数字
		
		String lotteryNumber="";
		List<String> startList = getHeadNumber();

		String res;
		String test;
	
		for(int i=1; i<60;i++) {
			//初始化后半段号码集合
	
			if(i<10) {
				res="0"+i+" ";
				//test=(startList.get(i)).toString();
				//if (!(test.equals(res))) {
					list.add(res);
					//添加0~9的号码，原理同前半段
				//}
			}
			else {
				res=""+i+" ";
				//test=(startList.get(i)).toString();
				//if(!(test).equals(res)) {
					list.add(res);
					//添加大于9的号码
				//}
			}

		}
		for(int x=0;x<list.size();x++) {
			for(int y=0;y<startList.size();y++) {
				test = startList.get(y);
				if (test.equals(list.get(x))){
					list.remove(x);
				}
			}
			
		}
		//遍历所有号码，去除已中奖号码，起始为0！遍历为一次循环，去除已中奖号码第二次循环，循环次数为中奖号码数
		

		int roundIndex =0;
		//创建并初始化随机数
		
		List<String> lotteryList= new ArrayList<String>();
		
		Random r =new Random();
		roundIndex=r.nextInt(54);
		lotteryNumber=list.get(roundIndex);
		lotteryList.add(lotteryNumber);
		
		List result= new ArrayList();
		result.add(lotteryList);
		result.add(startList);
		//保存中奖号码和幸运号码的集合
		
		return result;
	}
	
	
	public void output(String groupNum) {
		int groupNumber =0;
		//为了避免不必要的错误，一般在创建变量时都要为其赋初始值
		
		groupNumber= Integer.parseInt(groupNum);
		StringBuilder sbuilder=new StringBuilder();
		//创建字符串生成器对象，使用字符串生成器能够较为方便地在字符串中追加内容
		StringBuilder sbuilder_1=new StringBuilder();
		for(int i=0;i<groupNumber;i++) {
			//List startList=getHeadNumber();
			List result =getBonus();
			List endList= (List) result.get(0);
			List startList=(List) result.get(1);
			//StringBuilder sbuilder=new StringBuilder();
			
			//创建字符串生成器对象，使用字符串生成器能够较为方便地在字符串中追加内容
			for(int n=0;n<endList.size();n++) {
				sbuilder.append(endList.get(n));
				//添加彩票的后半段号码到字符串生成器中
			}
			for(int o=0;o<startList.size();o++) {
				sbuilder_1.append(startList.get(o));
				//添加彩票的后半段号码到字符串生成器中
			}
			sbuilder.append("\n");
			sbuilder_1.append("\n");
		}
	
		System.out.println("The lottery numbers are: \n"+sbuilder_1.toString());
		System.out.println("The Bonus number is: \n"+sbuilder.toString());
	
		//将每组生成好的彩票号码即时输出
	}
}
