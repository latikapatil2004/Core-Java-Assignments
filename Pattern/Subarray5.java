class Subarray5
{
	public static void main(String[]args)
	{
		int max=Integer.MIN_VALUE;
		int k=3;
		int arr[]={1, 3, -1, -3, 5, 3, 6, 7};
		for(int i=0;i<=arr.length-k;i++)
		{
		      max=Integer.MIN_VALUE;
			for(int j=i;j<i+k;j++)
			{
				if(arr[j]>max)
				{
					max=arr[i];
				}
			}
			System.out.println(" "+max);
	}
}
}