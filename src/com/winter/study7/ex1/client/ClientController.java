package com.winter.study7.ex1.client;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.util.Scanner;

public class ClientController {
	public void start() throws IOException {
		//1.서버와 소켓 연결 시도
		
		//1.날씨정보출력
		//2.날씨정보검색
		//3.프로그램종료
		//한줄로 온걸 잘라서
	
		Scanner sc = new Scanner(System.in);
		Socket socket = new Socket("192.168.7.162", 8282);
		
		OutputStream os= socket.getOutputStream();
		OutputStreamWriter ow = new OutputStreamWriter(os);
		BufferedWriter bw = new BufferedWriter(ow);
		bw.flush();
		
		
		
		while(true) {
			
			System.out.println("1.날씨정보출력");
			System.out.println("2.날씨정보검색");
			System.out.println("3.프로그램종료");
			int select = sc.nextInt();
			if(select ==1) {
				
			}else if(select ==1) {
				
			}else {
				System.out.println("종료합니다.");
				break;
			}
		}
		
		
	}
}
