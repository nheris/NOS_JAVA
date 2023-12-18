package com.winter.study4.util;

import java.util.Calendar;

public class StudyCalendar2 {
	public static void main(String[] args) {
		Calendar ca1 = Calendar.getInstance();
		Calendar ca2 = Calendar.getInstance();
		ca2.set(1998,5,10);
		
		System.out.println(ca1.getTime());
		System.out.println(ca2.getTime());
		
		long t1 = ca1.getTimeInMillis();
		long t2 = ca2.getTimeInMillis();
		
		System.out.println(t1);
		System.out.println(t2);
		
		long result = t1 - t2;
		result = result/(1000*60*60*24)/365;
		System.out.println(result);
		
		ca1.setTimeInMillis(t2);
		System.out.println(ca1.getTime());
	}
}
