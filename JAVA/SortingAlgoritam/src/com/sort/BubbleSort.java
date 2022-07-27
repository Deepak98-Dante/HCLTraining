package com.sort;

public class BubbleSort {

	public static void sort(int[] x)
	{
		int temp=0,i,j;
		for (i=0;i<x.length;i++)
		{
			for(j=0;j<x.length;j++)
			{
			if(x[i]<x[j])
			{
			 temp=x[i];
			 x[i]=x[j];
			 x[j]=temp;
			 
			 }
			}
		}
		
		System.out.println("Ascending Order");
		for(i=0;i<x.length;i++)
		{
			System.out.print(x[i]+" ");
		}
		
		System.out.println("\nDescending Order");
		for(i=x.length-1;i>=0;i--)
		{
			System.out.print(x[i]+" ");
		}
	}
	
}
