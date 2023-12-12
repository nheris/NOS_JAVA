package com.winter.study3.school;

import java.util.Scanner;

public class SchoolService {
	
	Scanner sc = new Scanner(System.in);
	
	//addStudent
	//이름, 번호, 점수를 입력받아서 기존 배열에 추가한 효과
	public Student [] addStudent(Student [] students) {
		//Scanner sc = new Scanner(System.in);
		Student student = new Student();
		System.out.println("이름을 입력");
		student.name = sc.next();
		System.out.println("번호를 입력");
		student.num = sc.nextInt();
		System.out.println("학점을 입력");
		student.jumsu=sc.nextDouble();
		
		Student [] newStudents = new Student[students.length+1];
		for(int i=0;i<students.length;i++) {
			newStudents[i]=students[i];
		}
		//newStudents[newStudents.length-1]=student;
		newStudents[students.length]=student;
		
		return newStudents;
		
	}
	
	
	//findByNum
	//학생번호를 입력받아서, 일치하는 학생이 있는지 검색
	//해당학생을 리턴 없으면 null리턴
	public Student findByNum(Student [] students) {
		//Scanner sc = new Scanner(System.in);
		System.out.println("검색할 학생 번호 입력");
		int num = sc.nextInt();
		Student student= null;
		for(int i=0;i<students.length;i++) {
			if(num==students[i].num) {
				//return students[i];
				student = students[i];
				break;
			}
		}
		
		return student;
		
	}
	
	//메서드 makeStudents
	// 학생수를 입력받아서 수만큼 학생정보를 입력
	public Student [] makeStudents() {
		//Scanner sc = new Scanner(System.in);
		System.out.println("학생수를 입력하세요");
		int count = sc.nextInt();
		
		Student [] students = new Student[count];
		
		for(int i=0;i<count;i++) {
			Student student = new Student();//null, 0, 0.0
			System.out.println("이름 입력");
			student.name=sc.next();
			System.out.println("번호 입력");
			student.num=sc.nextInt();
			System.out.println("점수 입력");
			student.jumsu=sc.nextDouble();
			students[i]=student;
		}
		
		return students;
	}
	

}
