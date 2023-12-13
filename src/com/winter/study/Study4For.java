package com.winter.study;

import java.util.Scanner;

public class Study4For {
	
	public static void main(String [] args) {
		//서든 FPS
		//총알 : 30발 탄창 * 3
		
		//1. 단발모드
		//2. 점사모드
		
		Scanner sc = new Scanner(System.in);
		
		for(int t =0;t<3;t++) {
			System.out.println("1.단발   2. 점사");
			int select=sc.nextInt();
			int count=3;
			String sound="타타탕";
			
			if(select==1) {
				count=1;
				sound="탕";
			}
			
			
//			if(select==1) {
//				for(int b=0;b<30;b++) {
//					System.out.println(b+1+"탕");
//				}
//				
//			}else {
//				for(int b=0;b<10;b++) {
//					System.out.println("타타탕");
//				}
//				
//			}
			
//			--------------------------------------------
			
//			for(int b=0;b<count;b++) {
//				System.out.println(sound);
//			}
//			
//			for(int b=0;b<30;b++) {
//				if(select==2) {
//					b=b+2;
//					System.out.println("타타탕");
//				}
//				System.out.println("탕");
//			}
			
			for(int b=0;b<30;b=b+count) {
				System.out.println(sound);
			}
			
			
			System.out.println("탄창 교체");
		}
		
	}

}
