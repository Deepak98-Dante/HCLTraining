package com.java.features.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;


public class Streams {
public static void main (String args[])
{
	// create a list of integers
    List<Integer> number = Arrays.asList(2,3,4,5,2);
    List<Integer> empty=new ArrayList<Integer>();
  
    // demonstration of map method
    List<Integer> square = number.stream().map(x -> x*x).
                           collect(Collectors.toList());
    // demonstration of all match method
    Boolean allmatch=number.stream().allMatch(x -> x >=2);
    
    // demonstration of any match method
    Boolean anymatch=empty.stream().anyMatch(x -> x >5);
    
 // demonstration of any match method
    long count=number.stream().count();
    
    // demonstration of foreach match method
    System.out.println("Elements in Array:");
    number.stream().forEach(System.out::print);
    
    // demonstration of distinct match method
    System.out.println("\nUnique Elements in Array:");
    number.stream().distinct().forEach(System.out::print);
    
    System.out.println(square);
    System.out.println(allmatch);
    System.out.println(anymatch);
    System.out.println(count);
  
    // create a list of String
    List<String> names =
                Arrays.asList("Reflection","Collection","Stream");
    Optional<String> answer = names.stream().findAny();
    
    if(answer.isPresent())
    {
    	System.out.println(answer.get());
    }
    else {
        System.out.println("no value");
    }
    
    // demonstration of filter method
    List<String> result = names.stream().filter(s->s.startsWith("S")).
                          collect(Collectors.toList());
    System.out.println(result);
  
    // demonstration of sorted method
    List<String> show =
            names.stream().sorted().collect(Collectors.toList());
    System.out.println(show);
  
    // create a list of integers
    List<Integer> numbers = Arrays.asList(2,3,4,5,2);
  
    // collect method returns a set
    Set<Integer> squareSet =
         numbers.stream().map(x->x*x).collect(Collectors.toSet());
    System.out.println(squareSet);
  
    // demonstration of forEach method
    number.stream().map(x->x*x).forEach(y->System.out.println(y));
  
    // demonstration of reduce method
    int even =
       number.stream().filter(x->x%2==0).reduce(0,(ans,i)-> ans+i);
  
    System.out.println(even);
}
}
