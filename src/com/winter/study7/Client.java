package com.winter.study7;

import java.net.Socket;

public class Client {
	//서비스 이용자
	
	public void send() throws Exception {
		Socket socket = new Socket("127.0.0.1 localost ", 8282); //string host,int port
		//127.0.0.1 / localostcmd / >ipconfig>IPv4 주소
		System.out.println("서버와 접속 성공");
	}
}
