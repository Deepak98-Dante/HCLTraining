package com.countoccurance;

import java.util.HashMap;

public class CountOccurranceHashMap {
	
	public static void Count(String x)
	{
		HashMap<Character, Integer> h1=new HashMap<Character,Integer>();
		
		for (int i=0;i<=x.length()-1;i++)
		{
			if(h1.containsKey(x.charAt(i)))
			{
				int count=h1.get(x.charAt(i));
				h1.put(x.charAt(i), ++count);
				
			}
			else
			{
				h1.put(x.charAt(i), 1);
			}
		}
		System.out.println(h1);
	}

}
