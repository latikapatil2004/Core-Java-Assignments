
class Qs44
{
	public static void main(String[]args)
	{
		int arr[]={1, 2, 3, 4, 5};
		int k=2;
		int j=0;
		int nums[]=new int[arr.length];
		for(int i=arr.length-k;i<arr.length;i++)
		{
			nums[j++]=arr[i];
		}
		for(int i=0;i<=k;i++)
		{
            nums[j++]=arr[i];
		}
		for( j=0;j<nums.length;j++)
		{
			System.out.print(nums[j]+" ");
		}
	}
}