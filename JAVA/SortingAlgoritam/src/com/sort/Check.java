package com.sort;

import java.util.ArrayList;
import java.util.Arrays;

public class Check {

	public static void main (String args[])
	{
		int[] number= {20,70,40,22,10,56,11};
		
		BubbleSort.sort(number);
		SelectionSort.sort(number);
		
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		numbers.addAll(Arrays.asList(20,70,40,22,10,56,11));
		for (int i=0;i<numbers.size();i++)
		{
			System.out.print(numbers.get(i) + " ");
		}
		
		
	}
	
}
