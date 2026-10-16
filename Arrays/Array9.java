/*Find the smallest missing positive number
Input: arr = [3, 4, -1, 1]
Output: 2*/
import java.util.*;
class Array9
{
	public static void main(String[]args)
	{
		int arr[]={3, 4, -1, 1};
		int n=4;
		int smallest=Integer.MAX_VALUE;
		boolean seen[]=new boolean[n+1];
		for(int i=0;i<arr.length;i++)
		{
			seen[arr[i]]=true;
		}
		for(int i=1;i<=n;i++)
		{
			if(!seen[i])
			{
				if(i<=smallest)
				{
					smallest=i;
				}
			}
		}
		System.out.println(smallest);
	}
}

		
	