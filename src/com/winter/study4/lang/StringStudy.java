package com.winter.study4.lang;

import java.util.Scanner;

public class StringStudy {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//String
		String str = new String();
		String name = "김뿌이";
		String name2 = "김뿌이";
		
		
		
		char ch = name.charAt(1);
		System.out.println(ch);
		
		for(int i=0;i<name.length();i++) {
			System.out.println(name.charAt(i));
		}
		
		System.out.println(name.toString());
		
		System.out.println(name == name2); //true 주소비교 상수풀
		System.out.println("이름입력"); //김뿌이 입력
		String name3 = sc.next();
		System.out.println(name == name3); //false
		System.out.println(name.equals(name3)); //true
		sc.close();
		
		
		System.out.println("----------------------");
		
		String n = "abc";
		String n2 = "123";
		n= n +n2;
				
				
		
		
	}
}
