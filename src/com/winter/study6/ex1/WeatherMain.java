package com.winter.study6.ex1;

import java.io.FileNotFoundException;

public class WeatherMain {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		WeatherDAO wd = new WeatherDAO();
		try {
			wd.getWheathers();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		wd.init();
	}

}
