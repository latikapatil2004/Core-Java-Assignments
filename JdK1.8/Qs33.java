import java.util.*;
import java.util.function.*;
import java.util.stream.*;
class Qs34
{
	public static void main(String[]args)
	{
		List<Integer>al=List.of(10,20,30,40,50,60,70,80,90);
		Stream<Integer>s=al.stream;
		Function<Integer,Integer>p=new Function<Integer,Integer>(){
			public Integer apply(Integer val)
			{
				return val>50;
			}
		};
		
		Stream s1= s.filter(p);
		Consumer<Integer>c=new Consumer<>()
		{
			public void accept(Integer val)
			{
				System.out.println(val);
			}
		};
		s1.forEach(c);
	}
}