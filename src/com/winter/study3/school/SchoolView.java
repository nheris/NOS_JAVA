package com.winter.study3.school;

public class SchoolView {
	
	public void view(String message) {
		System.out.println(message);
	}
	//
	public void view(Student student) {
		System.out.println("이름 : "+student.name);
		System.out.println("번호 : "+student.num);
		System.out.println("점수 : "+student.jumsu);		
	}
	
	//view
	//
	public void view(Student [] students) {
		for(int i=0;i<students.length;i++) {
			this.view(students[i]);
		}
	}

}
