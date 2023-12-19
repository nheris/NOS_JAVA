package com.winter.study6.ex1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class WeatherDAO {
		
	//DAO : Date Access Object 데이터 접근하는 클래스
	
	//getWheathers
	//file에서의 내용을 읽어오는 역할 (첫줄은 버리고)

	//1.파일의 내용을 한줄씩 읽어오기
	//2.한줄의 내용을 파싱
	//3.파싱한 토근을 DTO를 생성하고 멤버변수에 대입
	//4.DTO를 List에 추가
	//5.List를 return
	public void getWheathers() throws Exception {
		
	File file = new File("c:\\study\\wheather.txt");
	
	FileReader fr = new FileReader(file);
	
	BufferedReader br = new BufferedReader(fr);
	
	br.readLine();
	
	while(true) {
		String info=br.readLine();
		if(br.readLine()== null){
			break;
		} 
		info += "-"+br.readLine();
	}
	
	//왜 서울 대전만 나오지??? 왜!!!!!!

	System.out.println(info);
	}
	
	public void init() {
		StringTokenizer  st = new StringTokenizer( "-");
		System.out.println(st.nextToken());
	}
	
	
	
	
	
}
