package com.winter.study4.util.ex1;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;


public class StudentService {
	private String info;
	private Scanner sc;
	
	public StudentService() {
		this.sc = new Scanner(System.in);
		this.info="winter-1-50-60-80";
		this.info+="-iu-2-85-94-74";
		this.info+="-karina-3-78-78-98";
	}
	
	//init
	//info 파싱해서 
	public ArrayList<StudentDTO> init() {
		StringTokenizer st = new StringTokenizer(this.info, "-");
		ArrayList<StudentDTO> ar = new ArrayList<>();
		while(st.hasMoreTokens()) {
			StudentDTO studentDTO = new StudentDTO();
			studentDTO.setName(st.nextToken());
			studentDTO.setNum(Integer.parseInt(st.nextToken()));
			studentDTO.setKor(Integer.parseInt(st.nextToken()));
			studentDTO.setEng(Integer.parseInt(st.nextToken()));
			studentDTO.setMath(Integer.parseInt(st.nextToken()));
			studentDTO.setTotal(studentDTO.getKor()+studentDTO.getEng()+studentDTO.getMath());
			studentDTO.setAvg(studentDTO.getTotal()/3.0);
			ar.add(studentDTO);
		}
		
		return ar;
	}
	
	//학생정보검색 findByName  이름으로 검색
		public StudentDTO findByName(ArrayList<StudentDTO> ar) {
			System.out.println("학생의 이름을 입력");
			String name = sc.next();
			
			StudentDTO st=null;
			
			for(StudentDTO studentDTO:ar) {
				if(studentDTO.getName().equals(name)) {
					st=studentDTO;
					//return studentDTO;
					break;
				}
			}
			
			return st;
		}
		
		
		//학생정보추가 studentAdd
		public void studentAdd(ArrayList<StudentDTO> ar) {
			StudentDTO studentDTO = new StudentDTO();
			System.out.println("학생의 이름 입력");
			String name = sc.next();
			studentDTO.setName(name);
			
			System.out.println("번호 입력");
			studentDTO.setNum(sc.nextInt());
			
			System.out.println("국어 입력");
			studentDTO.setKor(sc.nextInt());
			
			System.out.println("영어 입력");
			studentDTO.setEng(sc.nextInt());
			
			System.out.println("수학 입력");
			studentDTO.setMath(sc.nextInt());
			
			studentDTO.setTotal(studentDTO.getKor()+studentDTO.getEng()+studentDTO.getMath());
			studentDTO.setAvg(studentDTO.getTotal()/3.0);
			
			ar.add(studentDTO);
		}
		
		
		//학생정보삭제 studentDelete 이름으로 검색해서 삭제
		public boolean studentDelete(ArrayList<StudentDTO> ar) {
			System.out.println("학생 이름 입력");
			String name = sc.next();
			boolean result=false;
			for(StudentDTO studentDTO:ar) {
				if(studentDTO.getName().equals(name)) {
					ar.remove(studentDTO);
					result = !result;
					break;
				}
			}
			
			return result;
		}
	
}
