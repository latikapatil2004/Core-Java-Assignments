/*Count the occurrences of a given number
*/
import java.util.*;
class Arrays1
{
	public static void main(String[]args)
	{
		Map<Integer,Integer>map=new HashMap<>();
		int num=5;
		int arr[]={1,2,1,3,2,4,3,5,6,1,5};

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
			if(entry.getKey()==num)
			{
				System.out.println(entry.getValue());
			}
		}
	}
}