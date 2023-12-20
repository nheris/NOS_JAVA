package com.winter.study6.ex1;

public class WeatherController {
	//의존적이다
	//주입 
	//의존성 주입
	
	//방법1
	public WeatherController() {
		this.weatherDAO = new weatherDAO();
	}
	//방법2
	public WeatherController(w) {
		
	}
}	
