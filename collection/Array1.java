/*Find repeating elements	[1, 2, 3, 2, 4, 1]	1,2*/

import java.util.*;
class Array1
{
	public static void main(String[]args)
	{
		int arr[]={1, 2, 3, 2, 4, 1};
		Arrays.sort(arr);
		for(int i=1;i<arr.length;i++)
		{
			if(arr[i]==arr[i-1])
			{
				System.out.println(arr[i]);
		
			}
		}
	
}
}