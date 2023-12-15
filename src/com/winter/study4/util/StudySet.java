package com.winter.study4.util;

import java.util.HashSet;
import java.util.Iterator;

public class StudySet {
	public static void main(String[] args) {
		HashSet<String> hs = new HashSet<>();
		
		hs.add("test");
		hs.add("second");
		hs.add("third");
		hs.add("test");
		
		
		System.out.println(hs.size());
		System.out.println(hs);
		//순서유지x
		
		Iterator<String> it =  hs.iterator();
		
		while(it.hasNext()) {
			
		}
		System.out.println(hs.iterator());
		
		//뭔소리고!! 뭔소리냐구!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
		//례????????
	}
}
