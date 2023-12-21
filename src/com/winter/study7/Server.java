package com.winter.study7;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Server {
	
	public void s() throws Exception {
		Scanner scanner = new Scanner(System.in);
		System.out.println("클라이언트가 접속하기를 기다리는 중");
		ServerSocket ss = new ServerSocket(8282); //(int port) 상대방 ip모름
	
		Socket sc = ss.accept(); //요청 정보 소켓만듦??
		System.out.println("Client 연결 성공");
		
		InputStream is =null;
		InputStreamReader ir=null;
		BufferedReader br=null;
		
		OutputStream os=null;
		OutputStreamWriter ow=null;
		BufferedWriter bw=null;

		while(true) {
			
		//받아옴 input
		is = sc.getInputStream();//0,1 처리
		ir = new InputStreamReader(is);//문자 담당
		br = new BufferedReader(ir);//문자열
		System.out.println(br.readLine());
		
		//클라이언트에게 메세지 전송
		System.out.println("Client에게 보낼 메세지");
		String st = scanner.next();
		
		String result = st.toUpperCase();
		if (result.equals("EXIT")){
			break;
		}
		
		os = sc.getOutputStream();
		ow = new OutputStreamWriter(os);
		bw = new BufferedWriter(ow);
		bw.write(st+"\n\r");
		bw.flush();
	
		}
		
		//
		bw.close();
		ow.close();
		os.close();
		//
		br.close();
		ir.close();
		is.close();
		sc.close();
		scanner.close();
		
		System.out.println("서버 프로그램 종료");
	
	}
}
