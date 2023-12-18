package com.winter.study4.util;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class StudySimpleFormat {
	public static void main(String[] args) {
		Calendar calendar = Calendar.getInstance();
		
		//2023년 12월 30일		
		SimpleDateFormat sd = new SimpleDateFormat("yyyy년 MM월 dd일 E요일");
		String str =sd.format(calendar.getTime());
		System.out.println(str);
		
		
		sd.applyPattern("yyyy-MM-dd");//2023-12-18
		
		String d= "2020-12-24"; //문자열 -> 날짜
		
		Date date=null;
		try {
			date = sd.parse(d);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println(date);
		
	}
}
