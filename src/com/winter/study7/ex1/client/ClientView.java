package com.winter.study7.ex1.client;

import java.util.List;

import com.winter.study6.ex1.WeatherDTO;

public class ClientView {

	//view() 날씨정보출력
	public void view(WeatherDTO weatherDTO) {
		if(weatherDTO == null) {
			System.out.println("못찾았다");
			return;
		}
		
		System.out.println("도시명\t기온\t날씨\t습도");
		System.out.print(weatherDTO.getCity()+"\t");
		System.out.print(weatherDTO.getGion()+"\t");
		System.out.print(weatherDTO.getInfo()+"\t");
		System.out.println(weatherDTO.getHum()+"%");
		System.out.println("========================");
	}
	
	public void view(List<WeatherDTO> ar) {
		System.out.println("도시명\t기온\t날씨\t습도");
		for(WeatherDTO weatherDTO:ar) {
			System.out.print(weatherDTO.getCity()+"\t");
			System.out.print(weatherDTO.getGion()+"\t");
			System.out.print(weatherDTO.getInfo()+"\t");
			System.out.println(weatherDTO.getHum()+"%");
			System.out.println("========================");
			
		}
	}
}
