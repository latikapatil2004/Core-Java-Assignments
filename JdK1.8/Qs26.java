
import java.util.function.Function;
class Qs26
{
	public static void main(String[]args)
	{
		
		int result=((Function<Integer,Integer>)(Integer val)->val*val).apply(4);
		System.out.println(result);
	}
	
}