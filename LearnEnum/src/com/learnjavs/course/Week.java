package com.learnjavs.course;

public enum Week {
	MONDAY("MON"),TUESDAY("TUE"),WEDNESDAY("WED"),THURSDAY("THUR"),FRIDAY("FRI"),SATURDAY("SAT"),SUNDAY("SUN");
	//����Ҫ�ȶ���ö�����ͣ����ܶ��巽��
	private String abbr;
	//����һ���ַ��������ڱ�����д��Ϣ
	
	private Week(String abbr){
		this.abbr=abbr;
	}
	//����һ��˽�й��췽�����÷���ֻ���ڹ���ö�ٳ����Ǳ����ã�����ʹö��Ԫ�ؾ���ָ������д��Ϣ
	
	public String getAbbr() {
		return abbr;
	}
	//ͨ���÷������ö��Ԫ�ص���д
}
