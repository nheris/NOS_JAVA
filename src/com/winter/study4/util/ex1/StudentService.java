package com.winter.study4.util.ex1;

import java.util.ArrayList;
import java.util.Iterator;

import javax.swing.plaf.synth.SynthGraphicsUtils;

public class StudentService {
	private String info;
	
	public StudentService() {
		this.info="winter-1-50-60-80";
		this.info+="-iu-2-85-94-74";
		this.info+="-karina-3-78-78-98";
	}
	
	//init
	//info 파싱해서 
	public ArrayList<StudentDTO> init() {
//		ArrayList<Object> ar = new ArrayList<>();
		String[] str = this.info.split("-");
		ArrayList<StudentDTO> students =new ArrayList<>();
//		Student[] students = new Student[str.length/4];
		for(int i =0;i<str.length;i++) {
			StudentDTO student = new StudentDTO();
			student.setName(str[i]);
			student.setNum(i);
			student.setLiter(i);
			student.setEng(i);
			student.setMath(i);
			students.add(student);
		}
		System.out.println(students.get(1));
		
		return students;
		
		
		
		//아니 문제가 뭐였지??? 문제좀 다시 설명해줬으면...
	}
	
}
