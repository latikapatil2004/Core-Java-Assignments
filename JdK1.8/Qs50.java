

import java.util.*;
import java.util.stream.*;
import java.util.function.*;

class Qs50
{
	public static void main(String[]args)
	{
		List<String>al=List.of("Amit","null","Rahul","Sneha","Priya");
		Stream<String>s=al.stream();
		Predicate<String>p=new Predicate<>()
		{
			public boolean test(String str)
			{
				return !str.equals("null");
			}
		};
		
		Stream<String>s1=s.filter(p);
		List<String>list=s1.collect(Collectors.toList());
		System.out.println(list);
	}
}