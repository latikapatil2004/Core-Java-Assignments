import java.util.stream.*;
import java.util.function.*;
import java.util.*;
class Qs31
{
	public static void main(String[]args)
	{
		List<Integer>al=List.of(9,2,4,1,4,10);
		
		al.stream().sorted().forEach((Integer val)->System.out.println(val));
	}
}
