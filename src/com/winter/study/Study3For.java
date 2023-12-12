package com.winter.study;

import java.util.Scanner;

public class Study3For {
	
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		//
		//0-59분
		//0-59초
		////1분 5초
		//분과 초를 입력
		
		int min=1;
		int sec=5;
		
		//반복문을 종료 하는 방법
		//1. break를 만났을 때
		//2. 조건식이 false일때
		boolean flag=false;
		for(int m=0;m<60;m++) {
			for(int s=0;s<60;s++) {
				System.out.println(m+"분 : "+s+"초");
				if(min==m && sec==s) {
					flag=!flag;
					m=59;
					break;
				}
			}
			
//			if(flag) {
//				break;
//			}
			
		}
		

		
		
		
		
	}

}
