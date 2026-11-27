import java.util.*;
import java.util.stream.*;
import java.util.function.*;
class Qs35
{
	public static void main(String[]args)
	{
		List<Integer>al=List.of(1,2,3,4,5,6,7,8,9);
		Stream<Integer>s=al.stream();
		Predicate<Integer>p=new Predicate<>()
		{
			public boolean test(Integer val)
			{
				return val%2==0;
			}
		};
		Stream <Integer>s1=s.filter(p);
		Consumer<Integer>c=new Consumer<>()
		{
			public void accept(Integer val)
			{
				System.out.println(val);
			}
		};
		s1.forEach(c);
		
	}
}