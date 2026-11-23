import java.util.function.*;
class Qs18
{
	public static void main(String[]args)
	{
		Function<Integer,Integer> f=(Integer val)->val*val;
		System.out.println(f.apply(4));
	}

}