import java.util.*;
import java.util.function.*;
class Qs19
{
	public static void main(String[]args)
	{
		
		
			System.out.println(((Function<Integer,Integer>)((Integer val)->val*2)).compose((Integer val)->val*val).apply(10));
	}
}