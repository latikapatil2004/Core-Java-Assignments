import java.util.function.*;
import java.util.*;
import java.util.stream.Stream; 
class Qs29
{
	public static void main(String[]args)
	{
		
	
		List.of(1,2,3,4,56,5,3,2,7).stream().map((Integer val)->val*2).forEach((Integer val)->System.out.println(val));
	}
}