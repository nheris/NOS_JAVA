package com.winter.study4.lang.ex1;

import java.util.Iterator;

public class WeatherService {

	private String datas;
	
	public WeatherService() {
		this.datas="서울-10-비-80-부산-25-맑음-50,대구-82-눈-12,제주.25.태풍.75";
	}
	
	//init
	public WeatherDate[] init() {
		
		this.datas=this.datas.replace(',', '-');
		this.datas=this.datas.replace('.', '-');
		
		String [] arr = this.datas.split("-");
		
		WeatherDate[] wds = new WeatherDate[arr.length/4];
		
		int idx=0;
		for(int i=0; i<arr.length;i=i+4) {  //i++
			WeatherDate wd = new WeatherDate();
			wd.setCity(arr[i]);	 	//arr[i]
			wd.setGion(arr[i+1]);	//arr[++i]
			wd.setInfo(arr[i+2]);	//arr[++i]
			wd.setHum(arr[i+3]);	//arr[++i]
			wds[idx]= wd;
			idx++;
		}
		

		return wds;
	}
	
	
}
