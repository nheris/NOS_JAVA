package com.winter.study4.util.ex1;

import java.util.ArrayList;

public class StudentView {
	//메시지를 출력
	public void view(String message) {
		
	}
		
	//학생들의 한명의 모든 정보를 출력
	public void view(StudentDTO studentDTO) {
		
	}
	//학생들의 모든 정보를 출력
	public void view(ArrayList<StudentDTO> ar) {
		//향상된 for문
		//for(모은데이터타입명 변수명:collection변수명){}
		for(StudentDTO studentDTO:ar) {
			System.out.println(studentDTO.getName());
			System.out.println(studentDTO.getAvg());
			System.out.println("=====================");
		}//대신 몇번째인지 모름 밑에는 i보면알수있지만
		
//		for(int i=0;i<ar.size();i++) {
//		System.out.println(ar.get(i));
//		}
		
	}
}
