/**
Find all missing numbers in a given range
Input: arr = [1, 3, 6], range = 1 to 6
Output: [2, 4, 5] */

class Array7
{
	public static void main(String[]args)
	{
		int arr[]={1,3,6};
		int n=6;
		boolean seen[]=new boolean[n+1];
		for(int i=0;i<arr.length;i++)
		{
			seen[arr[i]]=true;
		}
		for(int i=1;i<=n;i++)
		{
			if(!seen[i])
			{
				System.out.println(i);
			}
		}
	}
}
