package com.winter.study3.members;

public class Member {
	//비만관리 회원프로그램
	private String name;
	private double muge;
	private double ki;
	private int age;
	
	public Member() {}
	
	public Member(double muge) {
		this.muge=muge;
	}
	
	//데이터입력 set+변수명
	public void setName(String name) {
		this.name=name;
	}
	
	//데이터조회 get+변수명
	public String getName() {
		return this.name;
	}

	public double getMuge() {
		return muge;
	}

	public void setMuge(double muge) {
		
		this.muge = muge;
	}

	public double getKi() {
		return ki;
	}

	public void setKi(double ki) {
		this.ki = ki;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	

}