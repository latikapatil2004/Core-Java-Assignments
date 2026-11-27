import java.util.*;
import java.util.stream.*;
import java.util.function.*;
import java.util.Comparator;
class Qs44
{
	public static void main(String[]args)
	{
		List<Integer>al=List.of(10,15,20,25,30,35,40,45);
		Stream<Integer>s=al.stream();
		Predicate<Integer>f=new Predicate<Integer>()
		{
			public boolean test(Integer val)
			{
				return val%2!=0;
			}
		};
			Stream<Integer>s1=s.filter(f);
            List<Integer>list=s1.collect(Collectors.toList());
            System.out.println(list);			
		}
	}