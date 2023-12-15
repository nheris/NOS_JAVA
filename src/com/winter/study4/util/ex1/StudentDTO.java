package com.winter.study4.util.ex1;

public class StudentDTO {
	//Date Transfer Object
	//VO Value Object
	private String name;
	private int num;
	private int liter;
	private int	eng;
	private int math;
	private int sum;
	public void setAvg(int avg) {
		this.avg = avg;
	}
	private int avg;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public int getLiter() {
		return liter;
	}
	public void setLiter(int lit) {
		this.liter = lit;
	}
	public int getEng() {
		return eng;
	}
	public void setEng(int eng) {
		this.eng = eng;
	}
	public int getMath() {
		return math;
	}
	public void setMath(int math) {
		this.math = math;
	}
	public int getSum() {
		return sum;
	}
	public void setSum(int sum) {
		this.sum = sum;
	}
	public int getAvg() {
		return avg;
	}

}
