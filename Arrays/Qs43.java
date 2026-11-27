class Qs42
{
	public static void main(String[]args)
	{
		int arr[]={1,2,3,4,4,3};
		int n=arr.length;
		int index=2;
		int nums[]=new int[n-1];
		for(int i=0;i<index;i++)
		{
			nums[i]=arr[i];
		}
		for(int i=index+1;i<arr.length;i++)
		{
			nums[i-1]=arr[i];
		}
		
	    for(int i=0;i<nums.length;i++)
		{
			System.out.println(nums[i]);
		}
	}
}
