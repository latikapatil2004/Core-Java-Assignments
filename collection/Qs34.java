/*25	Find first non-repeating element	[4, 5, 1, 2, 1, 4]	5*/

import java.util.*;
class Qs34
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
		for(Map.Entry<Integer,Integer>entry:map.entrySet())
		{
			if(entry.getValue()==1)
			{
				System.out.println(entry.getKey());
				break;
			}
		}
		
	}
}
