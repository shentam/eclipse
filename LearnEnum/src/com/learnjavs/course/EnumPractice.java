package com.learnjavs.course;

public class EnumPractice {

	public static void main(String[] args) {
		for(Week week:Week.values()) {
			System.out.println("The order of  "+week+" is "+week.ordinal());
			//ʹ��ordinal()�����鿴ö��Ԫ�ص�˳��
			
			System.out.println("Compare to Monday : "+week.compareTo(Week.MONDAY));
			//ʹ��compareTo()����������ǰö��Ԫ����Week.MONDAY�Ƚ�
			
			System.out.println("Equal to MONDAY ? "+week.equals(Week.MONDAY));
			//ʹ��equals()����������ǰö��Ԫ����Week.MONDAY�Ƚ�
			
			System.out.println("Equal to MONDAY by == ? "+ (week==Week.MONDAY));
			//�ñȽ������==������ǰö��Ԫ����Week.MONDAY�Ƚ�
			//��������ҲӦ�ÿ��Կ���������ֱ��ʹ��==���Ƚ�����ö��
			
			System.out.println("Name : "+week.name());
			//ʹ��name()�������ö��Ԫ�ص�����
			
			System.out.println("Abbreviation : "+week.getAbbr());
			//ʹ���Զ����getAbbr()����������ڵ���д
			
			System.out.println("\n-----------------------------------\n");
			//��ÿ��ѭ����Ҫ����ʱ����ӡһ���ָ�������������
			
		}

	}

}
