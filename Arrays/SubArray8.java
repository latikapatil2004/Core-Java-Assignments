/*10. Count contiguous subarrays whose sum equals K
Input: arr = [1, 1, 1], K = 2
Output: 2*/



class SubArray8
{
	public static void main(String[]args)
	{
		int arr[]={1, 1, 1};
		
		int k=2;
		int count=0;
		for(int i=0;i<arr.length;i++)
		{
			int sum=0;
			for(int j=i;j<arr.length;j++)
			{
			sum=sum+arr[j];
			if(sum==k)
			{
				count++;
			}
		}
		}
		System.out.println(count);
	}
}
