package com.winter.study2;

public class ArrayStudy3 {

	public static void main(String[] args) {
		int [] ar = {2,5,4,1,3};
		
		//0 - 1,2,3,4
		//1 - 2,3,4
		//2 - 3,4
		//3 - 4
		
		for(int i=0;i<ar.length-1;i++) {
			for(int j=i+1;j<ar.length;j++) {
				if(ar[i]>ar[j]) {
					int t = ar[i];
					ar[i]=ar[j];
					ar[j]=t;
				}
			}
		}
		
		for(int i=0;i<ar.length;i++) {
			System.out.println(ar[i]);
		}
		
		
		
		
		
		
		

	}

}
