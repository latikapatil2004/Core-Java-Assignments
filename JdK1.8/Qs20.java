import java.util.function.*;
class Qs20
{
	public static void main(String[]args)
	{

		System.out.println(((Function<Integer,Integer>)((Integer val)-> val*2)).andThen((Integer val)-> val*val).apply(5));
	
	
	}
}