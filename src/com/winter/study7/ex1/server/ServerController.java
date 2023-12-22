package com.winter.study7.ex1.server;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.List;

import com.winter.study6.ex1.WeatherDTO;

public class ServerController {
	

	public void start() throws Exception {
		//client와 연결 준비
		
		//온 123맞게 정보 전달 한줄로
		ServerDAO serverDAO = new ServerDAO();
		List<WeatherDTO> ar = serverDAO.getWeathers();
		
		ServerSocket ss = new ServerSocket(8282);
		
		Socket socket = ss.accept();
		
		//보낼 준비
		OutputStream os = socket.getOutputStream();
		OutputStreamWriter ow = new OutputStreamWriter(os);
		BufferedWriter bw = new BufferedWriter(ow);
		
		//받을 준비
		InputStream is = socket.getInputStream();
		InputStreamReader ir = new InputStreamReader(is);
		BufferedReader br = new BufferedReader(ir);
		
		while(true) {
			int select= Integer.parseInt(br.readLine());
			br.readLine();
			if(select==1) {
				String datas="";
				for(WeatherDTO weatherDTO:ar) {
					datas=datas+weatherDTO.getCity()+"-";
					datas=datas+weatherDTO.getGion()+"-";
					datas=datas+weatherDTO.getInfo()+"-";
					datas=datas+weatherDTO.getHum()+"-";
				}
				datas=datas.substring(0, datas.lastIndexOf("-"));
				bw.write(datas+"\n\r");
				bw.flush();
			}else {
				break;
			}
		}
		
		
		
		
	}
}
