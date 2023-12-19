package com.winter.study6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class StudyIO {
	public void input() {
		//키보드 입력 (스캐너 원리? 그냥 알고만 있으래)
		
		//byte 처리
		InputStream is = System.in;
		
		//문자
		InputStreamReader ir = new InputStreamReader(is);
		
		//문자열
		BufferedReader br = new BufferedReader(ir);
		
		try {
			String str = br.readLine();
			System.out.println(str);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
