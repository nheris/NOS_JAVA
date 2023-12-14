package com.winter.study4;

public class ApiMain {

	public static void main(String[] args) {
//		System.out.println(String.CASE_INSENSITIVE_ORDER);
//		
//		
//		Object obj = new Object();
//		boolean ch = obj.equals(obj);
//		System.out.println(ch);
//		
//		
//		
//		System.out.println(obj.toString());
		
		StringBuffer sb = new StringBuffer();
		sb.append("abc"); //abc
		sb.append(123); //abc+123
		System.out.println(sb);
		String str = sb.toString();
		System.out.println(str);
		
		int a = 10;
//		Integer it = new Integer(a);//deprecated
		
		Integer it = a;//auto Boxing
		
		a = it;        //auto UnBoxing
		
		double ab = 0.12333333;
		
		System.out.println(ab);
		
		Double abs = ab;//
		
		it = (int)3.12;
		
		System.out.println(abs.isInfinite());
		
		
		String num1 ="3";
		
		int n = Integer.parseInt(num1);
		
		System.out.println(n+2);
	
	}

}
