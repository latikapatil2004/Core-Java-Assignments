/* ] Find elements with odd frequency*/

import java.util.*;
class Arrays23
{
	public  static void main(String[]args)
	{
		HashMap<Integer,Integer>map=new HashMap<>();
		int arr[]={1,2,3,4,5,1,2,3,1,2,1,2,4};
		for(int i=0;i<arr.length;i++)
		{
			if(map.containsKey(arr[i]))
			{
				map.put(arr[i],map.get(arr[i])+1);
			}
			else
			{
				map.put(arr[i],1);
			}
		}
		for(Map.Entry<Integer,Integer>entry:map.entrySet())
		{
			if(entry.getValue()%2!=0)
			{
				System.out.println(entry.getKey()+":"+entry.getValue());
			}
		}
	}
}