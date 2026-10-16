/*
[x] Find a missing number from an unsorted array
Input: arr = [4, 1, 3, 5]
Output: 2 */

class Array6
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
