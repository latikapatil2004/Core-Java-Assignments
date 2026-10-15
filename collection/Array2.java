/*
Find first repeating element	[10, 5, 3, 4, 3, 5, 6]	5 if scanning for the earliest repeated occurrence*/

import java.util.*;
class Array2
{
	public static void main(String[]args)
	{
		int arr[]={1, 2, 3, 2, 4, 1};
		Arrays.sort(arr);
		for(int i=1;i<arr.length;i++)
		{
			if(arr[i]!=arr[i-1])
			{
				System.out.println(arr[i]);
				break;
			}
		}
	
}
}