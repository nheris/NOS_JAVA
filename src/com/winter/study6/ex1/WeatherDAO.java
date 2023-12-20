package com.winter.study6.ex1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class WeatherDAO {
		
	//DAO : Data Access Object 데이터 접근하는 클래스
	
	//getWheathers
	//file에서의 내용을 읽어오는 역할

	//1.파일의 내용을 한줄씩 읽어오기
	//2.한줄의 내용을 파싱
	//3.파싱한 토근을 DTO를 생성하고 멤버변수에 대입
	//4.DTO를 List에 추가
	//5.List를 return
	public ArrayList<WeatherDTO> getWeathers() throws Exception {
		ArrayList<WeatherDTO> ar = new ArrayList<>();
		File file = new File("C:\\study\\weather.txt");
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
