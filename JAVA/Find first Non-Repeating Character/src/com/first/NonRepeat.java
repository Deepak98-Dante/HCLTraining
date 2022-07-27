package com.first;

public class NonRepeat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			String s="I am going for an interview".toLowerCase();
			
				int len=s.length();
				for (int i=0;i<len;i++)
				{
					if(s.indexOf(s.charAt(i))==(s.lastIndexOf(s.charAt(i))))
					{

						System.out.println("First Non-Repeating Character :"+s.charAt(i));
						break;
					}
				}
			

		}


	}


