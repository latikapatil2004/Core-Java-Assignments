import java.util.function.*;
import java.util.*;
import java.util.stream.*;
class Qs30
{
	public static void main(String[]args)
	{
		List<Integer>al=List.of(1,2,3,4,5,6,9);
		
		
			al.stream().filter((Integer val)->val%2==0).forEach((Integer val)->System.out.println(val));
		
		
	
	}
}