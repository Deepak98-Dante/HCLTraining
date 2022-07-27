package com.primenumber;

public class Prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int a=3;
		int counter=0;
		for (int j=1;j<=100;j++) {
			counter=0;
		for (int i=1;i<=j;i++)
		{
			if(j%i==0)
			{
				counter=counter+1;
			}
		}
		
		if(counter==2)
		{
			System.out.println(j+" is a Prime");
			
		}
		}
	}

}
