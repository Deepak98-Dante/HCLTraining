package com.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Min_Max {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Integer> l=new ArrayList(Arrays.asList(3,5,18,4,6)); 
		
		System.out.println("Min Number:"+Collections.min(l));
		System.out.println("Max Number:"+Collections.max(l));
		
		int lastindex=l.size()-1;
		Collections.sort(l);
		System.out.println("Max Number:"+l.get(lastindex));
		System.out.println("Min Number:"+l.get(0));
	}

}
