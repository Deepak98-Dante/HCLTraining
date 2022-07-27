package max.count;

import java.util.Arrays;
import java.util.List;
import java.util.NoSuchElementException;

public class Check {
	public static void main(String args[])
	{
	List<Integer> list=Arrays.asList(10,15,8,49,25,98,98,32,15);
    Integer result=list.stream().mapToInt(x->x).max().orElseThrow(NoSuchElementException::new);
    Long Count=list.stream().filter(z->z==result).count();
    
    
    System.out.println("Max value in Given Array - "+result+"\nNumber of times repeated - "+Count);
	}

}
