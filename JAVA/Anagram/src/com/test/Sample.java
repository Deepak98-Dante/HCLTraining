package com.test;

import java.util.Arrays;
import java.util.Scanner;

public class Sample {

	public static void main (String args[])
	{
	Scanner s=new Scanner(System.in);
	String s1=s.next();
	String s2=s.next();
	Boolean status;
	if(s1.length()!=s2.length())
	{
		status=false;
	}
	else 
	{
		char[] Arrays1=s1.toLowerCase().toCharArray();
		char[] Arrays2=s2.toLowerCase().toCharArray();
		Arrays.sort(Arrays1);
		Arrays.sort(Arrays2);
		status=Arrays1.equals(Arrays2);
	}
	if(status)
	{
		System.out.println("Anagram");
	}
	else
	{
		System.out.println("Not Anagram");
	}
	

	
}
}
