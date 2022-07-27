package com.sample;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Distinct {

	 // Prints unique words in a string
    static void printUniquedWords(String str)
    {
        // Extracting words from string
        Pattern p = Pattern.compile("[a-zA-Z]+");
        Matcher m = p.matcher(str);
         
        // Map to store count of a word
        HashMap<String, Integer> hm = new HashMap<>();
         
        // if a word found
        while (m.find())
        {
            String word = m.group();
             
            // If this is first occurrence of word
            if(!hm.containsKey(word))
                hm.put(word, 1);
            else
                // increment counter of word
                hm.put(word, hm.get(word) + 1);
             
        }
     // Traverse map and print all words whose count
        // is  1
        Set<String> s = hm.keySet();
        Iterator<String> itr = s.iterator();
 
        while(itr.hasNext())
        {
            String w = itr.next();
             
            if (hm.get(w) > 1)
                System.out.println(w);
        }   
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="The Java is the best programming language in among all programmimg language  ";
		printUniquedWords(s);
		
	}

}
