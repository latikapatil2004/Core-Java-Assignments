/*23	Count frequency of every element	[2, 3, 2, 4, 2, 3]	2=3, 3=2, 4=1*/

import java.util.*;
class Qs32
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
		
		Map<Integer,Integer>map=new HashMap<>();
		for(int num : al)
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
		for(Map.Entry<Integer,Integer> entry:map.entrySet())
		{
			
			System.out.println(entry.getKey()+":"+ entry.getValue());
		}
	}
}