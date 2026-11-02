/*26	Find most frequent element	[2, 3, 2, 4, 2, 3]	2*/

import java.util.*;
class Qs35
{
	public static void main(String[]args)
	{
		List<Integer>al=new ArrayList<>();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no of parameter");
		int n=sc.nextInt();
		for(int i=0;i<n;i++)
		{
			al.add(sc.nextInt());
		}
		Map<Integer,Integer>map=new HashMap<>();
		for(int num:al)	
		{
		 if(map.containsKey(num))
		 {
			 map.put(num,map.get(num)+1);
		 }
		 else
		 {
			 map.put(num,1);
		 }
			
		}
		int max=0;
		for(Map.Entry<Integer,Integer>entry:map.entrySet())
		{
			if(entry.getValue()>max)
			{
				max=entry.getKey();
			}
		}
		System.out.println("most frequent element:"+ max);
		
	}
}
