package com.winter.study3.rpg;

public class RpgMain {

	public static void main(String[] args) {
		Magiction magiction = new Magiction();
		magiction.name="winter";
		magiction.hp=100;
		magiction.mp=200;
		
		Magiction magiction2 = new Magiction();
		magiction2.name="iu";
		magiction.info();
		System.out.println(magiction);
		magiction2.info();
		System.out.println(magiction2);
	
		
		

	}

}
