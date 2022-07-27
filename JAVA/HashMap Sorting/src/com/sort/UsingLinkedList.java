package com.sort;

import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class UsingLinkedList {
	
	// function to sort hashmap by values
    public static HashMap<String, Integer> sortByValue(HashMap<String, Integer> hm)
    {
        // Create a list from elements of HashMap
        List<Map.Entry<String, Integer> > list =
               new LinkedList<Map.Entry<String, Integer> >(hm.entrySet());
 
        // Sort the list
        Collections.sort(list, new Comparator<Map.Entry<String, Integer> >() {
            public int compare(Map.Entry<String, Integer> o1,
                               Map.Entry<String, Integer> o2)
            {
                return (o1.getValue()).compareTo(o2.getValue());
            }
        });
         
        // put data from sorted list to hashmap
        HashMap<String, Integer> temp = new LinkedHashMap<String, Integer>();
        for (Map.Entry<String, Integer> aa : list) {
            temp.put(aa.getKey(), aa.getValue());
        }
        return temp;
    }
    

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		 
        // enter data into hashmap
        map.put("English", 98);
        map.put("Grammer", 85);
        map.put("Computer Science", 91);
        map.put("Social Science", 95);
        map.put("Maths", 79);
        map.put("Physics", 80);
        Map<String, Integer> map1 = sortByValue(map);
 
        // print the sorted hashmap
        for (Map.Entry<String, Integer> en : map1.entrySet()) {
            System.out.println("Key = " + en.getKey() +
                          ", Value = " + en.getValue());
        }

}
}