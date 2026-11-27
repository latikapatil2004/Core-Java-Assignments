import java.util.*;
import java.util.stream.*;
import java.util.function.*;
class Qs38
{
	public static void main(String[]args)
	{
		List<Integer>al=List.of(10,20,30,100,120,103,104,540);
		Stream<Integer>s=al.stream();
		Predicate<Integer>p=new Predicate<>()
		{
			public boolean test(Integer val)
			{
				return val>100;
			}
		};
		Stream<Integer>s1=s.filter(p);
	  Optional<Integer>o=s1.findFirst();
	  System.out.println(o.get());
	}
}