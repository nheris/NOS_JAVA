package com.winter.study2;

import java.util.Scanner;

public class ArrayStudy4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean check=true;
		String [] names=null;
		int [] nums=null;
		double [] jumsu=null;
		
		
		while(check) {
			System.out.println("1. 학생정보생성.");
			System.out.println("2. 학생정보출력");
			System.out.println("3. 학생정보검색");
			System.out.println("4. 성적순출력");
			System.out.println("5. 프로그램종료");
			int select = sc.nextInt();
			
			if(select==1) {
				System.out.println("학생수를 입력");
				select = sc.nextInt();
				names = new String [select];
				nums = new int[select];
				jumsu = new double[select];
				for(int i=0;i<names.length;i++) {
					System.out.println(i+1+" 번째 학생 이름 입력");
					names[i]=sc.next();
					System.out.println(i+1+" 번째 학생 번호 입력");
					nums[i]=sc.nextInt();
					System.out.println(i+1+" 번째 학생 학점 입력");
					jumsu[i]=sc.nextDouble();
					
				}
				
				
			}else if(select==2) {
				System.out.println("전체출력");
				for(int i=0;i<names.length;i++) {
					System.out.println("Name : "+names[i]);
					System.out.println("Num : "+nums[i]);
					System.out.println("Jumsu : "+jumsu[i]);
				}
				
			}else if(select==3) {
				System.out.println("검색");
			}else if(select==4) {
				System.out.println("성적순");
			}else {
				check=false;
				System.out.println("프로그램을 종료 합니다");
				break;
			}
			
		}
		
		//1. 학생정보생성
		//   - 학생수를 입력 받음
		//   - 학생수 만큼 이름, 번호, 학점
		
		//2. 학생정보출력
		//3. 학생정보검색
		//   -검색할 학생번호를 입력받아서 해당학생의 정보를 출력
		//4. 성적순출력
		//5. 프로그램종료
		
		

	}

}
