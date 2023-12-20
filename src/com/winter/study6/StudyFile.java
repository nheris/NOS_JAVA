package com.winter.study6;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class StudyFile {
	public void f4() throws Exception {
		//읽어오기
		File file = new File("C:\\study\\test2.txt");
		FileReader fr = new FileReader(file);
		BufferedReader br = new BufferedReader(fr);
		while(true) {
			String s = br.readLine();
			if(s==null) {
				break;
			}
			if(!s.isEmpty()) {
				System.out.println(s);
			}
		}
		//연결된 순서의 역순으로 해제
		br.close();
		fr.close();
	}
	
	public void f3() throws IOException  {
		//쓰기
		Scanner sc = new Scanner(System.in);
		
//		File file = new File("c:\\study\\test.txt");
//		File file = new File("c:\\study\\test1.txt");
		File file = new File("c:\\study\\test2.txt");
		
		FileWriter fw = new FileWriter(file, true); //false(디폴트)덮어씌움, true 이어쓰기
		
		
		while (true) {
			System.out.println("입력하세요");
			//exit,Exit,eXit 다 될수있게
			if(sc.next().toUpperCase().equals("EXIT")) {
				break;
			}
//			fw.write("hello");//버퍼에 담았다가 보낼건데 버퍼 꽉차야 상대방쪽으로 밈.그래서 잘안쓴대
//			fw.write("winter\r");
		}
		
		//강제 버퍼 밀거임
		fw.flush();
		
		//파일자원썻으면 꺼줘야함
		fw.close();
		
	}
	
	public void f2() throws Exception {
		File file = new File("c:\\study");
		String[] ar = file.list();
		
		File[] files =  file.listFiles();
		
		for(String s : ar) {
			System.out.println(s);
			File f = new File(file, s);
			System.out.println(f.length());
		}
	}
	
	
	public void f1() throws Exception {
		File file = new File("c:\\study\\Test.java"); //맥은다른거,  \? 문자열로 인식?
		
//		file = new File("c:\\study", "test"); //study밑에test, 확장자있으면 파일 아니면 디렉토리
		file = new File("c:\\study\\test", "sub1");
		
		if(!file.exists()) {
			
//			file.mkdir();//디렉토리 만들어라
			file.mkdirs();//중간 업는 디렉토리도 여려개 만들어라
		}
		
		file = new File(file, "t1.txt");
		file.createNewFile();
		
		System.out.println(file.exists());
		System.out.println(file.isDirectory());
		System.out.println(file.isFile());
		System.out.println(file.length()); //파일크기 바이트
		
		file = new File("c:\\study\\test\\sub1");//폴더안 다른거있으면 안지워짐
		
		file.delete();//삭제
		
		
		
		
		
		
	} 
		
	
}