package com.winter.study3.star;

public class StarMain {

	public static void main(String[] args) {
//		//변수선언      = 객체 생성
//		//클래스명 변수명 = new 클래스명();
//		Marine marine = new Marine();
//		
//		//멤버 사용
//		//변수명.멤버변수명
//		//변수명.멤버메서드명();
//		marine.hp=50;
//		marine.move();
//		
//		Marine marine2 = new Marine();
//		
//		//marine2 = marine;
//		
//		System.out.println(marine2.hp);
		
		
		//클래스명의 첫글자 대문자
		//변수명의 첫글자 소문자
		//메서드명의 첫글자 소문자 ()
		Marine marine=new Marine();
		
		System.out.println(marine.hp);
		marine.move();
		System.out.println(marine.gun.damage);
		
		Medic medic = new Medic();
		

	}

}
