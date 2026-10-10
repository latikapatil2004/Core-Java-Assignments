
class Subarray2
{
	public static void main(String[]args)
	{
		int arr[]={2, -1, -7, 8, -15, 30, 16, 28};
		int k=3;
		int sum=0;
		int first=0;
		int max=Integer.MIN_VALUE;
		for(int i=0;i<=arr.length-k;i++)
		{
			first=0;
			for(int j=i;j<i+k;j++)
			{
				if(arr[j]<0)
				{
					first=arr[j];
					break;
				}
			}
			System.out.print(first+" ");
		}
	}
}