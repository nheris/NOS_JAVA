package com.winter.study4.lang.ex2;

import java.util.Scanner;

public class Ex2Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("주민번호 입력"); //991225-1234567;
		String numstr = sc.next();
		
		//남여
//		System.out.println(numstr.charAt(7)); 
		int gender=numstr.charAt(7)-'0';
		if(gender%2 == 1) {
			System.out.println("남성");
		}else if(gender%2 == 0) {
			System.out.println("여성");
		}
		
		//나이
		int age = Integer.parseInt(numstr.substring(0,2));
		age = 2023-(age+1900);
		System.out.println("현재나이 : "+age);
		
		//계절
		int season = Integer.parseInt(numstr.substring(2,4)) ;
		if(3<=season&&season<=5) {
			System.out.println("봄에 태어난 당신");
		}else if(6<=season&&season<=8) {
			System.out.println("여름에 태어난 당신");
		}else if(9<=season&&season<=11) {
			System.out.println("가을에 태어난 당신");
		}else {
			System.out.println("겨울에 태어난 당신");
		}
		
		//타당한지
		char [] chs = numstr.toCharArray();
		
		int temp=2;
		int sum=0;
		for(int i=0;i<numstr.length()-1;i++) {
			if(i==6) {
				continue;
			}
			if(temp>9) {
				temp=2;
			}
			char c = numstr.charAt(i);
			int n = Integer.parseInt(String.valueOf(c));
			sum=sum+n*temp;
			temp++;
		}
		
		sum=11-sum%11;
		if(sum>9) {
			sum=sum%10;
		}
		
		if(sum==numstr.charAt(numstr.length()-1)) {
			
		}
		
		//1.남자여자 구별
		//2.나이
		//3.태어난 계절
		//4.주민번호 타당한지
		// 9 9 1 2 2 5 - 1 2 3 4 5 6 7
		//*2 3 4 5 6 7   8 9 2 3 4 5 
		// 총합구하기
		//ex)122(총합)을 11로 나눈 나머지를 구함
		//11에서 나머지를 뻄 결과를 채크용 번호(젤끝번호)와 비교
		//결과가 2자리라면
		//그나머지를 100으로 나눈 나머지를 구함
		//그 나머지를 체크번호와 일치하는지 확인

		
		
		
		
	}

}
