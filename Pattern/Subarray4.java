class Subarray4
{
	public static void main(String[]args)
	{
		int arr[]={ 2,4, 1, 6, 3, 8};
		int k=3;
		int count=0;
		int first=0;
		for(int i=0;i<=arr.length-k;i++)
		{
		     count=0;
			for(int j=i;j<i+k;j++)
			{
				if(arr[j]%2==0)
				{
					count++;
				}
			}
			System.out.print(count+" ");
	}
}}