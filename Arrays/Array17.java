

import java.util.*;
class Array17
{
	public static void main(String[]args)
	{
		int arr[]={1,2,3,1,4,2,3,4,5,6,7};
		int Count=0;
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
		for(Map.Entry<Integer,Integer>entry:map.entrySet())
		{
			
		  if(entry.getValue()>=2)
			{
			Count++;
			}
       }
  	System.out.print("Total duplcates"+Count);	   
		
	}}
	
