/*Assignment 16: Convert All Names into Uppercase
Description:
Create a list of employee names and convert all names into uppercase using the Stream API.
Requirements:
Use map().
Use toUpperCase().
Collect the converted names into a new list.
Input:
["amit", "rahul", "sneha", "priya"]
Expected Output:
["AMIT", "RAHUL", "SNEHA", "PRIYA"]*/

import java.util.*;
import java.util.stream.*;
import java.util.function.*;
class Qs53
{
	public static void main(String[]args)
	{
		List<String>al=List.of("amit", "rahul", "sneha", "priya");
		Stream<String>s=al.stream();
		Function<String,String>f=new Function<String,String>()
		{
			public String apply(String str)
			{
				return str.toUpperCase();
			}
		};
		Stream<String>s1=s.map(f);
		List<String>list=s1.collect(Collectors.toList());
		System.out.println(list);
		
	}
}