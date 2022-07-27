package com.sort;

public class SelectionSort {
	
	public static void sort(int[] y)
	{
		int n=y.length;
		
		// One by one move boundary of unsorted subarray
		for (int i=0;i<n-1;i++)
		{
			int min_index=i;
			for(int j=i+1;j<n;j++)
			{
				if(y[j]<y[min_index])
				{
					min_index=j;
					// Swap the found minimum element with the first element
					int temp=y[min_index];
					y[min_index]=y[i];
					y[i]=temp;
		             
				}
			}
		}
		System.out.println("\nSelection Sort Results:");
		for (int i=0; i<n; ++i)
            System.out.print(y[i]+" ");
        System.out.println();
	}

}
