import java.util.*;
import java.util.function.*;
import java.util.stream.*;
class Qs34
{
	public static void main(String[]args)
	{
		
		
		
		List.of(10,20,30,40,50,60,70,80,90).stream().filter((Integer val)-> val>50).forEach((Integer val)->System.out.println(val));
	}
}