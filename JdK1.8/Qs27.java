import java.util.function.Function;
class Qs27

{
	public static void main(String[]args)
	{
		
			Integer result=((Function<Integer,Integer>)(Integer val)->val*val).andThen((Function<Integer,Integer>)(Integer res)->res*100).apply(10);
			System.out.println(result);
		}
	}
