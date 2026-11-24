import java.util.*;
class Qs44
{
	public static void main(String[]args)
	{
		int arr[]={1, 2, 2, 3, 1, 1, 4};
		HashMap<Integer,Integer>map=new HashMap<>();
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
		for(Map.Entry<Integer,Integer> entry:map.entrySet())
		{
			if(entry.getValue()==2)
			{
			System.out.println(entry.getKey());
			break;
			}
		}
		
	}
}