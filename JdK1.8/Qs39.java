import java.util.*;
import java.util.stream.*;
import java.util.function.*;
class Qs39
{
	public static void main(String[]args)
	{
		List<Integer>al=List.of(50,10,40,20,30);
		Stream<Integer>s=al.stream();
		Stream<Integer>s2=s.sorted();
		List<Integer>list=s2.collect(Collectors.toList());
		System.out.println(list);
		}
	}