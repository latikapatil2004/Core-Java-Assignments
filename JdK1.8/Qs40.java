import java.util.*;
import java.util.stream.*;
import java.util.function.*;
import java.util.Comparator;
class Qs40
{
	public static void main(String[]args)
	{
		List<Integer>al=List.of(50,10,40,20,30);
		Stream<Integer>s=al.stream();
		Stream<Integer>s2=s.sorted();
		Stream<Integer>s3=s2.sorted(Comparator.reverseOrder());
		List<Integer>list=s3.collect(Collectors.toList());
		System.out.println(list);
		}
	}