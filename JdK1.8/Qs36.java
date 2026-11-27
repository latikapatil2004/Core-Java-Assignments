import java.util.*;
import java.util.stream.*;
import java.util.function.*;
class Qs36
{
	public static void main(String[]args)
	{
		List<String>al=List.of("rahul","sai","aai","papa");
		Stream<String>s=al.stream();
		Predicate<String>p=new Predicate<>()
		{
			public boolean test(String s)
			{
				return s.equals("rahul");
				
					
			}
		};
		boolean result=s.anyMatch(p);
		System.out.println(result);
	}
	
}