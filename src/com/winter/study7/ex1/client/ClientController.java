package com.winter.study7.ex1.client;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.StringTokenizer;

import com.winter.study6.ex1.WeatherDTO;

public class ClientController {
		//1.서버와 소켓 연결 시도
		
		//1.날씨정보출력
		//2.날씨정보검색
		//3.프로그램종료
		//한줄로 온걸 잘라서
		
		//내부에서 불러옴
		
		//외부에서 불러옴
		private Scanner sc;
		private ClientView cv;
		
		public ClientController() {
			this.sc = new Scanner(System.in);
			this.cv = new ClientView();
		}
		
		public ClientController(Scanner sc) {
			// TODO Auto-generated constructor stub
			this.sc =sc;
		}
		
		public void setSc(Scanner sc) {
			this.sc = sc;
		}
		
		public void start(Scanner sc) throws Exception {
			Scanner scanner = new Scanner(System.in);
			//1. 서버와 소켓 연결 시도
			Socket socket = new Socket("localhost", 8282);//127.0.0.1
			//보낼 준비
			OutputStream os = socket.getOutputStream();
			OutputStreamWriter ow = new OutputStreamWriter(os);
			BufferedWriter bw = new BufferedWriter(ow);
			
			//받을 준비
			InputStream is = socket.getInputStream();
			InputStreamReader ir = new InputStreamReader(is);
			BufferedReader br = new BufferedReader(ir);
			
			//1. 날씨정보출력
			//2. 날씨정보검색
			//3. 날씨정보추가
			//4. 날씨정보삭제
			//5. 날씨정보저장
			//6. 프로그램종료
			//5은 서버쪽에 저장이고 클한테는 숫자만?
			boolean check=true;
			List<WeatherDTO> ar = new ArrayList<>();
			while(check) {
				System.out.println("1. 날씨정보출력");
				System.out.println("5. 프로그램종료");
				int select = scanner.nextInt();
				
				if(select==1) {
					System.out.println("출력");
					bw.write(select+"\n\r");
					bw.flush();
					
					String data = br.readLine();//p-1-p-0-p-1-p-0
					
					StringTokenizer st = new StringTokenizer(data, "-");
					
					while(st.hasMoreTokens()) {
						WeatherDTO weatherDTO = new WeatherDTO();
						weatherDTO.setCity(st.nextToken());//도시
						weatherDTO.setGion(Integer.parseInt(st.nextToken()));//기온
						weatherDTO.setInfo(st.nextToken());//날씨
						weatherDTO.setHum(Integer.parseInt(st.nextToken()));//습도
						ar.add(weatherDTO);
					}
					
					cv.view(ar);
					
				}else {
					System.out.println("종료");
					bw.write(select+"\n\r");
					bw.flush();
					break;
				}
				
				
			}

		
		
	}
}
