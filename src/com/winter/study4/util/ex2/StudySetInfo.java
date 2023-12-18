package com.winter.study4.util.ex2;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;

public class StudySetInfo {
	//로또 번호 생성
	//1~45, 6개
	//중복 제거
	
	Random random = new Random();
	
	public void ex0() {
		//배열
		int [] ar = new int [6];
		Random random = new Random();
		
		for(int i=0;i<ar.length;i++) {
			ar[i]=random.nextInt(45)+1;
			//같은지 비교
			for(int j=0;j<i;j++) {
				if(ar[i]==ar[j]) {
					i--;
					break;
				}
			}
		}
		
		for(int i:ar) {
			System.out.println(i);
		}
		
	}
	
	public void ex1() {
		//ArrayList
		ArrayList<Integer> ar = new ArrayList<>();
		for(int i =0; i<6;i++) {
			int num=random.nextInt(45)+1;
			if(ar.contains(num)) {
				i--;
				continue;
			}
			ar.add(num);
			System.out.println(ar.get(i));
		}
	}
	
	
	public void ex2() {
		//HashSet
		HashSet<Integer> hs = new HashSet<>();
		for(int i=0; i<6;i++) {
			int num=random.nextInt(45)+1;
			hs.add(num);
		}
		System.out.println(hs);
		
	}
}
