/*30	Find intersection of two lists	[1, 2, 3] and [2, 3, 4]	[2, 3]*/

import java.util.*;
class Qs38
{
	public static void main(String[]arg)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter sizze");
		int n=sc.nextInt();
		List<Integer>al=new ArrayList<>();
		List<Integer>list=new ArrayList<>();
		for(int i=0;i<n;i++)
		{
			al.add(sc.nextInt());
		}
		for(int i=0;i<n;i++)
		{
			list.add(sc.nextInt());
		}
		int j=0;
		for(int i=0;i<al.size();i++)
		{
			if(al.get(i)==list.get(j))
			{
				System.out.println(al.get(i));
			}
			
			j++;
		}
		
	}
}
