import java.util.*;
import java.util.stream.*;
import java.util.function.*;
class Qs35ModifiedLambda
{
	public static void main(String[]args)
	{
		List.of(1,2,3,4,5,6,7,8,9).stream().filter((Integer val)->val%2==0).forEach((Integer val)->System.out.println(val));
		
	}
}