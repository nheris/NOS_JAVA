package com.winter.study6.ex1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.Scanner;
import java.util.StringTokenizer;

import javax.xml.crypto.Data;

public class WeatherDAO {
	private static int count;
	
	static {
		WeatherDAO.count = 0;
	}
	
	//DAO : Data Access Object 데이터 접근하는 클래스
	
	//getWheathers
	//file에서의 내용을 읽어오는 역할

	//1.파일의 내용을 한줄씩 읽어오기
	//2.한줄의 내용을 파싱
	//3.파싱한 토근을 DTO를 생성하고 멤버변수에 대입
	//4.DTO를 List에 추가
	//5.List를 return
	
	public ArrayList<WeatherDTO> getWeathers() throws Exception {
		ArrayList<WeatherDTO> ar2 = new ArrayList<>();
		
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
	
	//검색
	public WeatherDTO getDetail(List<WeatherDTO> ar, Scanner sc) {
		System.out.println("도시명 입력");
		WeatherDTO weatherDTO = new WeatherDTO();
		weatherDTO.setCity(sc.next());
		for(WeatherDTO w:ar) {
			if(w.getCity().equals(weatherDTO.getCity())) {
				return w;
				
			}
		}
		return null;
	}
	
	//추가
	public boolean add(List<WeatherDTO> ar, Scanner sc) {
		WeatherDTO weatherDTO = new WeatherDTO();
		System.out.println("도시명입력");
		weatherDTO.setCity(sc.next());
		System.out.println("기온 입력");
		weatherDTO.setGion(sc.nextInt());
		System.out.println("정보 입력");
		weatherDTO.setInfo(sc.next());
		System.out.println("습도 입력");
		weatherDTO.setHum(sc.nextInt());
		return ar.add(weatherDTO);
	}
	
	//삭제
	public boolean delete(List<WeatherDTO> ar, Scanner sc) {
		boolean result = false;
		System.out.println("도시명 입력");
		String city = sc.next();
		for(WeatherDTO weatherDTO:ar) {
			if(weatherDTO.getCity().equals(city)) {
				result = ar.remove(weatherDTO);
				break;
			}
		}
		return result;
		
	}
	
	//저장
	public void save(List<WeatherDTO> ar) throws IOException {
		//1. 파일에 작성
		//파일명은 save.txt
		//##날씨정보
		//도시명-기온-정보-습도
		//도시명-기온-정보-습도
		//파일명 생성날짜+생성수 로 20231220+count
		
		Calendar ca = Calendar.getInstance();
//		int year = ca.get(Calendar.YEAR);
//		int month = ca.get(Calendar.MONTH)+1;
//		int date = ca.get(Calendar.DATE);
//		count++;
//		String result = ""+year+month+date+"("+count+")";
//		
//		File file = new File("c:\\study\\weather\\"+result+".txt");
		//or
		
 		
		
		File file = new File("C:\\study\\weather\\"+ca.getTimeInMillis()+".txt");
		FileWriter fw = new FileWriter(file);
		
		fw.write("##날씨정보\r");
		fw.flush();
	
//		for(WeatherDTO weatherDTO:ar) {
//			
//		}
	
//		fw.write("도시명-기온-정보-습도\r");
		fw.close();
		
		
					
		
	}
		

}
