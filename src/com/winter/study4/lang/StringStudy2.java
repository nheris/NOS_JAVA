package com.winter.study4.lang;

public class StringStudy2 {

	public static void main(String[] args) {
		String name = "wintertest";
		
		int num1 = name.indexOf('t');
		int num2 = name.indexOf('t',5);
//		System.out.println(num2);
		
		
		int count=0;
		int num=-1;
		while(true) {
			num = name.indexOf('t',num+1);
			if(num==-1) {
				break;
			}
			count++;
		}
		System.out.println(count);
		
		
		
		
	}

}
