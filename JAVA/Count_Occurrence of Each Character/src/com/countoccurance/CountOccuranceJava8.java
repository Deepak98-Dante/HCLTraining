package com.countoccurance;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.stream.Collectors;
import java.util.Map;

public class CountOccuranceJava8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="aaaccbbbdeeddddeea";
		
		Map <String,Long> result=Arrays.stream(s.split("")).map(String::toLowerCase).collect(Collectors.groupingBy(str->str,LinkedHashMap::new,Collectors.counting()));
	    System.out.println(result);
	     CountOccurrance.Count(s);   
	    CountOccurranceHashMap.Count(s);
	}

}
