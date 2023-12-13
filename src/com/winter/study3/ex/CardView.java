package com.winter.study3.ex;

import java.util.Scanner;

public class CardView {
	public void viewCard(Card[] cards) {
		for(int i =0; i<cards.length;i++) {
			
			System.out.println("Num : "+cards[i].getNum());
			System.out.println("Company : "+cards[i].getCompany());
			System.out.println("Name : "+cards[i].getName());
			System.out.println("-------------------------");
			
		}
	}
	
	public void detail(Card[] cards) {
		Scanner sc = new Scanner(System.in);
		System.out.println("번호 입력");
		int num = sc.nextInt();
		
		for(int i=0;i<cards.length;i++) {
			if(num == cards[i].getNum()) {
				System.out.println("Num : "+cards[i].getNum());
				System.out.println("Company : "+cards[i].getCompany());
				System.out.println("Name : "+ cards[i].getName());
				System.out.println("Position : "+ cards[i].getPosition());
				System.out.println("Number : "+ cards[i].getNumber());
				System.out.println("Email : "+ cards[i].getEmail());
				System.out.println("Addr : "+ cards[i].getAddr());
				System.out.println("-------------------------");
				break;
			}
		}
		
		
	}
	
	
}
