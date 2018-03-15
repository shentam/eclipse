package com.learnjava.course;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Lottery {
	public List<String> getHeadNumber(){
		List<String>  list=new ArrayList<String>();
		//������Ʊ��ǰ��κ��뼯��
		String lotteryNumber="";
		for (int i=1; i<60;i++) {
			//���ѭ����Ϊ�˳�ʼ����Ʊ��ǰ��κ��뼯��
			
			if(i<10) {
				list.add("0"+i+" ");
				//�ڼ��������0~9�ĺ��룬��Ϊ�Ǹ�λ����Ϊ����ʾ�ϸ������Ի���������Ҫ��ʮλ�ĵط���ӡ�0��
				
			}else {
				list.add(""+i+" ");
				//�������Ӵ���9�ĺ��룬�����˫λ��
			}
		}
		
		int roundIndex =0;
		//��������ʼ�������
		
		List<String> lotteryList=new ArrayList<String>();
		//����ǰ�κ����List����
		
		for(int j=0;j<6;j++) {
			int amount =list.size();//��ȡǰ��κ���ĸ���
			Random r= new Random();//������ʵ����Random�Ķ���
			roundIndex=r.nextInt(amount);//��ȡһ��0��amount-1���������
			lotteryNumber= list.get(roundIndex);//��ȡ��Ʊ���֣���ҡ�ŵĺ���
			lotteryList.add(lotteryNumber);//����Ʊ�������lotteryList��
			list.remove(roundIndex);//�Ƴ��ող����ĺ���
			
		}
		Collections.sort(lotteryList);
		//��ǰ��κ���������������Ŀ����Ϊ���ý�����߿ɶ���
		return lotteryList;
		//����ǰ��κ���
				
	}
	
	
	
	
	public List<String> getBonus(){
		List <String> list = new ArrayList<String>();
		//�������κ��뼯�ϣ�Ҳ�������1���������
		
		String lotteryNumber="";
		List<String> startList = getHeadNumber();

		String res;
		String test;
	
		for(int i=1; i<60;i++) {
			//��ʼ�����κ��뼯��
	
			if(i<10) {
				res="0"+i+" ";
				//test=(startList.get(i)).toString();
				//if (!(test.equals(res))) {
					list.add(res);
					//���0~9�ĺ��룬ԭ��ͬǰ���
				//}
			}
			else {
				res=""+i+" ";
				//test=(startList.get(i)).toString();
				//if(!(test).equals(res)) {
					list.add(res);
					//��Ӵ���9�ĺ���
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
		//�������к��룬ȥ�����н����룬��ʼΪ0������Ϊһ��ѭ����ȥ�����н�����ڶ���ѭ����ѭ������Ϊ�н�������
		

		int roundIndex =0;
		//��������ʼ�������
		
		List<String> lotteryList= new ArrayList<String>();
		
		Random r =new Random();
		roundIndex=r.nextInt(54);
		lotteryNumber=list.get(roundIndex);
		lotteryList.add(lotteryNumber);
		
		List result= new ArrayList();
		result.add(lotteryList);
		result.add(startList);
		//�����н���������˺���ļ���
		
		return result;
	}
	
	
	public void output(String groupNum) {
		int groupNumber =0;
		//Ϊ�˱��ⲻ��Ҫ�Ĵ���һ���ڴ�������ʱ��ҪΪ�丳��ʼֵ
		
		groupNumber= Integer.parseInt(groupNum);
		StringBuilder sbuilder=new StringBuilder();
		//�����ַ�������������ʹ���ַ����������ܹ���Ϊ��������ַ�����׷������
		StringBuilder sbuilder_1=new StringBuilder();
		for(int i=0;i<groupNumber;i++) {
			//List startList=getHeadNumber();
			List result =getBonus();
			List endList= (List) result.get(0);
			List startList=(List) result.get(1);
			//StringBuilder sbuilder=new StringBuilder();
			
			//�����ַ�������������ʹ���ַ����������ܹ���Ϊ��������ַ�����׷������
			for(int n=0;n<endList.size();n++) {
				sbuilder.append(endList.get(n));
				//��Ӳ�Ʊ�ĺ��κ��뵽�ַ�����������
			}
			for(int o=0;o<startList.size();o++) {
				sbuilder_1.append(startList.get(o));
				//��Ӳ�Ʊ�ĺ��κ��뵽�ַ�����������
			}
			sbuilder.append("\n");
			sbuilder_1.append("\n");
		}
	
		System.out.println("The lottery numbers are: \n"+sbuilder_1.toString());
		System.out.println("The Bonus number is: \n"+sbuilder.toString());
	
		//��ÿ�����ɺõĲ�Ʊ���뼴ʱ���
	}
}
