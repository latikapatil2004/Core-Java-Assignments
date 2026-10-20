



/*Count the frequency of every element
*/

import java.util.*;
class Arrays19
{
	public static void main(String[]args)
	{
		int arr[]={1,2,1,3,2,4,3,5,6,1,2};
		Map<Integer,Integer>map=new HashMap<>();
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
			System.out.println(entry.getKey()+":"+entry.getValue());
		}
	}
}
