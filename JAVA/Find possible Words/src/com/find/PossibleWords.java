package com.find;

public class PossibleWords {
	
	static void printPermutn(String str, String ans)
    {
		 
        // If string is empty
        if (str.length() == 0) {
        	
        	if(Character.isUpperCase(ans.charAt(0)))
        	{
            System.out.println(ans + " ");
        	}
        	
            return;
        	
        }
        /*else if( ans.length() > 1)
        {
        	if(Character.isUpperCase(ans.charAt(0)))
        	System.out.println(ans + " ");
        }*/
 
        for (int i = 0; i < str.length(); i++) {
 
            // ith character of str
            char ch = str.charAt(i);
 
            // Rest of the string after excluding
            // the ith character
            
            String ros = str.substring(0, i) +
                         str.substring(i + 1);
            //System.out.println("ros:"+os);
 
            // Recursive call
            printPermutn(ros, ans + ch);
        }
        }
        
	public static void wordform(String input[]){
	
		 
		 String  target= "purple";
		 int length=input.length;
		
		 
		 for (int i=0;i<length;i++)
		 {
			 for (int j=0;j<length;j++)
			 {
				 for (int k=0;k<length;k++)
				 {
					 String temp="";
					 temp=input[i].concat(input[j].concat(input[k]));
					 if(target.equals(temp))
					 {
						 System.out.println("Given word can be form : "+temp);
					 }
				 }	 
			 }
			 
		 } 
			 
		 
    
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String s = "aBcD";
	    printPermutn(s, "");
		String[] input = {"pu","ple","rp","up","le"};
		wordform(input);
	}

}
