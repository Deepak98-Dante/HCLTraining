package com.find.pair;

import java.util.function.BiPredicate;
import java.util.function.IntPredicate;

public class MaximumProduct {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[]= {2,4,5,7,9};
		int n=a.length;
		int x=a[0],y=a[1];
		Integer product=x*y;
		Integer runcheck;
		BiPredicate<Integer,Integer> check=(e,f)->(e>f);
		for( int i=0;i<n;i++)
		{
			for (int j=i+1;j<n;j++)
			{
				runcheck=a[i]*a[j];
				if (check.test(runcheck, product))
				//if ((a[i]*a[j])>(x*y))
				{
				x=a[i];
				y=a[j];
				}
			}
		}
		System.out.println("Paimr of maximum Product in Given Array : "+x+","+y);
	}

}
