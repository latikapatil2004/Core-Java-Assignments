import java.util.function.*;

class Qs17
{
	public static void main(String[]arg)
	{
		Predicate<Integer>p;
		boolean result==((Integer val)->val%2==0).test(10);
		if(result)
		{
			System.out.println("NO is even ");
		}
		else
		{
			System.out.println("no is odd");
		}
	}
}