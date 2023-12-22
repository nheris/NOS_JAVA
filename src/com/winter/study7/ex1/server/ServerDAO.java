package com.winter.study7.ex1.server;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.StringTokenizer;

import com.winter.study6.ex1.WeatherDTO;

public class ServerDAO {
	//getWeather
public ArrayList<WeatherDTO> getWeathers() throws Exception {
		
		
		ArrayList<WeatherDTO> ar = new ArrayList<>();
		File file = new File("c:\\study\\weather");
		String [] names = file.list();

		long max=0;
		

		
		for(int i=0;i<names.length;i++) {
			//split, StringTo, subString, indexOf, lastIndexOf
//			String [] r = names[i].split(".");
//			name[i]=r[0];
//			StringTokenizer st = new StringTokenizer(names[i], ".");
//			name[i]=st.nextToken();
			long n= Long.parseLong(names[i].substring(0, names[i].lastIndexOf(".")));
			max=Math.max(max, n);
		}
		
		

		
	
		
		file = new File(file, max+".txt");
		FileReader fr = new FileReader(file);
		BufferedReader br = new BufferedReader(fr);
		br.readLine();
		while(true) {
			String s = br.readLine();
			if(s ==null) {
				break;
			}
			
			//파싱 - split, StringTokenizer
			
			System.out.println(s);
			StringTokenizer st = new StringTokenizer(s, "-");
			//서울-12-맑음-60
			WeatherDTO weatherDTO = new WeatherDTO();
			
			weatherDTO.setCity(st.nextToken());
			weatherDTO.setGion(Integer.parseInt(st.nextToken()));
			weatherDTO.setInfo(st.nextToken());
			weatherDTO.setHum(Integer.parseInt(st.nextToken()));
			
			ar.add(weatherDTO);
			
		}
		
		br.close();
		fr.close();
		
		
		return ar;
		
	}
	
}
