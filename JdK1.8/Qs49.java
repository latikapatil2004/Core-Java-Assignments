

import java.util.*;
import java.util.stream.*;
import java.util.function.*;

class Qs49
{
	public static void main(String []args)
	{
		List<Integer>al=List.of(10,20,10,30,20,40,50,30);
		Stream<Integer>s=al.stream();
		Stream<Integer>s1=s.distinct();
		List<Integer>list=s1.collect(Collectors.toList());
		System.out.println(list);
		
	}
}