package com.winter.study4.util;

import java.util.Calendar;
import java.util.UUID;

public class StudyCalendar3 {
	public static void main(String[] args) {
		Calendar calendar = Calendar.getInstance();
		calendar.set(2023,11,31);
		System.out.println(calendar.getTime());
		
		int d = calendar.get(Calendar.DATE);
		d=d+3;
		calendar.set(Calendar.DATE, d);
		System.out.println(d);
		System.out.println(calendar.getTime());
		
		calendar.set(2023,1,31);
		calendar.roll(Calendar.DATE, 3);
		System.out.println(calendar.getTime());
		
		calendar.add(Calendar.DATE, 3);//여기 다름!!
		System.out.println(calendar.getTime());
		
		//UUID 쓸거라 알아두래
		String n = UUID.randomUUID().toString();
		System.out.println(n);
	}
}
