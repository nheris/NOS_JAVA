package com.winter.study6.ex1;

import java.util.ArrayList;

public class WeatherMain {

	public static void main(String[] args) {
		WeatherDAO dao = new WeatherDAO();
		try {
			ArrayList<WeatherDTO> ar = dao.getWeathers();
			for(WeatherDTO weatherDTO:ar) {
				System.out.println(weatherDTO.getCity());
				System.out.println(weatherDTO.getHum());
				System.out.println("==================");
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
