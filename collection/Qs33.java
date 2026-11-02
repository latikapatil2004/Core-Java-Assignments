/*24	Find first repeating element	[10, 5, 3, 4, 3, 5, 6]	5, if earliest repeated occurrence*/

import java.util.*;
class Qs33
{
	public static void main(String[]args)
	{
		List<Integer>al=new ArrayList<>();
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the array size");
		int n=sc.nextInt();
		for(int i=0;i<n;i++)
		{
			al.add(sc.nextInt());
		}
		
		Set<Integer>set=new HashSet<>();
		for(int num : al)
		{
			if(set.contains(num))
			{
			 System.out.println(num);
			 return;

			}
			else
			{
				set.add(num);
			}				
		}
		
}
}
