package com.winter.study4.util;

import java.util.ArrayList;
import java.util.StringTokenizer;

import com.winter.study4.lang.ex1.WeatherDate;

public class StudyToken {
	public static void main(String[] args) {
		String str = "서울-10-비-80-부산-25-맑음-50-대구-82-눈-12-제주-25-태풍-75";
		
		StringTokenizer st = new StringTokenizer(str, "-");
		int count = st.countTokens();
		System.out.println(count);
		
		ArrayList<WeatherDate> ar = new ArrayList<>();
		
		
		while (st.hasMoreTokens()) {
			String value = st.nextToken();
			System.out.println(value);
			
			WeatherDate weatherDate = new WeatherDate();
			weatherDate.setCity(st.nextToken());
			weatherDate.setGion(st.nextToken());
			weatherDate.setInfo(str);
			weatherDate.setHum(str);
			ar.add(weatherDate);
		}
	}
}
