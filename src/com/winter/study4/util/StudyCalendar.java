package com.winter.study4.util;

import java.time.Year;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class StudyCalendar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Calendar calendar = new GregorianCalendar();
		Calendar calendar = Calendar.getInstance();
		System.out.println(calendar);
		
		int year = calendar.get(Calendar.YEAR);
		System.out.println(year);
		
		int month = calendar.get(Calendar.MONTH);
		System.out.println(month+1);
		
		calendar.set(Calendar.YEAR, 2200);
		calendar.set(Calendar.MONTH, 0);//1월
		
		System.out.println(calendar.getTime());//보기편해서 date타입으로
		
		
	}

}
