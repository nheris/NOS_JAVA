package com.winter.study3.ex;

import java.util.Scanner;

public class CardManager {
	private Scanner sc;
	
	public CardManager() {
		sc = new Scanner(System.in);
	}
	
	public Card[] addCard(Card[] cards) {
		Card card = new Card();		

//		card.setNum(cards.length+1); 이거하면 왜 안되
		System.out.println("번호 입력");
		card.setNum(sc.nextInt());
		System.out.println("추가할 회사명");
		card.setCompany(sc.next());
		System.out.println("추가할 이름");
		card.setName(sc.next());
		System.out.println("추가할 직급");
		card.setPosition(sc.next());
		System.out.println("추가할 전화번호");
		card.setNumber(sc.next());
		System.out.println("추가할 이메일");
		card.setEmail(sc.next());
		System.out.println("추가할 주소");
		card.setAddr(sc.next());
		
		//Card 배열이 null 체크
		if(cards == null) {
			Card [] newCards = new Card[1];
			newCards[0]=card;
			return newCards;
		}else {
			Card[] newCards = new Card[cards.length+1];
			for (int i = 0; i<cards.length ;i++) {
				newCards[i]= cards[i];
			}
			newCards[cards.length]= card;
			
			return newCards;
			
		}
		
		
	
	}
	
	
	public Card[] DeleteCard(Card[] cards) {
		System.out.println("삭제할 번호를 입력하세요.");
		int deleteNum = sc.nextInt();
		int idx=-1;
		//삭제할 명함의 index 번호 찾기
		for(int i=0; i<cards.length;i++) {
			if(deleteNum ==cards[i].getNum()) {
				idx=i;
				break;
			}

		} 
		if(idx!=-1) {
			Card[] newCards = new Card[cards.length-1];
			int j=0;
			for(int i=0;i<cards.length;i++) {
				if(idx ==i) {
					continue;
				}
				newCards[j]=cards[i];
				j++;
			}
			
			return newCards;
			
		}else {
			return cards;
		}

		
		
		
	}
	
}
