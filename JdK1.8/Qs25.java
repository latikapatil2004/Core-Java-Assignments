import java.util.*;
import java.util.function.*;
class Qs25
{
	public static void main(String[]args)
	{
		
		Predicate<Integer>p=(Integer val)->val%2==0;
		Consumer<Integer>c=(Integer val)->{
				if(p.test(val))
				System.out.println(val);
			};
		List.of(1,2,3,4,5,6,7,8,9,10).forEach(c);
		
	}
}