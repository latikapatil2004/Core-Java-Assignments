/*Question 2 – Find Duplicate Elements and Their Frequency from Array
Statement:
Given an integer array, use a Map<Integer, Integer> to find all duplicate elements and their occurrence count. Display only those elements whose frequency is greater than 1.
Explanation:
Traverse the array. 
Store each number as a key. 
Store its occurrence count as the value. 
After processing the complete array, display only duplicate numbers. 
Input:
int[] arr = {10, 20, 30, 20, 40, 10, 50, 20, 30, 60, 10, 40};
Output:
10 = 3
20 = 3
30 = 2
40 = 2*/

import java.util.*;
class MapQs8
{
	public static void main(String[]args)
	{
		int arr[]={10, 20, 30, 20, 40, 10, 50, 20, 30, 60, 10, 40};
		Map<Integer,Integer>map=new TreeMap<>();
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
		for(Map.Entry<Integer,Integer>entry: map.entrySet())
		{
			if(entry.getValue()>1)
			{
			System.out.println(entry.getKey() + " " + entry.getValue());
			}
		}
	}
}