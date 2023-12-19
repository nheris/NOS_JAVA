package com.winter.study5;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Test {
	public void t1(ArrayList<Integer> ar) {
		System.out.println(ar);
		System.out.println(ar.get(0));
		//nullpointer
		String str=ar.get(0).toString();
	}
}
