package com.winter.study3.school;

import java.util.Scanner;

public class SchoolController {
	
	
	public void start() {
		Scanner sc = new Scanner(System.in);
		SchoolService schoolService = new SchoolService();
		SchoolView schoolView = new SchoolView();
		Student [] students = null;
		
		boolean check=true;
		
		while(check) {
			
			System.out.println("1. 학생정보입력");
			System.out.println("2. 학생정보출력");
			System.out.println("3. 학생정보검색");
			System.out.println("4. 학생정보추가");
			System.out.println("5. 프로그램종료");
			int select = sc.nextInt();
			
			switch (select) {
			case 1:
				students = schoolService.makeStudents();
				break;

			case 2:
				schoolView.view(students);
				break;
				
			case 3:
				Student s = schoolService.findByNum(students);
				if(s != null) {
					schoolView.view(s);
				}else {
					schoolView.view("학생이 없다");
				}
				break;
			case 4:
				
				students = schoolService.addStudent(students);
				break;
				
			default:
				System.out.println("프로그램을 종료합니다");
				check=false;
				break;
			}
			
			
		}
		
		
		
	}

}
