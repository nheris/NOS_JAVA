package com.winter.study4.util;

import java.util.ArrayList;

public class StudyList2 {

	public static void main(String[] args) {
		//E 변수
		ArrayList<Object> ar = new ArrayList<Object>();
		ArrayList<Object> ar2 = new ArrayList<>();//뒤 생략가능
		ArrayList<String> ar3 = new ArrayList<>();
		ArrayList<Integer> ar4 = new ArrayList<>();
		ar.add(1);
		ar.add("second");
		ar.add(false);
		ar.add(4.23);
		
//		ar3.add(2);
		ar3.add("a");
		String n = ar3.get(0);
		
		//다형성은 참조형
		//타입의 안정성
		int nn = (Integer)ar.get(0);
		String str = (String)ar.get(1);
		Boolean c = (Boolean)ar.get(2);
	}

}
