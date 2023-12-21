package com.winter.study7;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.util.Scanner;

public class Client {
	//서비스 이용자
	
	public void send() throws Exception {
		Scanner sc = new Scanner(System.in);
		Socket socket = new Socket("192.168.7.162", 8282); //string host,int port
		//127.0.0.1 / localostcmd / >ipconfig>IPv4 주소
		System.out.println("서버와 접속 성공");
		
		OutputStream os=null;
		OutputStreamWriter ow=null;
		BufferedWriter bw=null;
		
		InputStream is=null;
		InputStreamReader ir=null;
		BufferedReader br=null;
		
		while(true) {
			
		//ouput
		System.out.println("서버로 보낼 메세지 입력");
		String m = sc.next(); //nextLine()띄어쓰기 포함 문자열밖에 안됨.
		
		
		os = socket.getOutputStream(); //0,1 처리
		ow = new OutputStreamWriter(os);//문자로 다룸
		bw = new BufferedWriter(ow);//문자열로 
		bw.write(m+"\n\r");
		bw.flush();
		
		String result = m.toUpperCase();
		if (result.equals("EXIT")){
			break;
		}
		
		//서버메세지 수신
		is = socket.getInputStream();
		ir = new InputStreamReader(is);
		br = new BufferedReader(ir);
		System.out.println(br.readLine());
		
		}
		
		//역순 자원끊음
		//
		br.close();
		ir.close();
		is.close();
		//
		bw.close();
		ow.close();
		os.close();
		socket.close();
		sc.close();
		
		System.out.println("프로그램 종료");
		
	}
}
