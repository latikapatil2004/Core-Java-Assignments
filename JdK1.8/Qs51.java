import java.util.*;
import java.util.stream.*;
import java.util.function.*;
class Qs51
{
	public static void main(String[]args)
	{
		List<String>al=List.of("Amit","Ankit","Rahul","Sneha","Priya","Ajay");
		Stream<String>s=al.stream();
		Predicate<String>p=new Predicate<>()
		{
			public boolean test(String str)
			{
				return !str.startsWith("A");
			}
		};
		Stream<String>s1=s.filter(p);
		List<String>list=s1.collect(Collectors.toList());
		System.out.println(list);
	}
}
