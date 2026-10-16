/*Find two missing numbers from a sequence
Input: arr = [1, 2, 4, 6], N = 6
Output: [3, 5]*/


class Array8 
{
	public static void main(String[]args)
	{
	int arr[]={1,2,4,6};
		int n=6;
		boolean seen[]=new boolean[n+1];
		int count=0;
		for(int i=0;i<arr.length;i++)
		{
			seen[arr[i]]=true;
		}
		for(int i=1;i<=n;i++)
		{
			if(!seen[i])
			{
				count++;
				if(count<=2)
				{
				System.out.println(i);
				}
			}
		}
	}
}