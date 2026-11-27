/*Move all zeroes to the end while maintaining relative order.Input:
[0, 1, 0, 3, 12]


Output:
[1, 3, 12, 0, 0]*/


class Qs47
{
	public static void main(String[]args)
	{
		int arr[]={0, 1, 0, 3, 12};
		int j=0;
		int nums[]=new int[arr.length];
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]!=0)
			{
			nums[j++]=arr[i];
		}
		}
		while(j<arr.length)
		{
			nums[j++]=0;
		}
		for( j=0;j<nums.length;j++)
		{
			System.out.print(nums[j]+" ");
		}
	}
}

