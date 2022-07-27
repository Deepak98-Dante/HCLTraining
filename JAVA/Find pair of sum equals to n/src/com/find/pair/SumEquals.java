package com.find.pair;

import java.util.Scanner;
import java.util.function.BiPredicate;

public class SumEquals {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {24,54,56,76};
		int n1=a.length;
		int x,y;
		System.out.println("Enter n value:");
		Scanner s=new Scanner(System.in);
		Integer n=s.nextInt();
		Integer runcheck;
		BiPredicate<Integer,Integer> check=(e,f)->(e==f);
		for( int i=0;i<n1;i++)
		{
			for (int j=i+1;j<n1;j++)
			{
				runcheck=a[i]+a[j];
				if (check.test(runcheck, n))
				
				{
				x=a[i];
				y=a[j];
				System.out.println("Pair of Sum Equals to n in Given Array : "+x+","+y);
				}
			}
		}
		
	}
}


