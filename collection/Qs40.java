import java.util.*;
class Qs40
{
	public static void main(String[]args)
	{
		List<Integer>al=List.of(10, 20, 10, 30, 20, 40);
		LinkedHashSet<Integer>lh=new LinkedHashSet<>(al);
		for(Integer i :lh)
		{
			System.out.println(i);
		}
	}
}