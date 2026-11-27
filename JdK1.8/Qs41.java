import java.util.*;
import java.util.stream.*;
import java.util.function.*;
import java.util.Comparator;
class Qs41
{
	public static void main(String[]args)
	{
		List<String>al=List.of("Vikas","Amit","Snheha","Rahul","Priya");
		Stream<String>s=al.stream();
		Stream<String>s1=s.sorted();
		List<String>list=s1.collect(Collectors.toList());
		System.out.println(list);
	}
}