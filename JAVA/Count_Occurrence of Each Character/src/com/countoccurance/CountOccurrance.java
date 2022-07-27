package com.countoccurance;

public class CountOccurrance {
	
	public static void Count(String s)
	{
		int i,len;
		int counter[]=new int[256];
		len=s.length();
		// loop through the string and count frequency of every character and store it in counter array
		for (i=0;i<len;i++)
			counter[s.charAt(i)]++;
		//print Frequency of characters  
		for (i=0;i<counter.length-1;i++)
		{
			if(counter[i]!=0)
			{
				System.out.println((char)i+"-->"+counter[i]);
			}
		}
	}

}
