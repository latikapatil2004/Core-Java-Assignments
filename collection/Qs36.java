/*27	Find elements appearing exactly once	[1, 2, 2, 3, 4, 4]	[1, 3]*/

import java.util.*;
class Qs36
{
	public static void main(String[]args)
	{
		List<Integer>al=new ArrayList<>();
		Scanner sc=new Scanner(System.in);
		System.out.println("enter no of elements");
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
		System.out.println("elements appearing exactly once");
		for(Map.Entry<Integer,Integer>entry:map.entrySet())
		{
			if(entry.getValue()==1)
			{
		System.out.println(""+ entry.getKey());
			}
		
		
	}
}

		
	}