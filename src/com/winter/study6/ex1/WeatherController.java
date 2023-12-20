package com.winter.study6.ex1;

import java.util.List;
import java.util.Scanner;

public class WeatherController {
	
	//의존적이다 Dependency
	//주입     Injection
	//의존성 주입(DI)
	private WeatherDAO weatherDAO;
	private WeatherView weatherView;
	private Scanner sc;
	
	//방법1 
	public WeatherController() {
		//강한 결합
		this.weatherDAO = new WeatherDAO();
		this.weatherView = new WeatherView();
		this.sc = new Scanner(System.in);
	}
	//방법2
	public WeatherController(WeatherDAO weatherDAO) {
		//느슨한 결합
		this.weatherDAO = weatherDAO;
		
	}
	//생명주기가 다름 
	
	//방법3
	public void setWeatherDAO(WeatherDAO weatherDAO) {
		this.weatherDAO = weatherDAO;
	}
	
	
	public void start()throws Exception {
		//처음 한번만
		List<WeatherDTO> ar = weatherDAO.getWeathers();
		
		boolean check=true;
		while(check) {
			System.out.println("1. 날씨정보출력");
			System.out.println("5. 프로그램종료");
			try {
				int select = sc.nextInt();//abc
				if(select==1) {
					this.weatherView.view(ar);
				}else {
					System.out.println("종료합니다.");
					break;
				}
			}catch (Exception e) {
				System.out.println("잘못입력 했다");
				System.out.println(sc.next());
			}
			
			
		}
	}
}	
